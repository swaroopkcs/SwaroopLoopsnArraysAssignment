package SwaroopLoopsnArraysAssignment;

import java.util.Scanner;

public class Question3Modified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] samsungModels = { "S20", "S21", "Flip3", "Fold3" };
		String[] googleModels = { "GooglePixel6", "GooglePixel6Pro ", "GooglePixelPro", "GooglePixel5" };
		String[] appleModels = { "Iphone12", "Iphone12mini", "Iphone11", "Iphone11mini" };
		System.out.println("Please enter the Brand Model that you want to see: Samsung, Google or Apple");
		Scanner sc = new Scanner(System.in);
		String product = "";
		boolean isProduct = false;
		String brandName = sc.next();
		switch(brandName) {
		case "Samsung": {
			System.out.println("These are the models available for Samsung");
			for (int i=0;i<samsungModels.length;i++) {
				System.out.println(samsungModels[i]);
			}
			System.out.println("Please enter the prduct that want to see");
			product = sc.next();
			int i;
			for(i=0;i<samsungModels.length;i++) {
				if (product.equals(samsungModels[i])) {
					isProduct = true;
					break;
				}
			}

			break;
			
		} 
		case "Google": {
			System.out.println("These are the models available for Google");
			for (int i=0;i<googleModels.length;i++) {
				System.out.println(googleModels[i]);	
			}
			System.out.println("Please enter the prduct that want to see");
			product = sc.next();
			int i;
			for(i=0;i<googleModels.length;i++) {
				if (product.equals(googleModels[i])) {
					isProduct = true;
					break;
				}
			}
			break;
		} 
		case "Apple": {
			System.out.println("These are the models available for Apple");
			for (int i=0;i<appleModels.length;i++) {
				System.out.println(appleModels[i]);
			}
			System.out.println("Please enter the prduct that want to see");
			product = sc.next();
			int i;
			for(i=0;i<appleModels.length;i++) {
				if (product.equals(appleModels[i])) {
					isProduct = true;
					break;
				}
			}
			break;
		} 
		default:
			System.out.println("Please enter a valid choice");
		}
		
		String productAvailable = isProduct? "Product selected is : "+product : "Please select a product from the list";
		System.out.println(productAvailable);
	}

}
