package lab2;
import java.util.Scanner; 

public class labTwo {

	public static void main(String[] args) {
		Scanner userInput =new Scanner(System.in);
		char option;
		do
		{System.out.println("Welcome to Grand Circus' Room Detail Generator");
		System.out.println("Enter the Height and width of the room.");
		System.out.println("Enter Length:");
        double length;
        length=userInput.nextDouble();
		System.out.println("Enter width:");
		double width;
		width=userInput.nextDouble();
		double area=width*length;
		double perimeter;
		perimeter=2*(length*width);
		System.out.println("Area of the room: "+area);
		System.out.println("perimeter of the room: "+perimeter);
		  System.out.println("Do You Want To Continue (y/n)?: ");
            option=userInput.next().charAt(0);
		}
		while((option !='n')&&(option!='N'));
		
		
	}
		// TODO Auto-generated method stub

	}

