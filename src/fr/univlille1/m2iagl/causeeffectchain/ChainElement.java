package fr.univlille1.m2iagl.causeeffectchain;

/**
 * Describes a causal element
 */
public interface ChainElement {
	String getLine();
	String getVariable();
	String getDescription();
}