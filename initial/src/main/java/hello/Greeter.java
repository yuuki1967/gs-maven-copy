package hello;

class Test {
	public void problem(String arg) {
		if (arg.isEmpty())
		;
		{
			System.out.println("Empty argument");
		}
	}
	
	public void good(String arg){
		if (arg.isEmpty()) {
			System.out.println("Empty argument");
		}
	}
}

public class Greeter {
	public String sayHello() {
		return "Hello world!";
	}
}
