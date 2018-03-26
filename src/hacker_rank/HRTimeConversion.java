package hacker_rank;

import java.util.*;

public class HRTimeConversion {

    static String timeConversion(String s) {
    	int i = s.length()-2;
        char dOrNight = s.charAt(i);
        int c = 0;
        c = Integer.valueOf(s.substring(0,2));
        if(String.valueOf(dOrNight).equals("A")){
            if(c!=12){
                if(c>12){
                    c-=12;
                    s = s.replace(s.substring(1,2),String.valueOf(c));
                }
                else return s.trim().substring(0,i);
            }else{
                c-=12;
                s = s.replace(s.substring(0,2),"00");
            }
        }
        if(String.valueOf(dOrNight).equals("P")){
            if(c<12){
                c+=12;
                s = s.replace(s.substring(0,2),String.valueOf(c));
            }
            else return s.trim().substring(0,i);
            
        }
        
        return s.trim().substring(0,i);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
        in.close();
    }
}