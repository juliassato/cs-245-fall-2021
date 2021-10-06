
	notes 7: arraylists and linked lists (?) maybe 
	julia sato for cs-245 [fall 2021]
	sept 24, 2021 :: oct 4, 2021 :: oct 6, 2021

	unified modelling language(UML) 
	> we are using 'class diagram' with 3 components 
		+ name of class
		+ attributes
		+ operations/functions
	- visibility is indicated with +(public) -(private) #(protected) ~(package) and one more 
	<<interface>> : like an abstract class? 
		e.g. 
			List<T> must contain things of type <T>
			must have x y z methods
			+get(pos:int):T      => last item is return type

	interfaces cannot be instantiated on their own. you must instantiate a type 
	that implements that interface. 

	uml uses dashed arrows to show implementation . uml is kind of odd bc of java

	ArrayList 
		+ arraylist implements the <List> interface.
		+ all lists are zero based (start at zero)

	> professor is getting a headache over something with typing and java.
		because you need to declare an arraylist with a type 
		so you need to declare it as type Object
	public class ArrayList<T> implements List<T> {} // way to implement the class
	> arr = (T[]) new Object[10]; // generates a warning. casting an object array to generic
	> arraylists can cause memory leaks (leaks are when too much data and it overflows and needs restart)
		prof says it's a good reason not to use arraylists. 

	get() in class ArrayList runs in O(1) ..... even if bad input, can't interact with user. just throws
	add() could fail if the array is full. so to compensate, the array is 
		copied into a bigger array if it is full! it makes a new array. 
		makes a new array by *2 and change the pointy point
		> we are not optimizing for space . for function!
		> best case is constant, worst is linear. 
		in actuality:
			n is amourtized over the arraylist. like for a mortgage
			prof says it is bullshit! constant 2 amourtized
			+ it's constant running time amourtized over the number of 
				elements in the array. 
	add() at index. shift all the items right by one and insert it at the place. 
	size() O(1)
	remove() O(n)



	iterators : O(n) 
	++ it has two main functions: hasNext() and next() ++ 
		these are the important ones. 
	- prof is saying put the file implementing iterator ..
		something about two classes in one file. 
		- declare inside same file as arraylist so that it can access all private data. 
		- putting it in the same files lets you get everything you need. 
		
		[ PRIVATE classes can access each other inside the same file ]
		- you make an iterator() function to return an instance of the iterator class
			and assigns it somewhere else. since it's a private class. 
			secrets !!

	enables while loops 
	> while loops are used for political reasons. 








