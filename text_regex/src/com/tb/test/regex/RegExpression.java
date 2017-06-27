package com.tb.test.regex;

public class RegExpression {
	
	/**
	 * 手机号码正则表达式
	 * 规则：
	 * 	1.号码长度11位
	 *  2.第一位为1
	 *  3.第二位为3、4、5、7、8
	 * @return
	 */
	public static String phone(){
		String str = "";
		str+="^(((1)[34578]))\\d{9}$";		
		return str;
	}
	
	/**
	 * 身份证ID正则表达式
	 * 规则：
	 *   1.长度为15或18位
	 *   2.18位时，最后一位可为大写“X”
	 *   3.第一位不为0.
	 *   4.满足校验规则(未实现)
	 * @return
	 */
	public static String IDCard(){
		String str = "";
		str+="^[1-9](([\\d]{14})|(\\d{16}[\\dX]))$";
		
		return str;
	}
	/**
	 * 邮箱正则表达式
	 * 规则：xxxx@xxx.xx.xx
	 *  1.第一个字符为字母
	 *  
	 * @return
	 */
	public static String email(){
		String str = "";
		str+="^([a-zA-Z]\\w*)@(\\w+)(\\.\\w+)+$";
		str = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
		return str;
	}
	
	public static String httpUrl(){
		String str = "";
		
		return str;
	}

}
