package homework;

public class zjy_qiurunnian {
  public static Boolean isrun(int i) {
	  if((i%4==0)&&(i%100!=0)){
		  return true;
	  }
	  if(i%400==0) {
		  return true;
	  }
	  return false;
  }
  public static void main(String[] args) {
	for(int i=2011;i<=2020;i++) {
		if(isrun(i)) {
			System.out.print(i+" ");
			
		}
	}
}
}
