package algorithms.binarysearch;

public class AppMain {

	public static void main(String[] args) {
		BinarySearch bSearch = new BinarySearch();
		//the array must be sorted before the bsearch method call.
		int a[]={1,5,6,8,9,10,11,12};
		
		System.out.println(bSearch.binarySearch(12,a));
	}
}
