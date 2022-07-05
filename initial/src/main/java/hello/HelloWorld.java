package hello;

public class HelloWorld {
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());
		Test test = new Test();
		test.problem(args[1]);
		test.good(args[1]);
	}
}
