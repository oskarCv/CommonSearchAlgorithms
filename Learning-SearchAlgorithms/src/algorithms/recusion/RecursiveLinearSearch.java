package algorithms.recusion;

public class RecursiveLinearSearch {
	public void linearSearch(int []a, int x, int index){
		if(a[index] == x && index > 0){
			System.out.println("index ->"+index+" value= "+a[index]);
		}else if (index >0 ){
			linearSearch(a, x, index-1);
		}else{
			System.out.println(x+" Value not found [ "+-1+" ]");
		}
	}
}
