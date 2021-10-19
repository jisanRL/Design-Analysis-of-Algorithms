package Iteration;

import java.util.Arrays;

/*
 * https://www.geeksforgeeks.org/three-way-partitioning-of-an-array-around-a-given-range/ -> do this later 
 * This is Quicksort with 3-way partition
 * Incremental algorithm
 */
public class TriPartition {
	
	/**
	 * partitions the array in three parts
	 * Approach: choose two pivots in array and swap. 
	 * 			 elements before index come first, 
	 * 			 elements in range of index and last comes in the middle, 
	 * 			 elements above last apprear end. 
	 * @param arr -> input array 
	 * @param index	-> Pivot 1, right most array element
	 * @param last -> pivot 2, left most array element
	 */
	public static void triPartition(int arr[], int index, int last) {
		int len = arr.length;
		int strt = 0, end = len-1;		// pivots 	
		
		System.out.println(last + "\n" + index);
		System.out.println(strt + "\n" + end);
		System.out.println("UnSorted Array = " + Arrays.toString(arr));
		
		// traverse through the elements in the array 
		for (int i = 0; i <= end; i++) {
			// check element with lower pivot
			if (arr[i] < index) {
				// swap
				int tmp = arr[strt];
				arr[strt] = arr[i];
				arr[i] = tmp;
				strt++;
				i++;
			} else if(arr[i] > last) {
				int tmp = arr[end];
				arr[end] = arr[i];
				arr[i] = tmp;
				end--;
			} else {
				i++;
			}
		}
		System.out.println("Sorted Array = " + Arrays.toString(arr));
	} 
	
	/**
	 * does the quick sort here
	 * @param arr
	 * @param index
	 * @param last
	 */
	public static void qSort(int arr[], int index, int last) {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 4, 9, 4, 4, 1, 9, 4, 4, 9, 4, 4, 1, 4};
		int arr2[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
		int size = arr.length;
		
		triPartition(arr, arr[0], arr[size-1]);
		System.out.println("\n");
		triPartition(arr2, arr[0], arr[size-1]);
	}

}
