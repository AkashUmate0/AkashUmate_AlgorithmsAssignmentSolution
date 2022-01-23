package practice.akashumate.services;

public class StockersActivity {
	
	public void showStockPriceInAscendingOrder(float[] stockPrices) {
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
		System.out.print("Stock prices in ascending order are :");
		print(stockPrices);
	}
	
	public void showStockPriceInDescendingOrder(float[] stockPrices) {
		float temp = 0;
		
		for(int i=0; i<=stockPrices.length; i++) {
			for(int j=i+1;j<stockPrices.length;j++) {
				if(stockPrices[i] < stockPrices[j]) {
					temp = stockPrices[i];
					stockPrices[i]= stockPrices[j];
					stockPrices[j] = temp;
				}
			}
		}
		System.out.println("Stock prices in descending order are :");
		print(stockPrices);
	}
	
	public void showStockPriceRoseCompaniesList(float[] stockPrices, Boolean[] isStockPriceRoseToday) {
		int count = 0;
		for(int i=0; i<stockPrices.length;i++) {
			if(isStockPriceRoseToday[i] == true) {
				count++;
			}
		}
		System.out.println("Total no of companies whose stock price rose today: "+count);
	}
	
	public void showStockPriceDeclineCompaniesList(float[] stockPrices, Boolean[] isStockPriceRoseToday) {
		int count = 0;
		for(int i=0; i<stockPrices.length;i++) {
			if(isStockPriceRoseToday[i] == false) {
				count++;
			}
		}
		System.out.println("Total no of companies whose stock price declined today: "+count);
	}

	public void print(float[] stockPrices) {
		for(int i=0; i<stockPrices.length; i++) {
			System.out.print(stockPrices[i]+" ");
		}
	}
	
}
