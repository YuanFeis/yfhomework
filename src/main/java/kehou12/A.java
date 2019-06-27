package kehou12;


import java.io.PrintWriter;
import java.io.StringWriter;

public class A {
	public static void main(String[] args) {
try {
	int x=Integer.parseInt(args[0]);
	int y=Integer.parseInt(args[1]);
	int m=x/y;
	System.out.println("java A "+Integer.parseInt(args[0])+" "+Integer.parseInt(args[1]));
	System.out.println(m);
} catch (NumberFormatException e1) {
	// TODO: handle exception
	System.out.println("java A "+Integer.parseInt(args[0])+" "+Integer.parseInt(args[1]));
    String info = getErrorInfoFromException(e1);  

    System.out.println(info);  
} catch (ArithmeticException e2) {
	// TODO: handle exception
	//System.out.println(e2);
	System.out.println("java A "+Integer.parseInt(args[0])+" "+Integer.parseInt(args[1]));
    String info = getErrorInfoFromException(e2);  

    System.out.println(info);  
}catch (Exception ex) {
	// TODO: handle exception
	System.out.println("java A "+Integer.parseInt(args[0])+" "+Integer.parseInt(args[1]));
    String info = getErrorInfoFromException(ex);  

    System.out.println(info);  
	
}
finally {
	System.out.println("always");
}
}
	 public static String getErrorInfoFromException(Exception e) {  
	        try {  
	            StringWriter sw = new StringWriter();  
	            PrintWriter pw = new PrintWriter(sw);  
	            e.printStackTrace(pw);  
	            return  " "+sw.toString() ;  
	        } catch (Exception e2) {  
	            return "bad getErrorInfoFromException";  
	        }  
	    }  
}