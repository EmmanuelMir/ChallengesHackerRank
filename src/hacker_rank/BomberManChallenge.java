package hacker_rank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BomberManChallenge {

    static int[][] bomberMan(int n, String[] grid, int row, int col) {
    	if(n>4) n = n%4+4;
    	int[][] gridOrig = new int[grid.length][grid[0].length()];
        int[][] gridInt = new int[grid.length][grid[0].length()];
        int[][] gridInt2 = new int[grid.length][grid[0].length()];
        int[][] gridInt3 = new int[grid.length][grid[0].length()];
        for(int r=0; r<grid.length;r++){
            for(int c=0; c<grid[r].length();c++){
            	if(grid[r].substring(c,c+1).equals(".")) {
            		gridInt[r][c]=0;
            	}else {
            		gridInt[r][c]=1;
            	}
            }
        }
       
        for(int r=0; r<row;r++){
            for(int c=0; c<col;c++){
            	gridInt2[r][c]=1;
            }
        }
        for(int m=0; m<row; m++) {
        	System.arraycopy(gridInt[m], 0, gridInt3[m], 0, col);
        	System.arraycopy(gridInt[m], 0, gridOrig[m], 0, col);
    	}
    	if(n%2==0) return gridInt2;
        
        for(int k=2; k<=n; k++){
        	
            if(k%2==0){
                
            	//grid2[r] = grid2[r].replace(grid2[r].substring(c,c+1),"O");
            	for(int m=0; m<row; m++) {
	            	System.arraycopy(gridInt2[m], 0, gridInt3[m], 0, col);
            	}
            }
            if(k%2!=0){
            	for(int r=0; r<row;r++){
                    for(int c=0; c<col;c++){
                        if(gridInt[r][c] == 1){
                            if (((c - 1) >= 0)&&((c + 1) < col)&&((r - 1) >= 0)&&((r + 1) < row)) {
                            	gridInt3[r][c - 1] = 0;
                            	gridInt3[r][c + 1] = 0;
                            	gridInt3[r - 1][c] = 0;
                            	gridInt3[r + 1][c] = 0;
                            	gridInt3[r][c] = 0;
                            }else {
								//try{
								if ((c - 1) >= 0) {
									/*if(grid2[r].substring(c-1,c).equals("O")) {
									    grid2[r] = grid2[r].substring(0,c-1)+"."+ grid2[r].substring(c);
									}*/
									if(gridInt3[r][c-1]==1)
										gridInt3[r][c - 1] = 0;
								}
								if ((c + 1) < col) {
									/*if(grid2[r].substring(c+1,c+2).equals("O")) {
									    grid2[r] = grid2[r].substring(0,c+1)+"."+ grid2[r].substring(c+2);
									}*/
									if(gridInt3[r][c+1]==1)
										gridInt3[r][c+1] = 0;
								}
								if ((r - 1) >= 0) {
									/*if(grid2[r-1].substring(c,c+1).equals("O")) {
									    grid2[r-1] = grid2[r-1].substring(0,c)+"."+ grid2[r-1].substring(c+1);
									}*/
									if(gridInt3[r-1][c]==1)
										gridInt3[r-1][c] = 0;
								}
								if ((r + 1) < row) {
									/*if(grid2[r+1].substring(c,c+1).equals("O")) {
									    grid2[r+1] = grid2[r+1].substring(0,c)+"."+ grid2[r+1].substring(c+1);
									}*/
									if(gridInt3[r+1][c]==1)
										gridInt3[r + 1][c] = 0;
								}
								//grid2[r] = grid2[r].substring(0, c) + "." + grid2[r].substring(c + 1);
								gridInt3[r][c] = 0;
							}
                            
                        }
                        if(r == row-1 && c == col-1) {
                        	for(int m=0; m<row; m++) {
            	            	System.arraycopy(gridInt3[m], 0, gridInt[m], 0, col);
                        	}
                        }
                    }
            	}
            }
        }
        
        return gridInt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int n = in.nextInt();
        String[] grid = new String[r];
        for(int grid_i = 0; grid_i < r; grid_i++){
            grid[grid_i] = in.next();
        }
        int[][] result = bomberMan(n, grid, r, c);
        for (int i = 0; i < r; i++) {
        	for(int j = 0; j<c;j++) {
        		System.out.print((result[i][j]==0?".":"O") + (j < c - 1 ? "" : "\n"));
        	}
        }
        System.out.println("");
        in.close();
    }
}
