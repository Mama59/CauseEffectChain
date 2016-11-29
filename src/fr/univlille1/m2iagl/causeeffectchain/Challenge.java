package fr.univlille1.m2iagl.causeeffectchain;

import java.util.List;

import static javafx.scene.input.KeyCode.T;

/**
 * Defines a challenge asked to the others
 */
public interface Challenge<I> {
	Class<? extends I> getInputFormat();
	List<I> getInputs();
	boolean oracle(I input);
	String getJavaProgram();
}
