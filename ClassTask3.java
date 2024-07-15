import java.util.Scanner;
public class ClassTask3{
public static void main(String...args){

	Scanner scanner = new Scanner(System.in);

	int largest = 0;
	int smallest = 0;
	for(int number = 1; number <= 4; number++){
	System.out.printf("Enter a number%d: ", number);
	int userInput = scanner.nextInt();

	if (userInput > largest){
		largest = userInput;
		}
	else if (userInput > smallest && userInput < largest){
		smallest = userInput;
		}
	
	}		
		System.out.println(largest);
		System.out.println(smallest);
}

}