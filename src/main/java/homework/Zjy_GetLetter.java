package homework;
import java.util.Scanner;

public class Zjy_GetLetter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     String s=sc.nextLine();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isLetter(c)) {
				sb.append(c);
			}
		}
		String se=new String(sb);
		System.out.println(se);
	}
}
