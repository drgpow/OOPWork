
public class HangMan {
    private char[] word;
    private boolean[] a;
    private int tries;
    private int cor=0;
    private int[] b=new int [200];
	public HangMan(String s,int t)
   {
	   tries=t;
		word=new char[s.length()];
	   a=new boolean[word.length];
	   for (int i=0;i<a.length;i++)
		   a[i]=false;
	   word=s.toCharArray();
   }
	public int gettries ()
	{
		return tries;
	}
	public boolean trys (char x)
	{
		if (b[x]==1) System.out.println("Already tried this brah");
		else 
		{
		boolean ok=false;
		for (int i=0;i<word.length;i++)
			if (word[i]==x && a[i]==false) 
			{
				if (ok==false) System.out.println("Niceeee. You're right!!!");
				cor++;
				a[i]=true;
				ok=true;
				
			}
		if (!ok) {
					tries--;
					System.out.println("The letter is wrong or already guessed.");
				 }
		b[x]=1;
		}
		    System.out.println("");
		for (int i=0;i<word.length;i++)
			if (a[i]==true) System.out.print(word[i]+" ");
			else System.out.print("_ ");
		System.out.println("\n");
		if (cor==word.length) 
			         { 
							System.out.println("Congrats.You won.");
							return true;
			         }
		return false;
	}
	
	
}
