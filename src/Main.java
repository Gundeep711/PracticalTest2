import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Shape> Shapes = new ArrayList<Shape>();

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int choice = 0;

		while (choice != 3) {
			// 1. show the menu
			showMenu();

			// 2. get the user input
			System.out.println("Enter a number: ");
			choice = keyboard.nextInt();

			// 3. DEBUG: Output what the user typed in
			System.out.println("You entered: " + choice);
			System.out.println();
			Scanner input = new Scanner(System.in);

			if (choice == 1) {
				System.out.println("Enter the side of Square ");
				double side = input.nextDouble();
				Square squareObj = new Square(side, "blue");
				Shapes.add(squareObj);
				squareObj.printInfo();

			} else if (choice == 2) {
				System.out.println("Enter the base of Triangle ");
				double base = input.nextDouble();
				System.out.println("Enter the height of Triangle ");
				double height = input.nextDouble();
				Triangle triangleObj = new Triangle(base, height, "green");
				Shapes.add(triangleObj);
				triangleObj.printInfo();
			} else if (choice > 3) {
				System.out.println("Invalid Choice!");
			} else {
				
				if (Shapes.size() > 0) {
					for (int i = 0; i < Shapes.size(); i++) {
						System.out.println("List of Shapes and their Dimensions and Area : ");
						Shapes.get(i).printInfo();
						
					}
				}
			}
		}
	}

	public static void showMenu() {
		System.out.println("AREA GENERATOR");
		System.out.println("==============");
		System.out.println("1. Square");
		System.out.println("2. Triangle");
		System.out.println("3. Exit");
	}

}
