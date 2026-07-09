package LambdaExpressions;

interface Operation{
	int perform(int a,int b);
}

public class CalculatorLambda {

	public static void main(String[] args) {
		Operation add=(a,b)->a+b;
		Operation subtract=(a,b)->a-b;
		Operation multiply=(a,b)->a*b;
		
		System.out.println("Addition: "+add.perform(10, 5));
		System.out.println("Subtraction: "+subtract.perform(10, 5));
		System.out.println("Multiplication: "+multiply.perform(10, 5));
		

	}

}
