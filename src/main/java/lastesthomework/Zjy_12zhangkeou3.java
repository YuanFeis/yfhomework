package lastesthomework;

import java.io.FileOutputStream;

public class Zjy_12zhangkeou3 {
public static void main(String[] args) {
	byte[] buffer =new byte[1024];
	int n;
	try {
		n=System.in.read(buffer);
		FileOutputStream fout=new FileOutputStream("./a.text");
		fout.write(buffer);
		fout.close();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
