package ForEachLoop;

import java.util.Scanner;

public class CountEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the number of elements that you want to check for odd or even");
		int i = sc.nextInt();
		int[] numbers = new int[i];
		for(i=0; i<numbers.length;i++) {
			System.out.print((i+1)+" Please enter the number: ");
			numbers[i] = sc.nextInt();
		}
		int count =0;
		for (int oddOrEven : numbers) {
			if(oddOrEven%2==0) {
				count++;
			}
		}
		System.out.println("There are "+count+" even numbers and "+(i-count)+" odd numbers in the list");

	}

}
