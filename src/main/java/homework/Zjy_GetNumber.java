package homework;

public class Zjy_GetNumber {
public static void getnumber(int n) {
	if(n%7==0) {
		System.out.print(n+" ");
	}else {
	if(n%10==7) {
		System.out.print(n+" ");
	}}
	
	
}
public static void main(String[] args) {
	for(int i=1;i<100;i++) {
		getnumber(i);
	}
}
}
