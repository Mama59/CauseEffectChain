package CauseEffectChain;

/**
 * Describes a causal element
 */
public interface ChainElement {
	String getLine();
	String getVariable();
	String getDescription();
}
