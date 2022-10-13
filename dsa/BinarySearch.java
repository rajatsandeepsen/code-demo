package dsa;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 9, 9, 9, 20, 36, 48 };
		int target = 9;
		System.out.println(searchRange(arr, target));
		// System.out.println(binaraySearch(arr, target));
		// System.out.println(ceilingOfANumber(arr, target));
	    // char[] letters = {'c', 'f', 'j' , 'l', 'm'};
		// System.out.println(nextGreatestLetter(letters, 'l'));
		// System.out.println(floorOfANumber(arr, target));
	}

	static int binaraySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}

		// its not a good practice returning '-1' as a non-found element. But really
		// lazy ykyk.
		return -1;
	}

	// ceiling of a number basically means the smallest element in the array which
	// is greator than or equal to the target.
	static int ceilingOfANumber(int[] arr, int target) {
		//? int[] arr = {2, 4, 6, 9, 11, 14, 20, 36, 48};
		//? int target = 49;
		if (target > arr[arr.length - 1]) {
			return -1;
		}
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}

		// the while loop's breaking condintion is "start <= end". So after all these
		// checks the start pointer would come to the end and the end pointer would be
		// behind the start. Hence the smallest greatest element of the target would be
		// the start pointer.
		return start;
	}

	// floor of a number basically means the biggest element in the array which
	// is smaller than or equal to the target.
	static int floorOfANumber(int[] arr, int target) {
		//? int[] arr = {2, 4, 6, 9, 11, 14, 20, 36, 48};
		//? int target = 1;
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}

		// the while loop's breaking condintion is "start <= end". So after all these
		// checks the start pointer would come to the end and the end pointer would be
		// behind the start. Hence the biggest small element of the target would be
		// the end pointer.
		return end;
	}

	//leet code problem
	//Find the smallest letter greator than the target
	static char nextGreatestLetter(char[] letters, char target) {
		//char[] letters = {'c', 'f', 'j' , 'l', 'm'}
		//target = 'l'
		int start = 0;
		int end = letters.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < letters[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		System.out.println(start % letters.length);
		return letters[start % letters.length];
	}

	//leet code problem
	//Find First and Last Position of Element in Sorted Array
	static int[] searchRange(int[] arr, int target) {
		int[] ans = { -1, -1 };
		ans[0] = search(arr, target, true);
		ans[1] = search(arr, target, false);
		return ans;
	}
	//part of this problem
	static int search(int[] arr, int target, boolean isFirstIndex) {
		// int[] arr = { 2, 4, 6, 9, 9, 9, 20, 36, 48 };
		// int target = 9;
		int start = 0;
		int end = arr.length - 1;
		int ans = -1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				ans = mid;
				if (isFirstIndex) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return ans;
	}

}
