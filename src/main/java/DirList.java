
import java.io.File;
import java.io.FileInputStream;

public class DirList {

	public static void main(String[] args) {
		String str1 = "eeat";
		// TODO Auto-generated method stub
		try {
			File dir = new File("/1056319297");// p1056319297
			System.out.println(dir.isFile());

//			byte[] buffer=new byte[1024];
//			FileInputStream fin=new FileInputStream(dir);
//			int data = fin.read(buffer);
//			String str=new String(buffer,0,data);
//			System.out.println(str);
			/*
			 * File test =new File(dir,"test.txt"); test.createNewFile();
			 * str1=test.getAbsolutePath(); System.out.println(str1);
			 */

			String[] files = null;
			if (dir.exists()) {
				files = dir.list();
				for (int i = 0; i < files.length; i++) {
					System.out.println(files[i]);
				}
			} else {
				System.out.println("problem");
			}

		} catch (Exception e) {
			// TODO: handle exception

			System.out.println(e.getMessage());
		}
	}

}
