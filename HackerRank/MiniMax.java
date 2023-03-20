import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class MiniMax {
    public static void miniMaxSum(List<Integer> arr) {
        // dt long
        // order arrays
        // array size fixsd in for loop
    Collections.sort(arr);
    long Numizq = 0;
    long Numder = 0;
    
    for(int i=0;i<arr.size()-1;i++){
        Numder += arr.get(i);
    }
    
    for(int i = 4;i>0;i--){
        Numizq += arr.get(i);
    }
    
    System.out.println(Numder + " " + Numizq);
    
    
        }

}