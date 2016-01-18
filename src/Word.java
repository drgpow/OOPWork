import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
public class Word {
      private String cur;
      public Word (int length) throws IOException
      {
    	  URL u=new URL ("https://raw.githubusercontent.com/sacummins/OOPIncompleteWordGame/master/src/main/resources/words.txt");
    	  BufferedReader in=new BufferedReader(new InputStreamReader(u.openStream()));
    	  String input;
    	  ArrayList <String> list=new ArrayList<String>();
    	  while ((input = in.readLine()) != null) if (input.length()==length) list.add(input);
    	  Random Dice=new Random ();
    	  int n=Dice.nextInt(list.size());
    	  cur=list.get(n);
      }
      public String get ()
      {
    	  return cur;
      }
}
