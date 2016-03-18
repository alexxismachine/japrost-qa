package de.japrost.qa.checkstyle.imports;

// static star import
import static java.lang.Boolean.*;
// static regular import
import static java.lang.System.out;

// package star import
import java.util.*;
// regular import
import java.math.BigDecimal;

/**
 * Test the AvoidStarImport checkstyle rules.
 */
public class AvoidStarImport {
	public void doStuff() {
		Boolean b = TRUE;
		out.println(b);
		List<BigDecimal> list = Collections.emptyList();
		list.isEmpty();
	}
}
