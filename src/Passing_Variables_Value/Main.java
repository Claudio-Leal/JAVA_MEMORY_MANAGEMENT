package Passing_Variables_Value;

public class Main {

	public static void main(String[] args) {
		int localValue = 5;
		int newValue = calculate(localValue);
		System.out.println("Este é o novo valor de localValue: " + newValue + "!");
	}
	public static int calculate (int calcValue) {	
		calcValue = calcValue * 200;
		return calcValue;
	}
}
