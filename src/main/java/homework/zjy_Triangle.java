package homework;

public class zjy_Triangle {
	public static void main(String[] args) {
		int row,i,k,j;
		for(row=1;row<=8;row++)
			/*
			 * row  controls the output 
			 * from the first line to the eighth  Column
			 * 
			 * */
		{
			for(i=1;i<=8-row;i++) {
				/*
				 * i  Control the Output of Left Spaces
				 * */
			System.out.print("  ");
			}
		  for(k=1;k<=row;k++) {
			  /*
			   * K controls the output of the left number
			   * */
			System.out.print(" "+k);
			}
		  for(j=row-1;j>=1;j--) {
			  /*
			   * J controls the output of the right number
			   * */
			System.out.print(" "+j);
			}
		   System.out.print("\n");
			
/*
 * row =6  i=3  k=5  
 * */
		}
}
}