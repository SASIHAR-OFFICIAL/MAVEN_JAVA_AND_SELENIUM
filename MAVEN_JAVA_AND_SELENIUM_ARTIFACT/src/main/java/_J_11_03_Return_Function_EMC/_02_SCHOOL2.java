package _J_11_03_Return_Function_EMC;

import java.util.Scanner;

public class _02_SCHOOL2 {

	String Pass_or_Fail(int score) {

		if (score >=35) {
			return "Pass";
		}
		else {
			return "Fail";
		}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Total Mark = ");
		int mark = scan.nextInt();
		_02_SCHOOL2 obj = new _02_SCHOOL2();

		String result = obj.Pass_or_Fail(mark);
		System.out.println(result);
	}}
