package com.trellis.energy.interview;

import org.testng.annotations.Test;

public class JavaProgrammingQuestions {

	/*
	 * Finding Factorial of a given number
	 */
	@Test
	public void findFactorialNum() {

		int num = 10;
		long fact = 1l;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}

		System.out.println(fact);
	}

	/*
	 * Finding occurrences of a character from a given string
	 */
	@Test
	public void findOccuranceOfChar() {

		String str = "GeeksforGeeks";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'k') {
				count++;
			}
		}
		System.out.println(count);
	}

	/*
	 * Display unique character from given string
	 */

	@Test
	public void findUniqueCharFromString() {

		String str = "GeeksforGeeks";

		for (int i = 0; i < str.length(); i++) {

			int flag = 0;

			for (int j = 0; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j) && i != j) {
					flag = 1;
					break;
				}
			}

			if (flag == 0) {
				System.out.println(str.charAt(i));
			}
		}
	}

	/*
	 * Display Repetitive characters from given string
	 */
	@Test
	public void findRepeatedCharFromString() {

		String str = "GeeksforGeeks";

		for (int i = 0; i < str.length(); i++) {

			int flag = 0;

			for (int j = 0; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j) && i != j) {

					flag = 1;
					break;
				}
			}
			if (flag == 1) {

				System.out.println(str.charAt(i));
			}

		}
	}

	/*
	 * Display reverse of a given string
	 */
	@Test
	public void reverseString() {

		String str = "Hello Houston";

		int i = 0;
		int j = str.length() - 1;

		char[] rString = new char[j + 1];

		while (i < j) {

			rString[i] = str.charAt(j);
			rString[j] = str.charAt(i);

			i++;
			j--;
		}

		System.out.println(String.valueOf(rString));
	}

	/*
	 * Print Fibonacci Series
	 */
	@Test
	public void printFibonacciSeries() {

		int n1 = 0, n2 = 1, n3, count = 10;

		System.out.println(n1 + "\n" + n2);

		for (int i = 2; i < count; i++) {

			n3 = n1 + n2;

			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}
	}
	
	/*
	 * Display first occurrence of a character from give string
	 */
	@Test
	public void findFirstOccurenceOfCharacterFromString() {
		
		String str = "GeeksForGeeks";
		
		System.out.println(str.indexOf('e'));
		
	}
	
	/*
	 * Display second occurrence of a character from give string
	 */
	
	@Test
	public void findSecondOccurenceOfCharacterFromString() {
		
		String str = "GeeksForGeeks";
		
		System.out.println(str.indexOf('e', str.indexOf('e')+1));
	}
	
	/*
	 * Display third occurrence of a character from give string
	 */
	@Test
	public void findThirdOccuranceOfCharFromString() {
		
		String str = "GeeksForGeeks";
		
		int occ= str.indexOf('e', str.indexOf('e', str.indexOf('e')+1)+1);
		
		System.out.println(occ);
	}
	
	/*
	 * Display fourth occurrence of a character from give string
	 */
	
	@Test
	public void findFourthOccurenceOfCharFromString() {
		
		String str = "GeeksForGeeks";
		
		int occ = str.indexOf('e', str.indexOf('e', str.indexOf('e', str.indexOf('e')+1)+1)+1);
		
		System.out.println(occ);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
