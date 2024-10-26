package studyopedia;

public class DATATYPES {

    public static void main(String[] args) {
        
    	// Call the runCell1 method
    	//primitive();
        //nonprimitive();
        //typeConversion();
    	Combining_data();
    }

    // Define the runCell1 method
    public static void primitive() {


        // *************** DATA TYPES ***********************************

        // --------------- 1. PRIMITIVE DATA TYPES
    	
    	System.out.println("Primitive Data Types: ");

        // 1. byte:
        byte b = 100;
        System.out.println("byte value :" + b);

        // 2. short
        short s = 30000;
        System.out.println("short value :" + s);

        // 3. integer
        int i = 100000;
        System.out.println("integer value: " + i);

        // 4. long
        long l = 1232233555L; // Note: It's good to add 'L' at the end for long literals
        System.out.println("long value: " + l);

        // 5. float
        float a = 3.41243f; // 'f' is required to specify that it's a float
        System.out.println("float value: " + a);

        // 6. double
        double d = 34.34334343;
        System.out.println("double value: " + d);

        // 7. char
        char c = 'A';
        System.out.println("Char Value: " + c);

        // 8. boolean
        boolean isJavaFun = true;
        System.out.println("boolean value: " + isJavaFun);
        }

    
        // ------------------- 2. Non-Primitive Data Types
    public static void nonprimitive(){
    	
    	System.out.println("Non-Primitive Data Types");
    	
        // 1. String : Represents a sequence of characters
        String messages = "Hello, Java";
        System.out.println("String message :" + messages);

        // 2. Arrays : Holds multiple values of the same type
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array first element :" + numbers[0]);

        // 3. Classes : Blueprint for creating classes
        // Creating the class
        class Car {
            String model = "Tesla";
            int year = 2024;
        }

        // Initializing the class
        Car myCar = new Car();

        System.out.println("Car Model :" + myCar.model);
        System.out.println("Model year of the car :" + myCar.year);
    }

        // ------------------- 3. Type Conversion
    
    public static void typeConversion() {
    	
    	System.out.println("Type Conversion : ");
    	
        // 1. Widening Conversion (Automatic): Converts smaller type to larger type
        int num = 100;
        double largenum = num; // int to double
        System.out.println("Widened value: " + largenum);

        // 2. Narrowing Conversion (Explicit): Converts larger type to smaller type
        double decimal = 9.8;
        int integerPart = (int) decimal; // double to int
        System.out.println("Narrowed value: " + integerPart);
    }


		// -------------------- 4. Combining Data types

	public static void Combining_data() {
		
		System.out.println("Combining Data Types: ");
		
		int age=24;
		float height = 5.9f;
		String name="Aiden";
		boolean isStudent=true;
		
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Height: "+height+"feet");
		System.out.println("Is a Student? "+ isStudent);
	}}
