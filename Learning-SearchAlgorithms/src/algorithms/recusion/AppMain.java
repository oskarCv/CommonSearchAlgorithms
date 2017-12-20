package algorithms.recusion;

public class AppMain {

	public static void main(String[] args) {
		/*Recursion recursion = new Recursion();
		recursion.incrementByOne(0);*/
		RecursiveLinearSearch linearSearch = new RecursiveLinearSearch();
		int a[]={1,5,6,8,9,10,25,11};
		
		linearSearch.linearSearch(a, 13, a.length-1);
	}

}
