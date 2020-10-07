package com.JavaGenerics;

import java.util.Scanner;

public class MaxString {

	public static String Max(String x, String y, String z) {
		String max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 strings to find maximum");
		System.out.println("Enter first String");
		String x = sc.nextLine();
		System.out.println("Enter second String");
		String y = sc.nextLine();
		System.out.println("Enter third String");
		String z = sc.nextLine();
		System.out.println(Max(x, y, z));
		sc.close();
	}

}
