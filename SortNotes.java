/*
	notes 4: non comparison sorts
	julia sato for cs 245 [fall 2021]
	sept 22, 2021

	> it is not possible to have a sort faster than n log n for GENERAL sorting purposes. 
	> to go faster we have to assume things about the data. 
		e.g. everything in the array is an integer. 
		- and perhaps stability does not matter. 
		
		== counting sort == 
		case: n integers between 0 and 9
		+ we establish a list of counts of each number.
		+ we write the counts back to the original array. 
		? it is faster because it could be like O(n+k) which is less than n log n
	
	++ radix sort ++ 
	> n space, n*d speed? radix sort is fast but inefficient when it comes to space. 

	- we are breaking numbers down into their individual integers and sorting them 
	  first sort by ones digit into a 'bucket'. the order is maintained with FIFO .. important
		
		+ sort by ones digit into 'bucket', maintaining order +
		+ sort by tens digit into 'bucket', maintaining order +
		+ next by hundreds . if no digit, put in zero 'bucket'
	- the runtime is O(nd)
		n = # items in array
		d = max digits in key
		- this is assuming that add/remove items is O(1). 
		- it can be implemented with ArrayList or Queue.

	++++ info ++++
	lab on friday, 1 week later is the midterm. 
	the other days are ask questions i think 
	midterm is exclusively online. 

*/

class NonComparisonSortNotes{

	public static void main(String args[]){



	}



	public static void countingSort(int [] arr){
		
		int [] count = new int [k]; // prof says k is the max value in the array. wouldn't it be the length? 

		for(int i = 0; i < arr.length; i++)
		{ count[arr[i]]++; }


		// +++ writing back into the array +++

		for(int i = 0; i < arr.length; i++){ // this loops through the original array.
			
			while(count[i] > 0){
			
				arr[i] = 
			
			}

			
		}

		





	public static void radixSort(){

		
	}


	}



}
