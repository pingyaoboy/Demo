package com.lhk.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式
 * @author pyboy
 *
 */
public class Regular {

	public static void main(String[] args) {
		new Regular().patten();
	}
	
	/**
	 * 识别"adf(dfd)(sd)",然后获取“adf(dfd)”、sd
	 */
	private void patten(){
		String pattern = "^.*\\((.*)\\)\\((.*)\\)$";
//		String pattern = ".*(\\(.*\\))(\\(.*\\))";
		String string = "22(5ssd)(dd)";
		// 创建 Pattern 对象
	      Pattern r = Pattern.compile(pattern);

	      // 现在创建 matcher 对象
	      Matcher m = r.matcher(string);
	      if (m.find()) {
			System.out.println("success");
			System.out.println(string.substring(m.start(2), m.end(2)));
		} else {
			System.out.println("fails");
		}
	}
	
	private void patten2(){
		 // TODO Auto-generated method stub
		   String str = "Hello,World! in Java.";
		   Pattern pattern = Pattern.compile("W(or)(ld!)");
		   Matcher matcher = pattern.matcher(str);
		   while(matcher.find()){
		    System.out.println("Group 0:"+matcher.group(0));//得到第0组——整个匹配
		    System.out.println("Group 1:"+matcher.group(1));//得到第一组匹配——与(or)匹配的
		    System.out.println("Group 2:"+matcher.group(2));//得到第二组匹配——与(ld!)匹配的，组也就是子表达式
		    System.out.println("Start 0:"+matcher.start(0)+" End 0:"+matcher.end(0));//总匹配的索引
		    System.out.println("Start 1:"+matcher.start(1)+" End 1:"+matcher.end(1));//第一组匹配的索引
		    System.out.println("Start 2:"+matcher.start(2)+" End 2:"+matcher.end(2));//第二组匹配的索引
		    System.out.println(str.substring(matcher.start(0),matcher.end(1)));//从总匹配开始索引到第1组匹配的结束索引之间子串——Wor
		   }
	}
}
