package hackerearth.stacks.basicsofstack;

import java.util.Scanner;

public class TestCase {

	public static void main(String asd[]) {
		Scanner sc = new Scanner(System.in);
		int numberOfTestCases=sc.nextInt();
		for(int count=0;count<numberOfTestCases;count++) {
		int numOfPasses=sc.nextInt();
		int initialHolder= sc.nextInt();
		//.asd.int numOfPasses=Integer.valueOf(line.split("\\ ")[0]);
		
		TheFootballFest theFootballFest = new TheFootballFest(initialHolder+"");
		sc.nextLine();
		for(int i=0;i<numOfPasses;i++) {
			String command=sc.nextLine();
			theFootballFest.parseAndAct(command);
		}
		System.out.println("Player "+theFootballFest.whoGotTheBallNow());
	}	
	}
}