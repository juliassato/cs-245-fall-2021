/*

	notes 2: searches
	julia sato for cs-245 [fall 2021]
	sept 19, 2021

	contents: 

	> main
	> binary search binarySearch(int[], int);
		+ input a sorted array and target value.
		+ errors while writing
	> 

*/

class searchNotes{


	public static void main(String args[]){
		
		int[] test0 = {0, 5, 7, 8, 19, 23, 24, 26, 30, 35}; // an array of 10 random positive integers in ascending order 
		int[] test1 = {2, 7, 9, 9, 10, 13, 14, 16, 20, 35, 45}; // an array of 11 random positive integers in ascending order 
		
		int[][] test2d = new int[][] { 
				{0, 2, 3, 9},
				{2, 4, 5, 10},
				{-1, 0, 3, 6} };

		System.out.println("I have completed initializing the variables.");

		System.out.println( binarySearch(test0, 19) ); // should return 4 
		System.out.println( binarySearch(test1, 13) ); // should return 5 
		System.out.println( binarySearch(test0, 49) ); // should return -1

		printArr(test0);
		print2dArr(test2d);

	}



	public static int binarySearch(int[] arr, int target){	// accepts an integer array and a target value. assumes sorted. returns index of target

		// step 1: initialize two index variables to the first and last indexes in the array. 

		int indexL = 0; 
		int indexR = arr.length - 1; 
		int indexMiddle;

		// step 2: find the value between the L and R. if it is the target, return that. else, figure out if the 
		//	   desired value is bigger or smaller than that and move the L or R to trim off  half the values.
		// 	   repeat until the value is found or until the L moves past the R. 

		while(indexL <= indexR){
			
			indexMiddle = indexR / 2; 
			System.out.println("indexL: " + indexL + "indexR: " + indexR + "indexMiddle: " + indexMiddle);

			
			if(arr[indexMiddle] == target)
			{ return indexMiddle; }
			
			else if(arr[indexMiddle] > target)
			{ indexL = indexMiddle + 1; }
			
			else
			{ indexR = indexMiddle - 1; }

		}

		return -1; // if the target value is not found, return a negative value as indication.
	
		/*
			the mistakes i made writing this included: (but not limited to) 
			- initializing indexMiddle inside the loop
			- assigning indexMiddle = arr.length / 2; inside of the loop (causing sadness)
			- syntax errors for 2D arrays (not using new int[][] and {{},{},{}};)
			- trying to use while(!indexL > indexR) but java says no :-(
			- i used up all my milk

			what turned out okay: 
			+ the conditionals inside the loop were OK.
			+ i am using vim and not doing that badly. 
			+ i ate a lot of cereal today
			+ i think my code is easy to read and i learned a new search (pretty well, i think!)
			+ made lots of mistakes to not do later
		*/ 
	}


	public static void printArr(int[] arr){ // prints an integer array in format [ x x x x x ]
		
		System.out.print("[ ");

		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}

		System.out.print("]\n");
	}

	public static void print2dArr(int[][] arr){
		
		for(int i = 0; i < arr.length; i++){
			printArr(arr[i]);
		}

	}

}
