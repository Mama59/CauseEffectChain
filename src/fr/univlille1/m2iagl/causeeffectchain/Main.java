package fr.univlille1.m2iagl.causeeffectchain;

public class Main {

	public static void main(String[] args) {
		DDebugger<?> d = new MyDDebugger();
		System.out.println(d.debug(new MyChallenge()));
	}
}
