package assignment2;
import java.util.Scanner;
public class TestDemo {

	public static void main(String[] args) {
		System.out.print("Enter 3 numbers: ");	
		Scanner input = new Scanner(System.in);		//take input from user
	    int P = input.nextInt();
	    Scanner input1 = new Scanner(System.in);
	    int C = input1.nextInt();
	    Scanner input2 = new Scanner(System.in);
	    int M = input2.nextInt();
	    if( P == 0 || C==0 || M==0)		//check if any or all of the entered number is zero
	    	System.out.println("One or All of the value entered is/are Zero"); 
	    else if (P > 0 || C > 0 || M > 0)	//check if any or all of the entered number is positive
	    	System.out.println("One or All of the value entered is/are Positive"); 
	    else 		
	    	System.out.println("One or All of the value entered is/are Negative"); 
	    int avg = (P+C+M)/3;		//find avg of 3 numbers entered
	    if(avg>=70)		
	    	System.out.println("Grade is A");
	    if(avg>=61 && avg<70)
	    	System.out.println("Grade is B");
	    if(avg<61)
	    	System.out.println("Grade is C");
	    }
}
	   