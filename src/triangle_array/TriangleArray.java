package triangle_array;

/*
 * Challenge codility
 */

public class TriangleArray {

	/*public static int triplet(int[] array, int n) {
		int p,q,r,k;
		int aux;
		if(array.length< 3) return 0;
		else {
			for(int i = 0; i<array.length; i++) {
				p = array[i];
				if(p+q<r&&q+r<p&&r+p<q)
				for(int j = i+1; j<n; j++) {
					if(array[i]>array[j]) {
						aux = array[i];
						array[i] = array[j];
						array[j] = aux;
						if(array[i]<p) {
							p = array[i];
							q = array[j];
						}
						for(k = j+1;k<n; k++) {
							if(array[j]>array[k]) {
								aux = array[j];
								array[j]=array[k];
								array[k]=aux;
								if(p+q<r) {
									r=array[k];
								}
									
							}
						}
					}
					else return 0;	
				}
			}
		}
	}*/
	
	public int solution(int[] A, int N) {
		int i = 0;
		int p,q,r;
		for(i = 0; i < N ; i++) {
			for(int j = i+1; j<N;j++) {
				for(int k = j+2; k<N; k++) {
					p=A[i];
					q=A[j];
					r=A[k];
					if(0<=i && i<j && j<k && k<N) {
						if((p+q>r) && (p+r>q) && (q+r>p)) {
							System.out.println(p +" " +q +" " +r);
							return 1;
						}
					}
				}
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TriangleArray triplet = new TriangleArray();
		int[] array = {10,2,5,1,8,20};
		System.out.println(triplet.solution(array, array.length));
		
	}

}
