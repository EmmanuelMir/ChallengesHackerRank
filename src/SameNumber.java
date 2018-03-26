import java.util.*;

public class SameNumber {


	    int solution(int[] A, int[] B) {
	        int n = A.length;
	        int m = B.length;
	        Arrays.sort(A);
	        Arrays.sort(B);
	        int i = 0;
	        for (int k = 0; k < ((n>m)?m:n); k++) {
	            if (i < m - 1 && B[i] < A[k])
	                i += 1;
	            if (A[k] == B[i])
	                return A[k];
	        }
	        return -1;
	    }
	    
	    int solution2(int[] A, int[] B) {
	        int n = A.length;
	        int m = B.length;;
	        Arrays.sort(A);
	        Arrays.sort(B);
	        int i = 0;
	        for (int k = 0; k < n; k++) {
	            if (i < m - 1 && B[i] < A[k])
	                i += 1;
	            if (A[k] == B[i])
	                return A[k];
	        }
	        return -1;
	    }
	    
	    
	    
	    

}
