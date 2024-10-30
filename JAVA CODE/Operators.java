package studyopedia;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arithmetic();
		//comparison();
		//logical();
		//bitwise();
		//unary();
		//Ternary();
		assignment();
	}
	// ------------------------ Java Opearators ---------------------------------
		
		// 1. Arithmetic Operators : Perform basic Mathematical Operations
		
		public static void arithmetic() {
			
			int a=10;
			int b=3;
			
			System.out.println("Addition: "+(a+b));
			System.out.println("Subtration: "+(a-b));
			System.out.println("Multiplication: "+(a*b));
			System.out.println("Division: "+(a/b));
			System.out.println("Modulus: " +(a%b));
		}	
	
		// 2. Comparison Operators: Compare two values, result is a boolean (true or false)
	
		public static void comparison() {
			
			int a=10;
			int b=5;
			
			System.out.println("Equal to: "+(a==b));
			System.out.println("Not equal to: "+(a != b));
			System.out.println("Greater than: "+(a>b));
			System.out.println("Less than: "+(a<b));
			System.out.println("Greater than or equal: "+(a>=b));
			System.out.println("Less than or equal: "+(a<=b));
		}
	
		// 3. Logical Opearators: Perform logical operations on boolean values
		
		public static void logical() {
			
			boolean x=true;
			boolean y=false;
			
			System.out.println("AND: "+(x&&y));
			System.out.println("OR: "+(x||y));
			System.out.println("NOT: "+(!y));
			
			System.out.println("(30<40) and (5>2)"+((30<40)&&(5>2)));
		}
		
		// 4. Bitwise: Operate on individual bits of integer types.
	
		public static void bitwise() {
			
			int a=5; // 0101 in binary
			int b=3; // 0011 in binary
			
			System.out.println("Bitwise AND: "+(a&b));
			System.out.println("Bitwise OR: "+ (a|b));
			System.out.println("Bitwise XOR: "+(a^b));
			System.out.println("Bitwise NOT: "+ (-a));
			
		}
	
		// 5. Unary Operators:Operate on a single operand
	
		public static void unary() {
			
			int a = 5;
			int b = -a;
			System.out.println("Unary Minus: " + b); // Output: -5
			System.out.println("Post-Increment: " + (a++)); // Output: 5, then a becomes 6
			System.out.println("Pre-Increment: " + (++a)); // Output: 7
			System.out.println("Post-Decrement: " + (a--)); // Output: 7, then a becomes 6
			System.out.println("Pre-Decrement: " + (--a)); // Output: 5
			
		}
		
		// 6. Ternary Operators:A shorthand for if-else statement
		
		public static void Ternary() {
				
			int a = 10;
			int b = 20;
			int max = (a > b) ? a : b;
			System.out.println("The maximum value is: " + max); // Output: 20	
			}
		
		// 7. Assignment Operators: Assign a Value to variables
		
			public static void assignment() {
						
				int a = 10;
				a += 5; // Same as a = a + 5
				System.out.println("After +=: " + a); // Output: 15
				a -= 3; // Same as a = a - 3
				System.out.println("After -=: " + a); // Output: 12
				a *= 2; // Same as a = a * 2
				System.out.println("After *=: " + a); // Output: 24
				a /= 4; // Same as a = a / 4
				System.out.println("After /=: " + a); // Output: 6
			}
	
	}


