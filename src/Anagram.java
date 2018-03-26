import java.util.Arrays;

public class Anagram {
	
	static void anagramVerifier(String ar, String ar2) {
		char[] arChar = ar.toCharArray();
        char[] arChar2 = ar2.toCharArray();
        int count = 0;
        
        Arrays.sort(arChar);
        Arrays.sort(arChar2);
        
        for(int i = 0; i<arChar.length; i++) {
        	if(arChar[i]==arChar2[i]) count++;
        }
        if(count==arChar.length) System.out.println("true " + String.valueOf(arChar) +" "+ String.valueOf(arChar2));
        else System.out.println("false " + String.valueOf(arChar) +" "+ String.valueOf(arChar2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ar = "aloha";
        String ar2 = "holaa";
        anagramVerifier(ar, ar2);
        
	}

}
