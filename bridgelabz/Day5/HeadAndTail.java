package com.bridgelabz.Day5;

import java.util.Scanner;

public class HeadAndTail {
	public static void main(String[] args) {
		int heads=0;
		int tails=0;
		int count=1;
		double randum=0.0;
		System.out.println("enter the number ");
		Scanner scan =new Scanner(System.in);
		int flips = scan.nextInt();
		
		while(count <= flips) {
			randum=Math.random();
			System.out.println(count+" "+randum);
			if(randum<0.5) {
				heads++;
				System.out.println(" heads ");
			}
			else {
				tails++;
				System.out.println(" Tails ");
			}
			count++;
		}
		System.out.println();
		System.out.println("Number of Heads :" +heads);
		System.out.println("Number of tails :" +tails);
		double headspercent = (double)heads/flips*100;
		double tailspercent = (double)tails/flips*100;
		System.out.println("percentage of Heads :" +headspercent);
		System.out.println("percentage of Tails :" +tailspercent);

	}

}
