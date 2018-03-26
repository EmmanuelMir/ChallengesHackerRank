package hacker_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TesteNro {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        Pattern pattern = Pattern.compile("\\d");
        Matcher m = pattern.matcher(n);
        int a;
        if(m.find()) {
        	a = Integer.parseInt(m.group());
        	System.out.println(a);
        }	
        else
        	System.out.println(false);
    }
}

