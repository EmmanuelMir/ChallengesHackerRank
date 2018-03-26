package hacker_rank;

import java.util.Scanner;
/**
 * Compare 2 triplets of points of Alice and Bob
 * @author Junior
 *
 */

public class Solution2 {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
    	// Complete this function
        int[] a = {a0,a1,a2};
        int[] b = {b0,b1,b2};
        int[] score={0,0};
        for(int i = 0; i<3; i++){
            if(!(a[i]==b[i])){ 
                if(a[i]>b[i]){
                    score[0]++;
                }else{
                    score[1]++;
                }
            }
        }
        return score;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
        in.close();        

    }

}