
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Hashmaps{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
        HashMap<String,Integer> phonebook = new HashMap<>();
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
            phonebook.put(name,phone);
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
             if(phonebook.get(s)==null){
                 System.out.println("Not found");
             }
             else if(phonebook.get(s)!= null){
                System.out.println(s + "=" +  phonebook.get(s));
                 
             }
            
		}
        
	}
}
