package Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

	/*
	 * quick sort on an array
	 * Range: 	-2,147,483,648 to 2,147,483,647 [range of int in java]
	 * 			 A-Z [Alphabetical range]
	 */
public class QuickSort {
	
	/**
	 * partition + swap algorithm 
	 * @param arr -> input array 
	 * @param index -> first array element [leftmost element]
	 * @param last -> last array element [rightmost element]
	 * @return -> return the position where partition is done 
	 */
	public static int partition(int arr[], int index, int last) {
		// choose the pivot [here it is the rightmost element(the last element in the array)]
		int pivot = arr[last];
		//pointer for greater element 
		int i = (index - 1);
		
		System.out.println("pivot = " + pivot + "\n" + "index = " + index + "\n" + "last = " + last);
		// traverse through all elements, compare each element with the pivot and swap to sort in ascending order (>=) for descending order 
		for (int j = index; j < last; j++) {
			if (arr[j] <= pivot) {							
				//if element is smaller then the pivot element then swap
				i++;
				
				// swap
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}
		 System.out.println("arr = " + Arrays.toString(arr));
		 // swapt the pivot element with the greater element specified by i 
		 int tmp = arr[i + 1];
		 arr[i + 1] = arr[last];
		 arr[last] = tmp;
		 
		 // return the position where partition is done 
		return (i+1);
	}
	
	/**
	 * the main quicksort method
	 * @param arr arr -> input array 
	 * @param index  -> first array element [leftmost element]
	 * @param last -> last array element [rightmost element]
	 */
	public static void qSort(int arr[], int index, int last) {
		if (index < last) {	
			/* find pivot element such that elements smaller then pivot are on left of pivot 
			 * and elements greater the pivot are on the right of pivot
			*/
			int pvt = partition(arr, index, last);
			
			// recursive call on the left of pivot 
			qSort(arr, index, pvt - 1);
			
			// recursive call on the right of pivot 
			qSort(arr, pvt + 1, last);
		}
	}
	
	/*
	 * sort on a list [ArrayList and LinkedList]
	 * Range: 	-2,147,483,648 to 2,147,483,647 [range of int in java]
	 * 			 A-Z [Alphabetical range]
	 */
	
	/**
	 * 
	 * @param lst -> input list
	 * @param index -> first array element [leftmost element]
	 * @param last -> last array element [rightmost element]
	 * @return -> return the position where partition is done 
	 */
	public static void partition(List<Integer> lst, int index, int last) {
		 if (index < last) {
		        int pivot = index;
		        int left = index + 1;
		        int right = last;
		        int pivotValue = lst.get(pivot);
		        
		        while (left <= right) {
		            // left <= to -> limit protection
		            while (left <= last && pivotValue >= lst.get(left)) {
		                left++;
		            }
		            // right > from -> limit protection
		            while (right > index && pivotValue < lst.get(right)) {
		                right--;
		            }
		            if (left < right) {
		                Collections.swap(lst, left, right);
		            }
		        }
		        Collections.swap(lst, pivot, left - 1);
		        partition(lst, index, right - 1);  
		        partition(lst, right + 1, last);    
		    }
		System.out.println("List = " + lst);
	}
	/**
	 * 
	 * @param arr arr -> input list 
	 * @param index  -> first array element [leftmost element]
	 * @param last -> last array element [rightmost element]
	 */
	public static void qSortList(List<Integer> lst) {
		partition(lst, 0, lst.size() - 1);
	}
	
	public static void main(String[] args) {
		
		int[] data = { 328, 27, 2, 1, 10, 999, 16 };
	    System.out.println("Unsorted Array");
	    System.out.println(Arrays.toString(data));

	    int size = data.length-1;

	    // call quicksort() on array data
	    QuickSort.qSort(data, 0, size);

	    System.out.println("Sorted Array in Ascending Order ");
	    System.out.println(Arrays.toString(data));
	    
	    System.out.println("============================================================\n");
	    System.out.println("Unsorted List");
	    Integer[] data2 = { 328, 27, 2, 1, 10, 999, 16 };
	    List<Integer> lst = Arrays.asList(data2);
	    
	    System.out.println(lst);
//	    QuickSort.partition(lst, 0, lst.size()-1);
	    
	    System.out.println("Sorted List");
	    QuickSort.qSortList(lst);
	    System.out.println(lst);
	}
}
