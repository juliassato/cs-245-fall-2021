public class scratchpaper3{

	public static void main(String args[]){

	System.out.println(multiply(3,2));

	//	primeNext(1);
	}

	public static void primeNext(int a){
if(isPrime(a))
System.out.println(a);
primeNext(a+1);
}

	public static boolean isPrime(int num) {
  int count = 0;
  for(int i = 2; i < num; i++) {
     if (num % i == 0) {
        count++;
     }
  }
  if(count > 0) {
     return false;
  }
  return true;
}


public static int multiply(int x, int y){
	if(y == 0)
		return 0;
	return x  = x + multiply(x, y-1);
}





}
