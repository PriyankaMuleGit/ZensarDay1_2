package Sorting;

import java.util.Scanner;

public class Sorting {
	public static void insertionSort(int arr[]) {
		int n = arr.length;
		for (int j = 1; j < n; j++) {
			int temp = arr[j];
			int i = j - 1;
			while ((i > -1) && (arr[i] > temp)) {
				arr[i + 1] = arr[i];
				i--;
			}
			arr[i + 1] = temp;
		}
	}

	public static void bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
	}

	public static void selectionSort(int[] arr) {
		int var; 
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			var = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[var]) {
					var = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[var];
			arr[var] = temp;

		}

	}

	public static void main(String a[]) {
		int[] arr1 = new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter elements in an array");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=s.nextInt();
		}
		System.out.println("Elements of an array");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+"  ");
		}
		System.out.println("\n");
		
		insertionSort(arr1);
		System.out.println("After Insertion Sort");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+"  ");
		}
		System.out.println();

		bubbleSort(arr1);
		System.out.println("After Bubble Sort");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+"  ");
		}
		System.out.println();

		selectionSort(arr1);
		System.out.println("After Selection Sort");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+"  ");
		}
	}
}