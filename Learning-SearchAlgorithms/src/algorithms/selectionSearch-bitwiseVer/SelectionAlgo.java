package com.sample.algorithms.selection;

public class SelectionAlgo {

	public static void main(String[] args) {
		int dataSet [] = {25,36,96,85,46,23,1,5};
		for(int i = 0; i<dataSet.length-2 ;i++){
			int min = i;
			for(int j = i+1; j<dataSet.length;j++){
				if(dataSet[j]<dataSet[min]){
					min = j;
				}
			}
			dataSet[i]   ^= dataSet[min];
			dataSet[min] ^= dataSet[i];
			dataSet[i]   ^= dataSet[min];
		}
		for(int i = 0; i < dataSet.length;i++){
			System.out.println(dataSet[i]);
		}
	}
}
