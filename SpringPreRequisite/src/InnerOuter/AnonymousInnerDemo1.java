package InnerOuter;

interface Greeting{
	void sayHello();
	void hi();
}
public class AnonymousInnerDemo1 {
	public static void main(String[] args) {
		Greeting g= new Greeting() {
			public void sayHello() {
				System.out.println("Hello from Anonymous Inner Class");
			}
			public void hi() {
				System.out.println("Hi from Anonymous Inner Class");
			}
		};
		g.sayHello();
        g.hi();
	}

}
