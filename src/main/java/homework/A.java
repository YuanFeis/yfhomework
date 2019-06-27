package homework;



public class A {
	
public static void main(String[] args) {
	String str1 = "";String str2 = "";
	try {
		 str1=args[0]; 
		 str2=args[1];	 if(args.length!=2) {	 str1 = ""; str2 = ""; throw new ArrayIndexOutOfBoundsException();	 }
		int res=Integer.parseInt(str1)/Integer.parseInt(str2);
		System.out.println("java A"+" "+ str1 +" "+str2);
		//System.out.println(res);
		//System.out.println("always");
		
	} catch (NumberFormatException e) {
		// TODO: handle exception
		System.out.println("java A"+" "+ str1 +" "+str2);
		//e.printStackTrace();
		System.out.println("always");
		}catch (ArithmeticException e1) {
		// TODO: handle exception
		System.out.println("java A"+" "+ str1 +" "+str2);
		//e1.printStackTrace(); 
		
		System.out.println(" always");
	} catch (Exception ex) {
		System.out.println("java A"+" "+ str1 +" "+str2);
		System.out.println("always");
		System.out.print("Exception in thread \"main\" " );
		ex.printStackTrace();
		
	}
}
}
