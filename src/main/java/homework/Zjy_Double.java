package homework;
import java.util.Scanner;

public class Zjy_Double {

	public static void main(String[] args) {
		double sum = 0;
		double ave;
		int count = 0;
		int k = 0;
		Scanner sc = new Scanner(System.in);
		double[] d = new double[10];
		/*
		 * for(double i:d) { i=sc.nextDouble(); d[k++]=i; sum=sum+i; }
		 */

		for (int i = 0; i < 10; i++) {
			if(!sc.hasNextDouble())return;// to solve the NoSuchElementException
			d[i] = sc.nextDouble();
			sum = sum + d[i];
	
		}

		ave = sum / 10;
		for (int i = 0; i < 10; i++) {
			if (d[i] > ave) {
				count++;
			}
		}
		System.out.println(ave);
		System.out.println(count);

	}
}
