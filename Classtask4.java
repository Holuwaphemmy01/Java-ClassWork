import java.util.Scanner;
public class ClassTask4{
public static void main(String...args){

	Scanner scanner = new Scanner(System.in);
	int sumEven = 0;
	int sumOdd = 0;

	for(int number = 1; number <= 10; number++){

		System.out.print("Enter a numbers: ");
		int numbers = scanner.nextInt();

		if(numbers % 2 == 0){
		sumEven += numbers;
			}		
		else if (numbers % 2 == 1){
		sumOdd += numbers;
				}
			}
	System.out.printf("Total sum of the even numbers is = %d%n", sumEven);
	System.out.printf("Total sum of the odd numbers is = %d%n", sumOdd);

}
	}