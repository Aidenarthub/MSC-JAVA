package studyopedia;

public class Arrays_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		arrays_java();

	}
	public static void arrays_java() {
		
		
		// ------------------------ Arrays ---------------------------
		
		
// Arrays are used to store multiple values of the same data type in a single variable
	
// They are fixed in size, meaning you cannot change the length after creation.
	
	// Declaration of Array
		int[] myArray= {};
		
		System.out.println("Empty Array: "+ myArray);
		
		// printing dotted line
		System.out.println("---------------------------------------------");
	// Indexing
		
		String[] DataScience_Student= {"Sachin","Charan","Nithin"};
		
		System.out.println("Data Science Students\n");
		
		System.out.println("First Name : "+DataScience_Student[0]);
		
		System.out.println("Second Student : "+DataScience_Student[1]);
		
		System.out.println("Third Student : "+DataScience_Student[2]);
		
		// printing dotted line
		System.out.println("-------------------------------------------------");
		
		
	// Multiple values Printing 
		int[] arrays_values= {12,13,14,15,19,33,55};
		System.out.println("\nFirst Values:  "+arrays_values[0] + 
				"\nSecond  value  " +arrays_values[1]
						+"\nThird Value:  "+arrays_values[2]
								+"\nFourth Value: "+arrays_values[3]);	
		
	
	} 
}
