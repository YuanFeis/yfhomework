package homework;

class Student{
	String name;
	int number;
	String banji;
	static int count=0;
	public Student(String name, int number, String banji) {
		super();
		this.name = name;
		this.number = number;
		this.banji = banji;
		count++;
	}
	public Student(){
		this("s2",17102,"171");
	}
   public void getmes() {
	   System.out.print(name+", "+number+", "+banji+"; ");
	   
   }
	
}
public class zjy_Student {
	public static void main(String[] args) {
		Student s1=new Student("s1",17101,"171");
		Student s2=new Student();
	    s1.getmes();
	    s2.getmes();
	    System.out.println("count="+s1.count);
	}

}
