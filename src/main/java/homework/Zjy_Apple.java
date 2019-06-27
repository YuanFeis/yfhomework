package homework;
 interface Eatable{
	void eat();
}
 abstract class Fruit{
	 String color;
	abstract public void msg() ;
 }
 class Apple extends Fruit implements Eatable{
    String name;
	@Override
	public void eat() {
		System.out.println("Apple can be eaten");
		
	}
	 public void msg() {
		 System.out.println("name="+name+", color="+color);
	 }
 }
public class Zjy_Apple {
public static void main(String[] args) {
	Apple a=new Apple() ;
	a.color="green";
	a.name="apple1";
	a.msg();
	a.eat();
}
}
