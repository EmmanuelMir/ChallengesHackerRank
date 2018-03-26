package hacker_rank;


import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class SolutionRegex {


	    public static void main(String[] args)
	    {
	        Scanner reader = new Scanner(System.in);
	        int nSentences = Integer.parseInt(reader.nextLine());
	        String[] sentences = new String[100];
	        int i;
	        for( i = 0 ; i < nSentences; i++)
	        {
	            sentences[i] = reader.nextLine();
	        }
	        int nWords = Integer.parseInt(reader.nextLine());
	        for( i = 0 ; i < nWords ; i++)
	        {
	            String word = reader.nextLine();
	            Pattern p = Pattern.compile("\\b"+word+"\\b");
	            int count = 0;
	            for(int j = 0 ; j < nSentences ; j++)
	            {
	                Matcher m = p.matcher(sentences[j]);
	                while( m.find())
	                    count++;
	            }
	            System.out.println(count);
	        }
	    }
}
	    
	
