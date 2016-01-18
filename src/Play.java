import java.io.IOException;
import java.util.*;
public class Play {
		public static void main (String[] args) throws IOException
		{
		    
			Scanner keyboard=new Scanner(System.in);
		    System.out.println("Please specify the length of the word:");
		    int l=keyboard.nextInt();
		    System.out.println ("Please specify the number of tries:");
		    int tries=keyboard.nextInt();
		    Word word=new Word (l);
		    HangMan x=new HangMan (word.get(),tries);
		    System.out.println("It's on.");
		    while (x.gettries()>0) 
		    {
		    	System.out.println(x.gettries()+" tries left brah");
		    	System.out.println("Please specify a letter:");
		    	String c =keyboard.next();
		    	char[] c1=c.toCharArray();
		    	char c2=c1[0];
		    	
		    		if (x.trys(c2)) break;
		    	
		    	
		    	
		    }
		    if (x.gettries()<=0) System.out.println("You are a LOOSER.The word was " +word.get());
		}
}
