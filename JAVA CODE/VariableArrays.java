package studyopedia;

public class VariableArrays {

    public static void main(String[] args) {
        // Run the block-wise execution
        variable();
        instanceVariableDemo();
        staticVariableDemo();
    }

    // *********************** 1. Variables ***************************

    // Definition: Variables are containers for storing data values.

    /* In Java, every variable must be declared before it can be used.
     * A variable's type determines what kind of data it can hold.
     * 
     * There are 3 Types of Variable:
     * 1. Local Variables
     * 2. Instance Variables
     * 3. Static Variables
     */

    // ------------------------ 1. Local Variable

    // Declared inside a method or block.
    // Accessible only within that method or block.

    public static void variable() {
        // Call the method to demonstrate a local variable
        myMethod();
    }

    public static void myMethod() {
        int localvar = 10; // Local variable
        System.out.println("Local variable: " + localvar);
    }

    // ----------------------- 2. Instance Variable

    // Declared inside a class but outside any method.
    // Associated with an instance of the class and can be accessed by all methods.

    public static void instanceVariableDemo() {
        MyClass myObject = new MyClass(); // Create an instance of MyClass
        myObject.display(); // Call the display method
    }

    // Separate class to demonstrate instance variables
    static class MyClass {
        int instanceVar = 30; // Instance variable

        public void display() {
            System.out.println("Instance variable: " + instanceVar);
        }
    }

    // ---------------------- 3. Static Variables

    // Declared with the static keyword inside a class.
    // Shared among all instances of the class.

    public static void staticVariableDemo() {
        StatClass.display(); // Directly call the static display method
    }

    // Separate class to demonstrate static variables
    static class StatClass {
        static int staticVar = 50; // Static variable

        public static void display() {
            System.out.println("Static variable: " + staticVar);
        }
    }
}
