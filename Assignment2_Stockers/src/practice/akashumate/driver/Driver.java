package practice.akashumate.driver;

import java.util.Scanner;

import practice.akashumate.services.StockersActivity;
import practice.akashumate.services.SearchStockPrice;

public class Driver {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			Boolean stopRepeat = true;
			StockersActivity stockersActivity = new StockersActivity();
			System.out.println("Enter the no of companies: ");
			int noOfCompanies = scanner.nextInt();
			
			float[] stockPrices = new float[noOfCompanies];
			Boolean[] isStockPriceRoseToday = new Boolean[noOfCompanies];

			for(int i=0; i<noOfCompanies; i++) {
				System.out.println("Enter current stock price of the company "+(i+1));
				stockPrices[i] = scanner.nextFloat();
				System.out.println("Whether company's stock price rose today compare to yesterday?");
				isStockPriceRoseToday[i] = scanner.nextBoolean();
			}
			
			System.out.println("-----------------------------------------------\n"
					+ "Enter the operation that you want to perform\n"
					+ "1. Display the companies stock prices in ascending order\n"
					+ "2. Display the companies stock prices in descending order\n"
					+ "3. Display the total no of companies for which stock prices rose today\n"
					+ "4. Display the total no of companies for which stock prices declined today\n"
					+ "5. Search a specific stock price\n"
					+ "6. press 0 to exit\n"
					+ "-----------------------------------------------"
			);
			
			int choice = scanner.nextInt();
			
			switch(choice) {
				case 1:stockersActivity.showStockPriceInAscendingOrder(stockPrices);
				break;  
				
				case 2:stockersActivity.showStockPriceInDescendingOrder(stockPrices);
				break;  
				
				case 3:stockersActivity.showStockPriceRoseCompaniesList(stockPrices, isStockPriceRoseToday);
				break;  
				
				case 4:stockersActivity.showStockPriceDeclineCompaniesList(stockPrices, isStockPriceRoseToday);
				break;  
				
				case 5:SearchStockPrice.search(stockPrices);
				break;  
				
				case 0:stopRepeat= false;System.out.println("Exited successfully");return;
				
				default:System.out.println("Invalid entry!");
			
			}
		}
		
	}
}
