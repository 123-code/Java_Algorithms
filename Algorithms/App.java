package Algorithms;

public class App {
    
    public static void main(String[] args) {
        // TODO code application logic here
        InsertionSort ins = new InsertionSort();
        BinarySearch bin = new BinarySearch();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ins.InsertionSortBigtoSmall(arr);
       int result =  bin.binarysearch(5, arr);

        System.out.println(result);
        if(result == -1){
            System.out.println("Elemento no encontrado");
        }
        else{
            System.out.println("Elemento encontrado");
        }

}
}