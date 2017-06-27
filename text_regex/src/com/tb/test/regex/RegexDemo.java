package com.tb.test.regex;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	
	public static void main(String[] args){
		String str = "";
		String methodName = "";
		
		//手机号码
		str = "18002215176";
		methodName = "phone";
		//身份证
		str = "43112219800218311X";
		methodName = "IDCard";
		//邮箱
		str = "worldance@126.com.cn.edu.cd.cc";
		methodName = "email";

		Class c = RegExpression.class;
		try {
			Method method = c.getMethod(methodName);
			Pattern p = Pattern.compile((String)method.invoke(null));
			Matcher m = p.matcher(str);		
			System.out.println(m.matches());
			System.out.println(m.groupCount());
			for(int i=0;i<m.groupCount()&&m.matches();i++){
				System.out.println("分组："+i+"，值："+m.group(i));
			}
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
