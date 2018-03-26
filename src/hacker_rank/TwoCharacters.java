package hacker_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoCharacters {

    static int twoCharaters(String s) {
        // Complete this function
    	char[] s2 = s.toCharArray();
    	int max = 0;
    	ArrayList<Character> letters = new ArrayList<>();
    	letters.add(s2[0]);
    	for(int i = 1; i<s2.length; i++) {
    		if(!letters.contains(s2[i]))
    			letters.add(s2[i]);
    	}
    	for(int i = 0; i<letters.size(); i++) {
    		System.out.print("\n" +  letters.get(i).charValue());
    	}
        return letters.size();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        String s = in.next();
        int result = twoCharaters(s);
        System.out.println(result);
        in.close();
    }
}