public class Book{

	private String author;
	private String title;
	private boolean checkedOut = false; 

	public Book(String title, String author){
		this.title = title; 
		this.author = author;
	}


	public boolean borrowBook(){
		if(checkedOut){
			System.out.println("The book is already checked out!");
			return false; // operation failed
		}
		checkedOut = true; 
		return true; // operation successful
	}

	public boolean returnBook(){
		if(!checkedOut){
			System.out.println("What are you returning? We have this.");
			return false; // operation failed
		}
		checkedOut = false; 
		return true; // operation successful
	}

	public String isCheckedOut(){
		if(checkedOut){
			return " is checked out.";
		}
		return " is not checked out.";
	}

	public String toString(){
		return title + " by " + author; 
	}

}






public class Driver{
    public static void main(String[] args){
    	
	ToyBox toybox = new ToyBox();
	
	Toy toy1 = new Toy("Barbie", 15.5);
	Toy toy2 = new Toy("Doll house", 99.99);
	Toy toy3 = new Toy("Tea set", 149.99);
   
	toybox.addToy(toy1);
	toybox.addToy(toy2);
	toybox.addToy(toy3);

	toybox.printBox();
   }
}



public ArrayList noNegativity(int[] arr){
	<Integer>ArrayList positive = new <Integer>ArrayList();
	for(int i = 0; i < arr.length; i++){
		if(arr[i] > 0)
			positive.add(arr[i])
	}
	return positive; 
}

