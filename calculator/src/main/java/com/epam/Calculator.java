package com.epam;
import java.util.Scanner;
public class Calculator 
{
    private static Scanner input;

	public static void main( String[] args )
    {
        input = new Scanner(System.in);
        double num1,num2;
        int choice;
        while(true) {
        	System.out.println("\nMenu");
            System.out.println("1.Addition\n2.Subtraction\n3.Division\n4.Multiplication\n5.Exponent\n6.Modulo\n7.Exit");
            System.out.println("Select your choice:");
            choice=input.nextInt();
            if(choice<1 || choice>7)
            	System.out.println("Choose a valid operation....Try again!!");
            else if(choice==7)
            	System.exit(0);
            else {
            	double result;
            	System.out.println("Enter first number:");
            	num1=input.nextDouble();
            	System.out.println("Enter second number:");
            	num2=input.nextDouble();
            	Calculate cal=new Calculate(num1,num2,choice);
            	result=cal.apply();
            	if(choice==3 && result==-1000.0)
            		System.out.println("\nDivision By Zero not possible...Try again!!");
            	else
            		System.out.println("\nThe result of above operation is "+result+"\n");
            }
        }
    }
}
