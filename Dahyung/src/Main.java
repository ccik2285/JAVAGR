import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		Fruit fruit;
		
		if(input == 1) {
			fruit = new Peach();
			fruit.show();
		}
		else {
			fruit = new Banana();
			fruit.show();		
		}	
	}

}
