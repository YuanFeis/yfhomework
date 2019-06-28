package lastesthomework;

import java.io.FileInputStream;


public class Zjy_12kehou4 {
public static void main(String[] args) {
	byte[] buffer=new byte[1024];
    try {
		FileInputStream fin=new FileInputStream("Zjy_12kehou4.java");
		int data = fin.read(buffer);
		String str=new String(buffer,0,data);
		System.out.println(str);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
