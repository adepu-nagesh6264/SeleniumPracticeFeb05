package inheritancepack;

public class Son extends Grandfather{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Son s = new Son();
s.city();
s.country();
System.out.println(s.i);
	}
public void activities() {
	System.out.println("activity");
}
}
