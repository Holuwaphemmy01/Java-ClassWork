import java.util.Scanner;
public class ClassTask1{
public static void main(String...args){

	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int number = scanner.nextInt();

	MondayFactorial factorialnumber = new MondayFactorial();

	int factorial = factorialnumber.factorial(number);
	System.out.print(factorial);

}


}