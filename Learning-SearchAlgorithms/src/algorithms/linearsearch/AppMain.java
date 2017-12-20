package algorithms.linearsearch;

public class AppMain {

	public static void main(String[] args) {
		LinearSearch linearSearch = new LinearSearch();
		int a[]={1,5,6,8,9,10,25,11};
		System.out.println(linearSearch.linearSearch(a, 10));
	}
}
