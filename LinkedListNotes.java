/*
	notes 8: linked lists 
	julia sato for cs-245 [fall]
	oct 6, 2021

	
	++ linkedlists trade time for space. arraylists are faster but take up mad space. 
	
	memory leaks: empty space with nothing meaningful .. other things i missed
	
	zombie processes: become un.. from the original call
		zombie !! e.g. run video in chrome, close chrome, OS still thinks you need it 
		the process keeps running in the background. 
	the garbage collector: reclaims memory
	> want to create pieces of memory without creating big fragments of memory. just points somewhere
		to an individual node. 
	
	!!+ linkedlist only needs 2 attributes: pointer to first node (head) and number of items on the linkedlist.
		
	node : element in the list. when creating a node, the pointer is by default null. 

	it is good practice to write a constructor. linkedlist () { head = null; size = 0; }
	
	size function: public int size(){ return size } ...  


*/


class LinkedListNotes{

}
