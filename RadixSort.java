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
		- how to know when stop ????? ???????????????????????????????????????????????/
	2. bucket ?????
		+ it is a list full of queues (linked lists or array lists) 
		+ OK... i will wing it 


*/

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

class RadixSort{

	public static void main(String args[]){ 
	
		int brizanIceCreamAddictionFund = 905; // there are 905 dollars in the brizan ice cream addiction fund. 
		int[] iceCreamPrices = new int[10]; // there are 50 purchaseable icecreams. 

		for(int i = 0; i < iceCreamPrices.length; i++)
		{ iceCreamPrices[i] = (int) (Math.random() * 100 + 1); } 

		for(int i : iceCreamPrices) { System.out.println(i); }

		LinkedList[] bucketlist = new LinkedList[10]; // ?? it is 10 buckets for integers 0-9. haha bucketlist
		
		for(int i = 0; i < 10; i++) // populate the list with lists
		{ bucketlist[i] = new <Integer>LinkedList(); }

	//+++++++++++++++++++++++++++++++++++++++++++++

		int digit = 0;
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < iceCreamPrices.length; j++){
				
				int placeValue = (int)(iceCreamPrices[j] / Math.pow(10,digit) % 10);
				bucketlist[placeValue].add(iceCreamPrices[j]);
				System.out.println("The place value is " + placeValue + " in iteration " + j + " of loop j.");
			}
			digit++;
		}

		for(LinkedList i : bucketlist){
			// System.out.print(i + " ");
			for(Object j : i) 
			{ System.out.print((int)j + " "); }
			System.out.println();
		}

	}

}
