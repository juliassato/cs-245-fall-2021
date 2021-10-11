/*
	notes 8: linked lists 
	julia sato for cs-245 [fall]
	oct 6, 2021, oct 11, 2021

	
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

	get function: iteratively accesses the variable stored in the node 'next' to find
		the desired item
	
	

	
	'i just want to know where to direct my middle finger.' - professor, in regards to the Health Check Requirement
	'maybe i was drunk when i made the slides.'


	constructor : head > null, items = 0 . no inputs
	>always starting at first node. 
	>functions include the null head check. 
		someone is going to forget it on the midterm .

	!! you must remember that removing from the head is special case !!! people died 
		special if statemement!!!!

	> don't forget to put checks for input in! <


	>> ITERATORS USED BC of holding place in list for searching. << 
		using them reduces runtime because you don't end
		up using get() which in a loop will give you a 
		quadratic n^2 runtime. 
		whereas with an iterator is constant/linear to retrive. 

		++ this is valuable because there are dif types of lists
			so you can implement a function without having to do 
			different ones for arraylist and linkedlist
			+ since you may not know what type of list you have
				, but they both extend List. polymorphism


	why can't we just put one more pointer to the last item? aren't we the ones implementing it 

	problems: get is O(n), inserting removing from head is specialcase and can be fucked up 
		> we ffix with binary search trees

	oh. doubly linked list is a thing


	++ doubly linked list ++
	
	> can go back and fort
	> can delete things in constant time..
		without needing to O(n) to get previous
	 
	>! need extra space 
	>! have to maintain prev in add/remove
	
	in the LinkedList item itself, instead of just head and size,
		you can also store the tail. 
		> this gets complicated, lots of special cases for this. <


	++ dummy head linked list ++ 

	= construct with zero things on it
	= empty first node
	= simplifies code by getting rid of special case for 
		add and remove at the head of the list.
	= also slightly changes loops (index is different).


	++ circular linked list ++ 
	
	- last item points to the first item . round robin !!
	- can continually loop (though risk for infinite) 
	- difficult to reverse (get prev node) 
	- VERY useful in OS and stuff... 
		distributes cpu power between programs 
		!! :,) it do things
	
	
	java linkedlist implementation is a dll? 

*/		


class LinkedListNotes<T>{

	int size; 
	T next;

	public LinkedListNotes(){
		size = 0;
		next = null;
	}


	public void add (int pos, T item) { 
		
	}

	public void add (T item){

	}

	
	public void remove (int pos) { 
		
	}





















}










