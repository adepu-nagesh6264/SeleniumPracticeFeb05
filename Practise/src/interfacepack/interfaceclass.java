package interfacepack;

public class interfaceclass implements interfacedemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfaceclass ic = new interfaceclass();
		ic.test1();
		ic.test2();
ic.login();
interfacedemo id = new interfaceclass();
id.test1();
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("test1 method");
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("test2 method");
	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		System.out.println("test3 method");
	}

	@Override
	public void test4() {
		// TODO Auto-generated method stub
		System.out.println("test4 method");
	}

	@Override
	public void test5() {
		// TODO Auto-generated method stub
		System.out.println("test5 method");
	}

	public void login() {
		System.out.println("login page");
	}
}
