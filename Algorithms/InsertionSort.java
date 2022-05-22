package Algorithms;

public class InsertionSort {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public void InsertionSortBigtoSmall(int[]data){
        for(int i=1;i<data.length;i++){
            int key = data[i];
            int j = i-1;
            while(j>=0 && key>data[j]){
                data[j] = data[j+1];
                j-=1;
            }
            data[j+1] = key;
        }
    }
    
}
