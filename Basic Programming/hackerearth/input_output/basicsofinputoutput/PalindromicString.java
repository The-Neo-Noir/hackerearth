package hackerearth.input_output.basicsofinputoutput;

import java.util.*;

//@path :https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/palindrome-check-2/

public class PalindromicString {
	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		String N = s.next();
		StringBuffer sb = new StringBuffer(N);
		if (sb.reverse().toString().equals(N)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}