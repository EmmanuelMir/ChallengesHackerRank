package hacker_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArvoreNatal {

    static void staircase(int n) {
        // Complete this function
        for(int i=0;i<n;i++){           
            for(int k=0;k<n-i-1;k++){
                System.out.print(" ");
            }
            for(int l=n; l>=n-i; l--){
                System.out.print("#");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
