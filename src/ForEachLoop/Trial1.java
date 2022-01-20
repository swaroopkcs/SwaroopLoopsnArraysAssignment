package ForEachLoop;

import java.util.Scanner;

public class Trial1 {
//Check How many times a city is entered.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the number of cities that you want to enter");
		Scanner sc = new Scanner (System.in);
		int i = sc.nextInt();
		String[] cityNames = new String[i];
		String[] shortForm = new String [i];
		for (i=0;i<cityNames.length;i++) {
			System.out.println("Please enter the name of the city: "+(i+1));
			cityNames [i] = sc.next();
			System.out.println("Please enter the short form for the city: "+cityNames[i]);
			shortForm [i] = sc.next();
		}
		System.out.println("Please enter the city that you want to check: ");
		String cityName = sc.next();
		String sameCity = cityNames[0];
		int count =0;
		for (String match : cityNames) {
			if(match.equals(cityName)) {
				count++;
				 
			}
		}
		System.out.println("The number of times the city "+cityName+" is entered is "+count);

	}

}
