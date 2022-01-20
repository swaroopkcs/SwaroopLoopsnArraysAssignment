package SwaroopLoopsnArraysAssignment;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] samsungModels = { "S20", "S21", "Flip3", "Fold3" };
		String[] googleModels = { "GooglePixel6", "GooglePixel6Pro ", "GooglePixelPro", "GooglePixel5" };
		String[] appleModels = { "Iphone12", "Iphone12mini", "Iphone11", "Iphone11mini" };
		System.out.println("Please enter the Brand Models that you want to see:");
		System.out.println("Press 1 for Samsung");
		System.out.println("Press 2 for Google");
		System.out.println("Press 3 for Apple");
		Scanner sc = new Scanner(System.in);
		boolean isProduct = false;
		int choice = sc.nextInt();
		switch(choice) {
		case 1: {
			System.out.println("These are the models available for Samsung");
			for (int i=0;i<4;i++) {
				System.out.println(samsungModels[i]);
			}
			System.out.println("Please enter the prduct that want to see");
			String product = sc.next();
			int i;
			for(i=0;i<samsungModels.length;i++) {
				if (product.equals(samsungModels[i])) {
					isProduct = true;
					break;
				} else
					isProduct = false;
			}
			if (isProduct) {
				System.out.println("Product selected is : "+samsungModels[i]);
			}
			else {
				System.out.println("Please select a product from the list");
			}
			break;
			
		} 
		case 2: {
			System.out.println("These are the models available for Google");
			for (int i=0;i<4;i++) {
				System.out.println(googleModels[i]);	
			}
			System.out.println("Please enter the prduct that want to see");
			String product = sc.next();
			int i;
			for(i=0;i<googleModels.length;i++) {
				if (product.equals(googleModels[i])) {
					isProduct = true;
					break;
				} else
					isProduct = false;
			}
			if (isProduct) {
				System.out.println("Product selected is : "+googleModels[i]);
			}
			else {
				System.out.println("Please select a product from the list");
			}
			break;
		} 
		case 3: {
			System.out.println("These are the models available for Apple");
			for (int i=0;i<4;i++) {
				System.out.println(appleModels[i]);
			}
			System.out.println("Please enter the prduct that want to see");
			String product = sc.next();
			int i;
			for(i=0;i<appleModels.length;i++) {
				if (product.equals(appleModels[i])) {
					isProduct = true;
					break;
				} else
					isProduct = false;
			}
			if (isProduct) {
				System.out.println("Product selected is : "+appleModels[i]);
			}
			else {
				System.out.println("Please select a product from the list");
			}
			break;
		} 
		default:
			System.out.println("Please enter a valid choice");
		}

	}

}
