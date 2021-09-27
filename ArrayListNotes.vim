
	notes 7: arraylists and linked lists (?) maybe 
	julia sato for cs-245 [fall 2021]
	sept 24, 2021

	unified modelling language(UML) 
	> we are using 'class diagram' with 3 components 
		+ name of class
		+ attributes
		+ operations/functions
	- visibility is indicated with +(public) -(private) !=(protected) and one more 
	<<interface>> : like an abstract class? 
		e.g. 
			List<T> must contain things of type <T>
			must have x y z methods
			+get(pos:int):T      => last item is return type

	interfaces cannot be instantiated on their own. you must instantiate a type 
	that implements that interface. 


	ArrayList 
		+ arraylist implements the <List> interface.
		+ all lists are zero based (start at zero)

	> professor is getting a headache over something with typing and java.
		because you need to declare an arraylist with a type 
		so you need to declare it as type Object
	public class ArrayList<T> implements List<T>

	get() in class ArrayList runs in O(1)
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
	size() 

