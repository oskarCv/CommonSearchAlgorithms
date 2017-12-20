package algorithms.linearsearch;

public class LinearSearch {
	/**
	 * This class contains the linear search algorithm implementation
	 * This algorithm is considered as linear grow rate
	 * Complexity -> O(n) 
	 */
	
	public int linearSearch(int []a, int x){
		for(int i=0;i<a.length;i++){
			if(a[i] == x){
				return i;
			}	
		}
		return -1;
	}
}
