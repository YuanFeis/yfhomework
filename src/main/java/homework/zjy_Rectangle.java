package homework;


class Rectangle{
	 
	double width;
	double height;
	Rectangle(){
		width=6;
		height=8;
		
		
	}
	double findPremeter(){
		double s;
		s=2*(width+height);
		return s;
	}
	
	
	
}



public class zjy_Rectangle {
    
     public static void main(String[] args) {
    	 Rectangle r= new Rectangle();
    	 System.out.println(r.findPremeter());
	}
}
