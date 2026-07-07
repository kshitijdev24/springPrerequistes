package Chaining;

// Parent class
class PDemo {

    // Parent default constructor
    PDemo() {
        System.out.println("PDemo Default Constructor");
    }

    // Parent parameterized constructor
    PDemo(String str, String str1) {

        // Calls the default constructor of the same class
        // this() must always be the first statement
        this();

        System.out.println("PDemo Parameterized Constructor");
    }
}

// Child class of PDemo
class Demo extends PDemo {

    // Default constructor
    Demo() {

        // Calls another constructor of the same class
        // Constructor chaining using this()
        this(10);

        System.out.println("Demo Default Constructor");
    }

    // Parameterized constructor
    Demo(int a) {

        // Calls the parameterized constructor of the parent class
        // Constructor chaining using super()
        super("str1", "str2");

        System.out.println("Demo Parameterized Constructor");
    }
}

// Child class of Demo
public class ChainingConst extends Demo {

    // Default constructor
    ChainingConst() {

        // Calls the default constructor of Demo
        super();

        System.out.println("ChainingConst Constructor");
    }

    public static void main(String[] args) {

        // Creating object
        ChainingConst obj = new ChainingConst();
    }
}