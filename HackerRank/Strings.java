public class Strings{
    public public static long getLetterCount(String s,long length){
        long counter = 0;
        for (int i=0;i<length;i++){
            if(s.charAt(i)== 'a'){
                counter += 1;
            }
        }
        return counter;
    }
    
        public static long repeatedString(String s, long n) {
        // Write your code here
    // we do not need to add everytime 
    // check how may targets are present in current string 
    // divide n/length of the string to know how many complete strings you have 
    int strlength = s.length();
    long q=0 , r=0;
    q = n/strlength;
    r = n%strlength;
    long partialStrLen = (r==0)? 0 : r;
    long aCount = q * getLetterCount(s, strlength) + getLetterCount( s,partialStrLen);
    return aCount;
    
        }
    
}



