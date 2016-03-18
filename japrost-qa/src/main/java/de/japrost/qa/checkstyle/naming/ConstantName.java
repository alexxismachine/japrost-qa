package de.japrost.qa.checkstyle.naming;

/**
 * Test the ConstantName checkstyle rule.
 */
public class ConstantName {
	// correct names
	public static final String PUBLIC_RIGHT = "";
	protected static final String PROTECTED_RIGHT = "";
	static final String PACKAGE_RIGHT = "";
	private static final String PRIVATE_RIGHT = "";

	// incorrect names
	public static final String PUBLIC_wrong = "";
	protected static final String PROTECTED_wrong = "";
	static final String PACKAGE_wrong = "";
	private static final String PRIVATE_wrong = "";

	public void doStuff() {
		PRIVATE_RIGHT.equals(PRIVATE_wrong);
	}
}
