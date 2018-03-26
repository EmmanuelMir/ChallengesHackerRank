package hacker_rank;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCounterClass {
    
    public static int regexCounter(String[] str, Pattern r){
        // Now create matcher object.
    	
        int count = 0;
        for(String i: str){
            Matcher m = r.matcher(i);
            while(m.find()){
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        try{        
            int n = Integer.parseInt(s.nextLine());
            String[] str = new String[n];
            for(int i=0; i<n; i++){
                str[i] = s.nextLine();
            }
            n = Integer.parseInt(s.nextLine());
            String[] pattern = new String[n];
            int counter = 0;
            for(int i=0; i<n; i++){
            	String aux = s.nextLine();
            	
                pattern[i] = "\\b" + aux + "\\b";
            
                Pattern r = Pattern.compile(pattern[i]);
                counter += regexCounter(str, r);
            }
            System.out.println("\n" + counter);
        }catch(Exception e){
            e.printStackTrace(System.out);
        }
        // Create a Pattern object
        s.close();
    }
}