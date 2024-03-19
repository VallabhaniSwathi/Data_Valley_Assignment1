import java.util.*;
public class Overloaded {
	public int add(int x,int y) {
		return x+y;
	}
	public double add(double x,double y,double z) {
		return x+y+z;
	}
	public String add(String s1,String s2) {
		return s1+s2;
	}
	public static void main(String args[]) {
		Testoverload obj=new Overloadedtest();
		System.out.println(obj.add(50,40));
		System.out.println(obj.add(3.2,8.5,4.24 ));
		System.out.println(obj.add("Swathi", "Vallabhani"));
	}
}
