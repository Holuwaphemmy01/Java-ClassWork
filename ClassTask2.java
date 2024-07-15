import java.util.Scanner;
public class ClassTask2{
public static void main(String...args){

	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int number = scanner.nextInt();

	MondayFactorial reverse1 = new MondayFactorial();

	int reverse = reverse1.reverse(number);
	System.out.print(reverse);


}


}