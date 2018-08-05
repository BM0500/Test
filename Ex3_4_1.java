import java.util.*;
public class Ex3_4_1 {
public static void main(String[] args) {
	System.out.println("请输入一个正整数或字符串：");
	Scanner sc = new Scanner(System.in);
	String  s = sc.next();
	
	
	StringBuffer b = new StringBuffer(s);
	if(b.reverse().toString().equals(s)){
	 System.out.println(s+"是回文");
	}else {
		System.out.println(s+"不是回文");
		}
	}
}
