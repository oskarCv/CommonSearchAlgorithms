package algorithms.recusion;

public class Recursion {
	
	public void incrementByOne(int n){
		
		if(n < 5){//notice that we're checking the value of "n" if we don't do this we will run into a stack overflow error
			System.out.println("Call again to the same method");
			incrementByOne(n+1);//notice that this line is incrementing "n" 
		}
		System.out.println("We got the resoult");
	}
}
