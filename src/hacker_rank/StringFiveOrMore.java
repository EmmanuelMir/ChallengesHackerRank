package hacker_rank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * 	
	The string's length is >=5.
	The first character must be a lowercase English alphabetic character.
	The second character must be a positive digit. Note that we consider zero to be neither positive nor negative.
	The third character must not be a lowercase English alphabetic character.
	The fourth character must not be an uppercase English alphabetic character.
	The fifth character must be an uppercase English alphabetic character.
	
 * @author Junior
 *
 */

public class StringFiveOrMore {

	public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("^[a-z][1-9][^a-z][^A-Z][A-Z]"); // Use \\ instead of using \ 
    
    }
	

}

class Regex_Test {

    public void checker(String Regex_Pattern){
    
        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }   
    
}
