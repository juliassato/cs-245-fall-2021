

public class temp{


public int pyramid(int rows){
	int total = 1; 
	if(rows > 1){ // while there are rows call pyramid w 1 less as input
		total += pyramid(rows - 1);
		return total + 8;
		}
	return total;
}


private void insuranceReduction(String str){
	switch (str): {
		case "Married": insurance *= .8; 
			break;
		case "Unmarried": insurance *= .85;

		default : System.out.println("String unrecognized, nothing was changed.");
	}
}


}
