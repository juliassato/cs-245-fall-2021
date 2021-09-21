/*
	notes 3: quicksort
	julia sato for cs-245 [fall 2021]
	sept 20, 2021


	quicksort is kind of like merge sort, but has a very complicated divide step. easy merge step. 
	the divide step is called 'partition'. a 'pivot' .. all values move around it.  
	this is an 'in place' sort. it is very fast and merge sort rarely outperforms it. 

	> we need to pick a pivot (should be in the middle). theoretically put it in the middle. 
	> look at the other values. sort left if less/equal to pivot and rest to right. 
	> recursively sort the two sides. 

		+ pick a pivot + separate into subarrays + recursively sort left and right +

		+ partition, call quicksort	

	+ in quicksort everything occurs within the array. this is called an in-place sort. 

	partitioning : 
		- three reigons (partitions). left, right, pivot. 
			parameters: input array, range of array to partition, index of pivot
		1. while bottom < top 
			count up to find values that belong on the other side of the pivot (> pivot)
			count down to find values that belong on other side of pivot (<= pivot) 
			swap them
			repeat. 
		2. once bottom and top overlap, that is where the pivot goes. 
		3. that is what your pivot should be. swap them out. 

		move the pivot value out of the array.


	selecting a pivot : 
		- the most important. must take constant time, and must be median value. 
		- these goals (speed / accuracy ) contradict, so optimize for speed.

				:: implementations ::
			1. (fast) pick an arbitrary value.
			2. (fast?) pick the last value (saves 1 operation). !!! this is not good 
				  because if it's sorted it just is horrible. but good explaining.
				  if you do that it could be n^2
			3. (fast) pick a random value. (called 'randomized quicksort'. probably best shot. 
			4. (cool) pick maybe 5 values and find the median in O(1). 

	you are kind of finding the smallest value and putting it in its place and shrinking your search area ...? 

	
	++ runtime ++ 
	>  if you pick your pivot in the most ideal way (close to half as possible) :: n log n 
		we are making n comparisons and n/2 swaps in the worst case. 
	> if worst possible scenario (pivot is least or most value and needs to be swapped a lot)
		O(n^2) efficiency (not so good.) yikes
		+ if we consistently pick the wrong pivot, it can end up with n levels of recursion. 
			that is not good. 2^n/n! is the likelihood of the worst case, though.
			it's 


	stability: stable/unstable sorts
	if you can guarantee the order of duplicate values will be preserved, it is stable. 
	e.g. you have 2 5's and they stay in the same order once sorted (e.g. 5', 5")
	quicksort and selection sort are not stable. 
*/


class SortNotes{

	public static void main(String args[]){
		
		double [] arr0 = {54, 65, 84, 39, 59};

	}

	public static void quickSort(double [] arr, int bot, int top){
		if(bot < top){ // base case is top < bot is NOP (no operation, aka do nothing)
			int p = partition(arr, bot, top);
			quicksort(arr, bot, p - 1);
			quicksort(arr, p + 1);

		}
	}

	
	public static void partition(double [] arr, int left, int right){
		
	}


	public static void findMedian(int a, int b, int c){
		if(a < b && a < c){
			if(b < c)
			{ return c; }
			else
			{ return b; }
		}
		if(b < a && b < c){
			if(a < c)
			{ return a; }
			else
			{ return c; }
		}
		if(c < a && c < b){
			if(a < b)
			{ return a; }
			else
			{ return c; }
		}
	}


}
