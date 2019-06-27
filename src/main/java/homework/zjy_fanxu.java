package homework;

public class zjy_fanxu {
	 static Boolean isfanxu(int a) {
		  int  bai,shi ,ge;
		  int fanxu;
		  bai=a/100;
		  shi= a%100/10;
		  ge=a%10;
		  if(ge==0)
			  return false;
		  fanxu=ge*100+shi*10+bai;
		  if(fanxu*a==280021) {
			  return true;
		  }
		  else{return false;}
	}
	 public static void main(String[] args) {
		
		 for(int i=100;i<1000;i++) {
			if(isfanxu(i)) {
				System.out.print(i+" ");
			}
			 
		 }
	}

}
