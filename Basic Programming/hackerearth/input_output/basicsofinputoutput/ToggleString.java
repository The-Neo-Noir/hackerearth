package hackerearth.input_output.basicsofinputoutput;

// @path: https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/modify-the-string/
import java.util.*;

public class ToggleString {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        String N = s.next();
        System.out.println(toggle(N));
    }
    static String toggle(String input){
        StringBuffer sb = new StringBuffer();
        for(int i =0;i<input.length();i++){
            Character ch=input.charAt(i);
            if(ch.isLowerCase(ch)){
                sb.append(ch.toUpperCase(ch));
            }else{
                sb.append(ch.toLowerCase(ch));
            }
        }
        return sb.toString();
    }
}
