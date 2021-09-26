/*

	notes 5: [lab] implemetation of Radix Sort to solve an assigned lab. 
	julia sato for cs-245 [fall 2021]
	sept 24, 2021

	input: the list of ice cream bar prices!
		type == an unsorted integer array of numbers greater than zero.
	
	preconditions: 
		input array between 1 and 10^5 length
		cost of bar is between 1 and 10^5
		professor has money between 1 and 10^8

	output: how to buy the most ice cream bars, and how many.
		type == the indices of the ice cream bars. 
			&& the int total ice creams. 

	++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

       - we are breaking numbers down into their individual integers and sorting them 
          first sort by ones digit into a 'bucket'. the order is maintained with FIFO .. important
                
                + sort by ones digit into 'bucket', maintaining order +
                + sort by tens digit into 'bucket', maintaining order +
                + next by hundreds . if no digit, put in zero 'bucket'

	
	1. how to get the individual digits? 
		+ divide by multiples of 10 to put desired digit in ones place
		+ modulo by 10
	2. bucket ?????
		+ it is a list full of queues (linked lists or array lists) 
		+ 


*/

class RadixSort{

	public static void main(String args[]){ 
	
	int number = 1234;

	System.out.println("here is a 4 digit number % 10: " + number % 10);
	System.out.println("here is a 4 digit number / 10 % 10: " + number/10 % 10);


	}

	

	// public static int getDigit(int a){
		// i am trying to make a recursive getter of digits.
		// but it actuallly just modulos 
		// i abandon this function. 
	// }



}
