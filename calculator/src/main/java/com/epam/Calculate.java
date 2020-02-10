package com.epam;

public class Calculate{
	double num1,num2;
	int choice;
	Calculate(double num1,double num2,int choice){
		this.num1=num1;
		this.num2=num2;
		this.choice=choice;
	}
	public double apply() {
		if(choice==1)
			return Operations.addition(num1,num2);
		else if(choice==2)
			return Operations.subtraction(num1, num2);
		else if(choice==3)
			return Operations.division(num1, num2);
		else if(choice==4)
			return Operations.multiplication(num1, num2);
		else if(choice==5)
			return Operations.power(num1, num2);
		else if(choice==6)
			return Operations.modulo(num1, num2);
		return 0;
	}
}