package stratProgramming;

import java.util.Scanner;

public class Hello {

	 public static void main(String[] args) {
		 //Scanner scanner = new Scanner(System.in);
		 
		 int[] array =  getIntegers();
		 quickSort(array);
		 printArray(array);
		 
		 
	 }
	 private static void printArray(int[] sortedDesArray) {
		// TODO Auto-generated method stub
		 System.out.println("Sorted Array in Descending Order is");
		 for(Object i:sortedDesArray) {
			 System.out.println(i);
		 }
		
	}

	/*
	 * private static int[] sortArrayDes(int[] intArray) { // TODO Auto-generated
	 * method stub int tempData = 0; for(int i = 0; i < intArray.length; i++) {
	 * tempData = intArray[i];
	 * 
	 * 
	 * } return null; }
	 */
	public static int[] getIntegers() {
		 Scanner scann = new Scanner(System.in);
		 System.out.println("Enter the length of array \r");
		 int arrayLength = scann.nextInt();
		 System.out.println("Enter the elements in array \r");
		 int[] getArray = new int[arrayLength];
		 for(int i = 0; i < arrayLength; i++) {
			 System.out.println("Element in index position " + i + " is \r ");
			 getArray[i] = scann.nextInt();
			 
		 }
		 scann.close();
		 return getArray;
	 }
	
	public static void quickSort(int[] array) {
		quickSort(array,0,array.length-1);
		
	}
	
	public static void quickSort(int[] array, int left, int right)
	{
		if(left >= right) {
			return;
		}
		
		int pivot = array[(left+right)/2];
		int index = partition(array,left,right,pivot);
		quickSort(array, left, index-1);
		quickSort(array, index, right);
	}
	
	public static int partition(int[] array, int left, int right, int pivot) {
		while(left <= right) {
			while(array[left]<pivot) {
				left++;
			}
			
			while(array[right] > pivot) {
				right--;
			}
			
			if(left <= right) {
				swap(array,left,right);
				left++;
				right--;
			}
		}
		
		return left;
	}
	public static void swap(int[] array, int left, int right) {
		// TODO Auto-generated method stub
		array[left] = array[left]+array[right];
		array[right] = array[left]-array[right];
		array[left] = array[left]-array[right];
		
	}
}
