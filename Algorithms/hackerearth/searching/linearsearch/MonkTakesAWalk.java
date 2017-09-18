package hackerearth.searching.linearsearch;
/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.util.Scanner;

public class  MonkTakesAWalk{
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        for (int i = 0; i < N; i++) {
        		String input=s.next();
            System.out.println(countVowels(input));
        }
    }

	private static int countVowels(String input) {
		int vowelCounts=0;
		for(int i=0;i<input.length();i++) {
			char individualCharacter=input.charAt(i);
			if(individualCharacter=='a' ||
					individualCharacter=='A' ||
					individualCharacter=='e' ||
					individualCharacter=='E' ||
					individualCharacter=='i' ||
					individualCharacter=='I' ||
					individualCharacter=='o' ||
					individualCharacter=='O' ||
					individualCharacter=='u' ||
					individualCharacter=='U' 
					)
				vowelCounts++;
			
		}
		return vowelCounts;
	}
    
}