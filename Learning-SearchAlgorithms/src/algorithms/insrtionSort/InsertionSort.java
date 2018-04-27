package com.sample.algo.insertionsort;

public class InsertionSort {

	public static void main(String[] args) {
		int []dataSet = {-1, 150, 190, 170, -1, -1, 160, 180};
		for(int i = 1; i<dataSet.length;i++){
			int j = i-1;
			int item = dataSet[i];
			while(j>=0 && dataSet[j] > item){
				dataSet[j+1]= dataSet[j];
				j--;
			}
			dataSet[j+1] = item;
		}
		for(int i=0;i<dataSet.length;i++){
			System.out.println(dataSet[i]);
		}
	}

}
