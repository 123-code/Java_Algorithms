public class DivideAndConquer{

    public static void main(String[] args){
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Sum:" + DivideAndConquerf(0, array.length-1, array));
        System.out.println("Substraction:" + DivideAndConquerr(0, array.length-1, array));
        System.out.println("Greatest:" + DivideAndConquerGreatest(0,array.length-1,array));

    }
  
public static int DivideAndConquerf(int begin,int end,int[] sum ){
if(begin == end){
    return sum[begin];
}
else{
    // cut array in half
    int half = (begin+end)/2;
    int x1 = DivideAndConquerf(begin,half,sum);
    int x2 = DivideAndConquerf(half+1,end,sum);
    return x1 + x2;
}
}

public static int DivideAndConquerr(int begin,int end,int[]subs){
    //if substr action hasnt ended, keep splitting array in half
    if(begin == end){
        return subs[end];
    }
    else{
        int half = (begin+end)/2;
        int y1 = DivideAndConquerr(begin,half,subs);
        int y2 = DivideAndConquerr(half+1,end,subs);

        return y1-y2;
    }

}

// get greatest member in array, using divide and conquer
public static int DivideAndConquerGreatest(int begin,int end,int[] array){
    if(begin == end){
        return array[end];
    }
    else{
        int half = (begin+end)/2;
        int z1 = DivideAndConquerGreatest(begin,half,array);
        int z2 = DivideAndConquerGreatest(half+1, end, array);

        if(z1 > z2){
            return z1;}

            else{
                return z2;
            }
        }

    }

}

