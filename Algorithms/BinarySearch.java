package Algorithms;

public class BinarySearch {
   

    
    public int binarysearch(int search,int[]data){
        int low = data[0];
        int high = data[data.length];
        int center = (high-low)/2;

        if(search == data[center]){
            System.out.println("Elemento encontrado");
            return search;
        }
        
        else if(search>data[center]){
            low = data[center+1];
            
        }

        else if(search<data[center]){
            high = data[center-1];

        }
        return -1;

        

    }
}
