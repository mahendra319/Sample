package com.ciginit.interveiw;

public class Cig_InterUI {

	/*
	 * WAP to remove duplicate values from a given strings / display unique values
	 */
	public static void main(String[] args) {

		String str = "cigniti";

		for (int i = 0; i < str.length(); i++) {

			int flag = 0;
			//int count =0;

			for (int j = 0; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j) && i!=j) {

					flag = 1;
					//count++;
					break;
				}

			}
			if (flag == 0) {

				System.out.println(str.charAt(i));
				//System.out.println(count);
			}
		}
	}
}