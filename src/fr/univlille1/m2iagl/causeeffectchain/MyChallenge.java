package fr.univlille1.m2iagl.causeeffectchain;

import java.util.Arrays;
import java.util.List;

public class MyChallenge<I> implements Challenge<I> {
	
	public Class getInputFormat() {
		return String.class;
	}

	public List getInputs() {
		return Arrays.asList(new String[]{"foo", "bar"});
	}

	public boolean oracle(Object input) {
		return false;
	}

	public String getJavaProgram() {
		return "foo";
	}

}
