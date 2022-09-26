package dsa;

public class OrderAgnosticBinarySearch {
	public static void main(String[] args) {
		//		int[] arr = {2, 4, 6, 9, 11, 14, 20, 36, 48};
		int[] arr = { 44, 33, 12, 5, 1, -66, -80 };
		int target = 12;

		System.out.println(orderAgnosticBs(arr, target));
	}

	

	//order agnostic BS which means we have a sorted array but we don't know if its sorted by ascending or descending.
	 static int orderAgnosticBs(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		
		//here we check if its ascending or descending. 
		boolean isAsc = arr[start] < arr[end];
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			
			if(arr[mid] == target) {
				return mid;
			}
			
			if(isAsc) {
				if(target < arr[mid]) {
					end = mid - 1;
				}else {
					start = mid + 1;
				}
			}else {
				if(target > arr[mid]) {
					end = mid + 1;
				}else {
					start = mid + 1;
				}
			}
		}
		
		return -1;
		
	}
}
