/*
	notes 6: stacks and queues 
	julia sato [fall 2021]
	sept 26, 2021

	stack: first in, last out. [FILO... sad chef]
		uses one index tracker that moves back and forth 
		can store n elements.
		
		empty stack : tracker at index -1
		_ _ _ _ _ _ _ _
	      ^

	    	things are added : tracker at last added
		1 3 6 2 4 _ _ _ 
		        ^ 
		
		the stack is full : 
		1 3 6 2 4 9 1 3
			      ^ 

	queue: first in, first out. [FIFO... happy chef]
		uses 2 trackers. if they overlap, the queue is empty.
		when you add something to the back, tracker b increments.
		when you take off front, tracker a increments. 
		
		++ you can store a maximum of n - 1 elements where n is 
			the length of the array ++ 
		
		empty queue : arrows in same place 	
		_ _ _ _ _ _ _ _  
		^ 
		^ 

		some things are added : second arrow ahead of last element
		2 5 3 _ _ _ _ _   
		^     ^   
		
		more things added, some taken : 
		_ _ 3 6 2 0 3 _ 
		    ^         ^ 

		the queue loops around !! : 
		_ _ 3 6 2 0 3 5
		^   ^
		
		the queue is full. : 
		9 _ 3 6 2 0 3 5 
		  ^ ^ 

	double ended queue 'deque': the same as the queue, but can add and remove
				from both sides of the queue. 
		> adding to queue is called enqueue, remove is dequeue. 

	 +? i think you have to write individual classes for a fancy queue. 
	 	?? but if this is true, why do we write these ourselves?
			it seems more error prone. 
		?? are there prewritten import things? 

	! professor said queues could be implemented with ArrayList or linked list. ! 
		so maybe that is the answer. 

	
	implementing these things: 

	stack: 
		initiate...
			+ int array[n]
			+ int stackIndexer
		methods..?
			+ add item (add, increment indexer)
			+ remove item ( rm, decrement) 
			+ is it full? (bool?) or build into add?

	queue: 
		initiate...
			+ int array[n]
			+ int leftIndex, int rightIndex
		methods...
			+ add to queue (move right index) 
				if at end. loop around.
				do not overlap with left index.
			+ remove from queue (move left index)
				if at end. loop around
				if overlapping with right, empty. 
				do not move past. 


	I HAVE DISCOVERED 	the queue interface
				
			forget all the other stuff 
			import java.util.Queue;
			
			import java.util.LinkedList;
			import java.util.ArrayDeque; << deque.. the double one
			import java.util.PriorityQueue << bypass other elements by priority
		
		+ declare the type of queue to prevent weird inputs and avoid casting. 
		+ insert with add method or offer method
			- add(x): throw exception if queue is full
			- offer(x): returns false if queue is full
		+ remove with one of two methods
			- poll(): return null if no elements
			- remove(): throw exception if no elements

		+ peek(): retrieve something from the queue without removing it
		+ contains(x): returns true or false. 

		+ clear(): remove everything!!!!!!!!!!!! 

		> you can iterate through it with an Iterator element hasNext(). 
		> you can also use a for each loop <
		> you can iterate with streams interface
	

*/

class StackQueueNotes{

	public static void main(String[] args){

		
	}


	public static void mockStackClass(int[] arr){
		
		int indexer = -1;

		// add something
		int itemToAdd = 5
		if(indexer + 1 < arr.length){
			indexer++;
			arr[indexer] = itemToAdd; // add 5
		}

		// remove something
		if(indexer - 1 > -1){
			indexer--;
			arr[indexer] = null;
		}

	}

}
