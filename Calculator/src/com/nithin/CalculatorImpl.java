package com.nithin;

public class CalculatorImpl implements Calculator{

	@Override

	public String add(int a, int b) {
		return "sum = "+ (a+b);
	}

	@Override
	public String sub(int a , int b) {
		return "Difference = "+ (a-b);
	}

	@Override
	public String mul(int a, int b) {
		return "Product = "+ (a*b);
	}

	@Override
	public String div(int a, int b) {
		if(b!=0) {
			return "Quotient = "+ (a/b);
		}
		else {
			return "Denominator is 0" ;
		}
	}

	@Override	
	public String displayErrorMessage(){
		return "Invalid Choice";
	}
}
