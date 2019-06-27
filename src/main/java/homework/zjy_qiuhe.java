package homework;
import java.util.Scanner;

public class zjy_qiuhe {
public static void main(String[] args) {
   
	int x, y,z,sum;
	float arg;
	Scanner s=new Scanner(System.in);
	x=s.nextInt();
	y=s.nextInt();
	z=s.nextInt();
	sum=x+y+z;
	arg=(float)sum/3;
	String a=String.format("%.2f", arg);
	System.out.println(sum);
	System.out.println(a);

}
}
