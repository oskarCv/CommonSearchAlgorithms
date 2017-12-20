package algorithms.binarysearch;

public class BinarySearch {
	/**
	 * The condition to use this search algorithm is that the data must be sorted 
	 * 
	 */
	public int binarySearch(int x, int []a){
		/**NOTE: The array must be sorted*/
		int p = 0;
		int r = a.length-1;
		
		while(p <= r){
			int q = (p+r)/2;
			if(x < a[q]){
				r = q-1; // moving right index to the left by half
			}else if(x > a[q]){
				p = q+1; // moving left index to the right by half
			}else{
				return q;  
			}
		}
		return -1;//not found 
	}
}
