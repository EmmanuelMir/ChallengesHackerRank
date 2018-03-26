package hacker_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MyDiagonalDifference {

    static int diagonalDifference(int[][] a) {
        // Complete this function
    	int d1=0;
        int d2=0;
        for(int i=0; i<a.length; i++){
            d1 += a[i][i];
        }
        for(int k=a.length-1, j=0;k>=0;k--,j++ ){
            d2 += a[j][k];
        }
        return Math.abs(d1-d2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}
