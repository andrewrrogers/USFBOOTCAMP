package com.company.arrays;

public class ArrayIntro {

	public static void main(String[] args) {
		//arrays are objects, a concept we will learn next week. it basically means
		//	it has its own states and behaviors. data in sequential order.
		int[] arr1 = new int[4];
		arr1[0]=2;
//		System.out.println(arr1[0]);
		
		int[] arr2 = {1,2,3};
		//other ways to decalre and arry
//		int [] arr2;
//		int arr2[];
//		System.out.println(arr1.length);
		for(int i = 0; i<arr1.length; i++) {
//			System.out.println(arr1[i]);
		}
		
		String[][] matrix = {
				{"francisco","griffin","star"},
				{"erica","ipad"},
				{"keata","aaron","andrew","kyle", "jez"}
				};
//		System.out.println(matrix[1][2]);
		
		for(int i = 0; i< matrix.length; i++) {
			for(int j =0; j<matrix[i].length; j++) {
				System.out.println(matrix[i][j]);
			}
		}
		
		
	}
}
