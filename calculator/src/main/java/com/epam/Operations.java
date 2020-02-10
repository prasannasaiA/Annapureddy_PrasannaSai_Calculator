package com.epam;

import java.lang.Math;

public class Operations{
	public static double addition(double num1,double num2) {
		return (num1+num2);
	}
	public static double subtraction(double num1,double num2) {
		return num1-num2;
	}
	public static double division(double num1,double num2) {
		if(num2==0.0)
			return -1000.0;
		return num1/num2;
	}
	public static double multiplication(double num1,double num2) {
		return num1*num2;
	}
	public static double power(double num1,double num2) {
		return Math.pow(num1, num2);
	}
	public static double modulo(double num1,double num2) {
		return (int) (num1%num2);
	}
}