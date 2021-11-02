/*
	notes 11: priority queues and heaps
	julia sato for cs 245 [fall 2021]
	nov 1, 2021
	

	prof's hospital metaphor problem: 
		figure out who is important at the door of the hospital
		and rank them in the queue by priority. 
		by severity of symptom, they are assigned to doctor and taken. 

		we are ranking by number. we want the highest priority person to be taken 
		in and seen first. 

	::  priority queue  ::
	
	+ insert(Comparable):void
	+ remove():Comparable
	+ empty():boolean
	
	we are optimizing for speed in this situation. 
		a balanced tree would be the best optimizing for insert, remove, and empty
		other implementations (array/list unsorted/sorted) have fallbacks to O(n)
		BST is not consistent in performance
		balanced tree will always be O(logn) for insert/remove and O(1) for empty

	here is the thing about b trees / balanced trees
		- difficult explaining to people, hard to maintain...
	he wants to use a binary tree stored in an array. 

	complete tree: looks like a perfect tree down to second to last level. all INTERIOR 
			nodes have 2 children. 
			on the last level the children are filled in left to right. 
			then can store things as an array. 
	

	:: heap :: implements priorityQueue? 
	
	a heap is a ** complete ** tree stored in an array.
	tree in order of priority . top to bottom
	Eytzinger's method: add items to array reading tree top-down left-right

	the tree is represented in the array.
	accessing children at parent index i: left- i*2+1 right- i*2+2
	accessing parent at child index i : (i-1)/2

	#1 priority: is it a complete tree? 
	#2 priority: is it in priority order? put
	
	insert: trivial because you just add at the first null position in the array
		, at count (?)
		> but you need to move it back up. so you might perform log(n) swaps (levels)
		  to get something from leaf to root. height of tree is logn so max swaps is logn

	max heap: higher numbers = higher priority
	min heap: lower numbers = higher priority
	
	remove: ? i am really lost  
		shiftdown -+ find highes priority child, recursively swap parent/child if necessary.
	


*/




class PriorityQueuesHeaps{


}




