
public class Zjy_12kehou7 {
	static int res;
public static void main(String[] args) {
	try {
		 res=comstr(args[0],args[1]);
		 System.out.println(res);
	
	} catch (ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception
		System.out.println("ArrayIndexOutOfBoundsException is catched");
	}
//	finally {
//		if(0==res) {
//			System.out.println("res = "+res+ " str1 = str2");
//			}else {
//				System.out.println("res = "+res+ " str1 != str2");
//			}
//	}
}

public static int comstr (String str1,String str2) throws ArrayIndexOutOfBoundsException{
	if((null==str1)||(null==str2)){
		throw new ArrayIndexOutOfBoundsException();
	}
	if(str1.equals(str2)) {
		return 0;
	}else {
		return 1;
	}
	
}

}
