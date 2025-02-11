import java.util.*;

public class strings {
    public static boolean palindrome(String str){
        for(int i = 0; i < str.length()/2 ; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n - 1 - i)){
                return false;
            }
        }
        return true;
    }

    public static float shortestPath(String str){

        int x = 0, y = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'W'){
                x--;
            }
            else if(str.charAt(i) == 'E'){
                x++;
            }
            else if(str.charAt(i) == 'N'){
                y++;
            }else{
                y--;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float)Math.sqrt(x2 + y2);
    }

    public static boolean comparison(){
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");

        if(str1.equals(str3)){
            return true;
        }
        return false;
    }

    public static void largestStr(){                            //lexicographically
        String str[] = {"apple", "mango", "banana"};
        String largest = str[0];
        for(int i = 1; i<str.length; i++){
            if(largest.compareTo(str[i]) < 0){
                largest = str[i];
            }
        }
        System.out.println(largest);
    }

    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String compression(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < str.length(); i++){
            int count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aaabbcddd";
       System.out.println(compression(str));
    }
}
