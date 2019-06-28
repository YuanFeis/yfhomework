package lastesthomework;

import java.io.File;

public class Zjy_Getpath {
public static void main(String[] args) {
	File dirfile=new File("dir");
	dirfile.mkdirs();
	File file=new File(dirfile,"test.txt");
	String str=file.getAbsolutePath();
	System.out.println(str);
}
}
