package com.bridgelabz.Day5;

public class HarmonicNum {
	public static void main(String[] args) {

		// INITIALIZATION
		double result = 0, num = 0, j;
		int n;
		HarmonicNum u = new HarmonicNum();

		// INPUT DATA
		System.out.print("enter the harmonic you want to find: ");
		n = u.inputInteger();

		// COMPUTATION
		for (j = 1; j <= n; j++) {
			num = num + (1 / j);
			result = num;
		}
		System.out.println("the value of harmonic no. " + n + " is: " + result);

	}

	private int inputInteger() {
		// TODO Auto-generated method stub
		return 0;
	}
}
