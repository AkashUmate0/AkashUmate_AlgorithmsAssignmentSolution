package practice.akashumate.services;

public class BinarySearch {
	public static int search(float[] stockPrices, int left, int right, float valueToBeSearch) {
		
		if(right >= left) {
			int mid = (left+right)/2;
	
			if(stockPrices[mid] == valueToBeSearch) {
				return mid;
			}
			
			if(stockPrices[mid]>valueToBeSearch) {
				return search(stockPrices, left, mid-1, valueToBeSearch);
			}else {
				return search(stockPrices, mid+1, right, valueToBeSearch);
			}
		}
		return -1;
	}
}
