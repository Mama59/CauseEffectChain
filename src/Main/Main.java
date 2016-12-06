package Main;

import Challenge.MyFirstChallenge;
import DDebugger.DDebugger;
import DDebugger.MyDDebugger;

public class Main {

	public static void main(String[] args) {
		DDebugger<?> d = new MyDDebugger();
		System.out.println(d.debug(new MyFirstChallenge()));	
	}
}
