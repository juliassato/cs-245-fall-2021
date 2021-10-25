/*
	notes 9: stacks 
	julia sato fall [2021]
	oct 13, 2021

		> the olive garden < 
	( the last time prof went was like 2018. )
		
		? what is the olive garden ? 
			they have caesar salads and breadsticks and pasta
			> pasta primavera > alfredo... ? olive garddn
		- buffet style. stacks of plates. 
			1. you pick up a plate
			2. you vibe check it
			3. repeat 1-2 until you get a clean one
		- the plates can only be taken out from the top

	s t a c k . . 
		+ useful for backtracking
		+ back and forth browser button
		+ redo undo .. reverse stuff
	stack is an interface (abstract .. ?) 
		+ push(T) > adds?
		+ pop() > takes off top, returns
		+ peek() > looks at next. no touchy
		+ empty() > returns true if empty


	postfix notation: arithmetic without parentheses. use stack !
		1. pop until operator
		2. apply operator
		3. push back onto stack

		int i = (2 + 5) * 7/ (3 - 1)
		2 5 + 7 * 3 1 - /




	[ implementation :: speed optimized ]
	
		array based stack (galles implementation) 
			push: O(1)
			pop: decrement top and return value
			peek: 
			empty: 
			[ all are O(1) ]
		
		linked list based stack (galles implementation)
			top is just a pointer ! to the topmost item
			adds to bottom of linked list. 
				first element points nnull
				next element points to first
				etc
			empty() just check if top points to null
			peek() return top.data ...
			pop() move pointers around. return elemnt

		?> he is writing a private node class inside the linklist stack 
			implementation. 
			h

*/




	
	

	
public interface Stack<T> {

	public void push(T item);
	public T pop() throws Exception; 
	public T peek() throws Exception;
	public boolean empty();

}

	

class Stacks implements Stack{

	/*
	// integer array implementation ? 
	public int top = 0;

	public Stacks(int size){
		int[] arr = new int[size];
	}

	public void push(){
		arr[top]
	}

	public int pop(){
		if(!empty())
			return null;
		else 
			return arr[--top];
	}	

	public boolean empty(){
		return top == 0;
	}

	public void peek(){
		if(top > 0) 
			return null;
		else 
			return arr[top - 1];
	}

	*/

	T [] arr;
	int top;

	protected void grow_array() {
		T[] newArr = (T[]) new Object[arr.length * 2];
		for(int i = 0; i < arr.length; i++){
			newArr[i] = arr[i];
		}
		arr = newArr;
	}

	public void push(T item) {
		if(top <=  arr.size) {
			arr[top++] = item;
		} else {
			grow_array();
			push(item);
		}
	}

	public T pop() throws Exception {
		if(empty())
			throw new Exception("Stack underflow");
		return arr[--top];
	}

	public T peek() throws Exception {
		if(empty())
			throw new Exception("Stack underflow");
		return arr[top - 1];
	}

	public boolean empty() {
		return top == 0;
	}





}





