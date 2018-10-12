import java.io.*;
import java.util.*; 
class CheckPalindromeWords
{
	// create object of buffer class.
	// BufferedReader class reads text from character-input stream provides the efficient reading of characters,lines and arrays.
	
	static BufferedReader br=new BufferedReader (new InputStreamReader (System.in)); 
 
	// function to check palindrome
	// boolean value will have two choices i.e true or false to check if reverse equals to the original string.
	
	boolean IsPalindrome(String s)
	{
		int l=s.length();
		String rev="";
		for(int i=l-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s))
			return true;
		else
			return false;
	}
 
	public static void main(String args[])throws IOException
    {
		// create function of palindromewords.
		
		CheckPalindromeWords ob=new CheckPalindromeWords();
        
		// enter the sentence.
		
		System.out.println("Please enter the String : ");
        String s=br.readLine();
        
        // to convert into upper case.
        s=s.toUpperCase();
 
        StringTokenizer str = new StringTokenizer(s,".?! ");
        int w=str.countTokens(); 
 
        String word[]=new String[w];
        for(int i=0;i<w;i++)
        {
            word[i]=str.nextToken();
        }
 
        int count=0;
        System.out.println("Result : ");
        for(int i=0; i<w; i++)
        {
            if(ob.IsPalindrome(word[i])==true)
            {
                count++;
                System.out.print(word[i]+" ");
            }
        }
 
        // To show the palindrome or not.
        if(count==0)
        System.out.println("Given input does not have any palindromic word(s)");
        else
        System.out.println("\nNumber of Palindromic Words : "+count);
    }
}