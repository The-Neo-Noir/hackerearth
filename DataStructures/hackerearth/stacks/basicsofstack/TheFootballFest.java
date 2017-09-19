package hackerearth.stacks.basicsofstack;

import java.util.ArrayDeque;

public class TheFootballFest {

	private ArrayDeque<String> stack= new ArrayDeque<>(11);
	private String lastNumber;
	public TheFootballFest(String initialHolder) {
		stack.push(initialHolder);
		lastNumber=initialHolder;
	}
	public void pass(String number) {
		lastNumber=stack.peek(); 
		stack.push(number);
	}
	public void back() {
		String temp=stack.peek();
		stack.push(lastNumber);
		lastNumber=temp;
		
	}
	public String whoGotTheBallNow() {
		return stack.peek();
	}
	public void parseAndAct(String string) {
		String [] sd=string.split(" ");
		
		if(sd[0].equals("P")) {
			this.pass(sd[1]);
		}else {
			this.back();
		}
		System.out.println(stack+sd[0]);
		
	}
}