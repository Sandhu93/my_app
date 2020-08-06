package calc;
import java.util.Scanner;

public class adv_calc extends mul_div{
	static double userInput1;
	static double userInput2;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mul_div cal = new mul_div();
		System.out.print("Please Enter The First Number: ");
        userInput1 = input.nextDouble();
        System.out.print("Please Enter The Second Number: ");
        userInput2 = input.nextDouble();
        
        System.out.println( cal.add(userInput1, userInput2) );
        System.out.println( cal.sub(userInput1, userInput2) );
        System.out.println( cal.mult(userInput1, userInput2) );
        System.out.println( cal.div(userInput1, userInput2) );
        
        int base = 5;
        for(int x=0; x<6; x++) {
        	System.out.println(x + " " + Math.pow(base, x));
        }

	}

}
