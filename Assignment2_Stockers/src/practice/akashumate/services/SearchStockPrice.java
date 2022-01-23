package practice.akashumate.services;

import java.util.Scanner;

public class SearchStockPrice {
	public static void search(float[] stockPrices) {
		try (Scanner scanner = new Scanner(System.in)) {
			stockPrices = arrengeInAscendingOrder(stockPrices);
			
			System.out.println("Enter the key value");
			float value = scanner.nextFloat();
			int arrSize = stockPrices.length;
			int result = BinarySearch.search(stockPrices, 0, arrSize-1, value);
			
			if(result == -1) {
				System.out.println("Stock of value "+value+" is not available");
			}else {
				System.out.println("Stock of value "+value+" is present");
			}
		}
	
	}

	private static float[] arrengeInAscendingOrder(float[] stockPrices) {
		float temp = 0;
			
		for(int i=0; i<=stockPrices.length; i++) {
			for(int j=i+1;j<stockPrices.length;j++) {
				if(stockPrices[i] > stockPrices[j]) {
					temp = stockPrices[i];
					stockPrices[i]= stockPrices[j];
					stockPrices[j] = temp;
				}
			}
		}
		return stockPrices;
	}
}
