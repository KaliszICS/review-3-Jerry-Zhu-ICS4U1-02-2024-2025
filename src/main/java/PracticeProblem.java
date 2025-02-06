import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner(System.in);
		System.out.print("In: ");
		String phrase = input.nextLine();
		System.out.println(phrase.charAt(0));

	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		System.out.print("In: ");
		boolean trueFalse = input.nextBoolean();
		input.nextLine();
		System.out.println(!trueFalse);

	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		System.out.print("In: ");
		int num = input.nextInt();
		input.nextLine();
		System.out.println(num > 5);
		
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		System.out.print("In: ");
		double fracNum = input.nextDouble();
		input.nextLine();
		System.out.println(fracNum >= -2.0 && fracNum<= 2.0);

	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("In: ");
		String phrase = input.nextLine();
		System.out.println(phrase.equals("Hello World"));
	}

	public static void q6() {
		//Write question 6 code here
		Scanner input = new Scanner(System.in);
		System.out.print("In: ");
		int num1 = input.nextInt();
		input.nextLine();
		System.out.print("In: ");
		int num2 = input.nextInt();
		input.nextLine();
		System.out.println(num1 <= num2);
	}

	public static void q7() {
		//Write question 7 code here
		Scanner input = new Scanner(System.in);
		System.out.print("In: ");
		double fracNum1 = input.nextInt();
		input.nextLine();
		System.out.print("In: ");
		double fracNum2 = input.nextInt();
		input.nextLine();
		System.out.println(fracNum1 > fracNum2);
	}

}
