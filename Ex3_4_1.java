import java.util.*;
public class Ex3_4_1 {
public static void main(String[] args) {
	System.out.println("������һ�����������ַ�����");
	Scanner sc = new Scanner(System.in);
	String  s = sc.next();
	
	
	StringBuffer b = new StringBuffer(s);
	if(b.reverse().toString().equals(s)){
	 System.out.println(s+"�ǻ���");
	}else {
		System.out.println(s+"���ǻ���");
		}
	}
}
