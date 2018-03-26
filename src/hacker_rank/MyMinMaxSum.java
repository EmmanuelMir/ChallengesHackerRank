package hacker_rank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MyMinMaxSum {

    public static int[] minMax(int[] arr){
        int max = arr[0];
        int min = arr[1];
        for(int n: arr){
            if(max<n){
                max = n;
            }
            if(min>n){
                min = n;
            }
        }
        return new int[]{min, max};
    }
    
    static void miniMaxSum(int[] arr) {
        // Complete this function
        int[]minMx = minMax(arr);
        int maxSum = 0;
        int minSum = 0;
        for(int n: arr){
            if(!(minMx[0] == n)){
                maxSum += n;
            }
            if(!(minMx[1] == n)){
                minSum += n;
            }
        }
        System.out.println(minSum +" " +maxSum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
