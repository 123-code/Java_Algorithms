import java.util.ArrayList;
import java.util.List;

public class Triplets {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        //List<Integer>  = new List<integer>();
        //List<Integer> listapuntosb = new List<integer>();
        List<Integer> listapuntosa=new ArrayList<Integer>();
        List<Integer> listapuntosb=new ArrayList<Integer>();
        List<Integer> longitud=new ArrayList<Integer>();
    for(int i=0;i<a.size();i++){
        for(int j=0;i<b.size();i++){
            if(a.get(i)> a.get(j)){
                listapuntosa.add(1);
                   
            }
            else if(a.get(i)< a.get(j)){
                listapuntosb.add(1);
          
                
            }
            else if(a.get(i) == a.get(j)){
                System.out.println("Equals");
            }
        }
    }
int longitud1 = 0;
int longitud2 = 0;
 for(int i=0;i<a.size();i++){
     longitud1 += 1;  
 }
  for(int j=0;j<a.size();j++){
     longitud2 += 1;  
 }
  longitud.add(longitud1);
longitud.add(longitud2);
    return longitud;
    }

}
