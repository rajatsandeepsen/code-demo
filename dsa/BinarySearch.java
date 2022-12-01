import java.util.Arrays;

// package dsa;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 18, 20, 21, 22, 25, 30, 5, 6, 8, 10, 12, 13, 14, 15, 17};
		int target = 8;
		// int[] arr = { 4, 5, 6, 7, 0, 1, 2, 3 };
		// int[][] arr2D = {
		// 		{ 10, 20, 30, 40, },
		// 		{ 15, 25, 35, 45, },
		// 		{ 28, 29, 37, 49, },
		// 		{ 33, 34, 38, 50, },
		// };
		// System.out.println(ans(arr, target));
		System.out.println(search(arr, target));
		// System.out.println(peakIndexOfMountainArray(arr));
		// System.out.println(countRotations(arr));
		// System.out.println(Arrays.toString(binarySearchin2DArr(arr2D, 5)));
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
		// ? int[] arr = {2, 4, 6, 9, 11, 14, 20, 36, 48};
		// ? int target = 49;
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
		// ? int[] arr = {2, 4, 6, 9, 11, 14, 20, 36, 48};
		// ? int target = 1;
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

	// leet code problem
	// Find the smallest letter greator than the target
	static char nextGreatestLetter(char[] letters, char target) {
		// char[] letters = {'c', 'f', 'j' , 'l', 'm'}
		// target = 'm'
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

	// leet code problem
	// Find First and Last Position of Element in Sorted Array
	static int[] searchRange(int[] arr, int target) {
		int[] ans = { -1, -1 };
		ans[0] = search(arr, target, true);
		ans[1] = search(arr, target, false);
		return ans;
	}

	// part of this problem
	static int search(int[] arr, int target, boolean isFirstIndex) {
		// int[] arr = { 2, 4, 6, 9, 11, 15, 16, 16, 16, 18, 20 };
		// int target = 16;
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

	// Amazon interview question
	// Find the position of an element in a sorted array of infinite numbers
	// dont use arr.length (I mean it shouldnt be used, cause its an infinite array)
	// assume that we know the size of the array(not the entire array but the array
	// which we're selecting (the chunks))
	static int ans(int[] arr, int target) {
		// first find the range of the chunks
		// so we're starting from size 2
		int start = 0;
		int end = 1;

		// condition for the target to lie in the range
		while (target > arr[end]) {
			// new start to increase the range of the chunks
			int newStart = end + 1;

			// double the box size
			// end = previous end + size of the box * 2
			// which means end = previous end + range of the chunks * 2

			// here adding a 1 is nothing but since these are indicies to get the actual
			// size we're adding a 1
			end = end + (end - start + 1) * 2;
			start = newStart;

		}
		return binaraySearchforInfiniteArray(arr, target, start, end);
	}

	// -----------part of this problem-------------
	static int binaraySearchforInfiniteArray(int[] arr, int target, int start, int end) {
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

	// leetcode problem : Peak index of mountain array
	// a mountain array which is a bitonic array is nothing but a combination of
	// ascending and descending numbers in one array
	// example = [2, 4, 5, 6, 3, 1] so heres the peak num is 6
	static int peakIndexOfMountainArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		// { 2, 4, 6, 9, 11, 15, 17, 18, 16, 14, 10, 8, 5, 1}

		while (start < end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] > arr[mid + 1]) {
				// youre in the decreasing part of the array this may be the answer but you have
				// to check
				// the right hand side also
				// this is why end is not equal to mid - 1;
				end = mid;
			} else {
				// youre at the ascending part of the array
				start = mid + 1;
				// because we know that mid + 1 element is greator than mid element
			}
		}
		// in the end, start == end and pointing to the largest number because of the 2
		// checks above.
		// start and end are always trying to find the max element in the above two
		// checks, hence when they are
		// pointing to just one element thats the max one cause thats what the checks
		// say.
		return start;
		// or return end it doesnt matter since both are same.
	}

	// leetcode problem : find in mountain array
	static int findInMountainArray(int[] arr, int target) {
		// { 2, 4, 6, 9, 11, 15, 20, 18, 16, 10, 8, 5, 3, 1 };
		// first find the peak element
		int peak = peakIndexOfMountainArray(arr);

		// search in the ascending part of the array
		int firstTry = orderAgnosticBs(arr, target, 0, peak);

		// if not found binary search in the descending part of the array
		if (firstTry != -1) {
			return firstTry;
		}
		return orderAgnosticBs(arr, target, peak + 1, arr.length - 1);
	}

	// part of this problem
	static int orderAgnosticBs(int[] arr, int target, int start, int end) {

		// here we check if its ascending or descending.
		boolean isAsc = arr[start] < arr[end];

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == target) {
				return mid;
			}

			if (isAsc) {
				if (target < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (target > arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}

		return -1;

	}

	// leetcode question find in rotated sorted array
	//{ 18, 20, 21, 22, 25, 30, 5, 6, 8, 10, 12, 13, 14, 15, 17};
	//target = 8;
	static int search(int[] arr, int target) {
		int pivot = findPivot(arr);

		// if you dont have a pivot, it means the array is not rotated
		if (pivot == -1) {
			// just do normal binary search
			return binaraySearchPassingStartandEnd(arr, target, 0, arr.length - 1);
		} else if (arr[pivot] == target) {
			return pivot;
		}
		// else if target >= start element
		else if (target > arr[0]) {
			return binaraySearchPassingStartandEnd(arr, target, 0, pivot - 1);
		}
		return binaraySearchPassingStartandEnd(arr, target, pivot + 1, arr.length - 1);
	}

	// part of this problem
	static int binaraySearchPassingStartandEnd(int[] arr, int target, int start, int end) {
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

	// part of this problem
	static int findPivot(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			// case 1
			// when you find that mid>mid+1 i,e it is the pivot (biggest element)
			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			// case 2
			// when you find that mid < mid-1 i,e mid-1 is the pivot
			else if (mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			// case 3
			// mid element <= start element. IN this case all elements from mid will be
			// smaller than start. hence we can ignore all these
			// elements since we're looking for peak i,e largest element.
			else if (arr[mid] <= arr[start]) {
				end = mid - 1;
			}
			// case 4
			// start element < mid element
			// so we know that bigger numbers may lies ahead of mid element
			else {
				start = mid + 1;
			}
		}
		return -1;
	}

	// leetcode problem: find the rotation count in Rotated sorted array.
	// lets say a rotated array = {4, 5, 6, 7, 0, 1, 2, 3};
	// the array before rotating is = {0, 1, 2, 3, 4, 5, 6, 7};
	// here you can see that the peak element 7 has came to the 3rd index of the
	// array. Which means its in the 4th position.
	// so you can say that the array has rotated 4 times. and the [answer 4 = pivot
	// + 1];
	static int countRotations(int[] arr) {
		int pivot = findPivot(arr);
		return pivot + 1;
	}

	// leetcode problem: split array largest sum
	static int splitArrLargestSum(int[] arr, int m) {
		int start = 0;
		int end = 0;

		for (int i = 0; i < arr.length; i++) {
			// in the end of the loop start will contain the largest element in the array
			start = Math.max(start, arr[i]);

			// sum of the array will contain in end
			end += arr[i];
		}

		while (start < end) {
			int mid = start + (end - start) / 2;

			// calculate how many pieces you can divide this in with this max sum
			int sum = 0;
			int pieces = 1;

			for (int num : arr) {
				if (num + sum > mid) {
					// you cannot add to this subarray, make new one
					// say you add this num in new subarray, then sum = num;
					sum = num;
					pieces++;
				} else {
					sum += num;
				}
			}

			if (pieces > m) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}

		// return either start or end cuz both will contain same element.
		return start;
	}

	// Binary Search in 2D array
	// 1) Binary search in sorted 2D array which is sorted in row wise and column
	// wise

	static int[] binarySearchin2DArr(int[][] arr, int target) {
		int row = 0;
		int col = arr.length - 1;

		while (row < arr.length && col >= 0) {
			if (arr[row][col] == target) {
				return new int[] { row, col };
			}
			if (arr[row][col] < target) {
				row++;
			} else {
				col--;
			}
		}
		return new int[] { -1, -1 };
	}

}
