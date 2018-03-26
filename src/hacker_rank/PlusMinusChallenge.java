package hacker_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlusMinusChallenge {

    static void plusMinus(int[] arr) {
        // Complete this function
        double[] oc = new double[]{0,0,0};
        for(int n:arr){
            if(!(n==0)){
                if(n>0){
                    oc[0]++;
                }else{
                    oc[1]++;
                }
            }else{
                oc[2]++;
            }
        }
        for(double n:oc){
            System.out.println(n/arr.length);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}
