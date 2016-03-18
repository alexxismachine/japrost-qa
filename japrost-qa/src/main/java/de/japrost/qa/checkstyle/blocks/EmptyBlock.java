package de.japrost.qa.checkstyle.blocks;

/**
 * Test the EmtpyBlock checkstyle rules.
 */
public class EmptyBlock {
	private boolean bool = true;

	/**
	 * STATIC_INIT empty
	 */
	static {
	}

	/**
	 * STATIC_INIT with text
	 */
	static {
		//
	}

	/**
	 * STATIC_INIT with stmt
	 */
	static {
		;
	}

	/**
	 * INSTANCE_INIT empty
	 */
	{
	}

	/**
	 * INSTANCE_INIT with text
	 */
	{
		//
	}

	/**
	 * INSTANCE_INIT with stmt
	 */

	{
		;
	}

	public void blocksEmpty() {
		// LITERAL_TRY, LITERAL_CATCH, LITERAL_FINALLY
		try {
		} catch (Exception e) {
		} finally {
		}
		// LITERAL_WHILE
		while (bool) {
		}
		// LITERAL_DO
		do {
		} while (bool);
		// LITERAL_IF, LITERAL_ELSE
		if (bool) {
		} else {
		}
		// LITERAL_FOR
		for (int i = 0; i < 1; i++) {
		}
		// LITERAL_SWITCH
		switch (1) {
		}
		// LITERAL_CASE
		switch (1) {
		case 1:
		}
		// LITERAL_DEFAULT
		switch (1) {
		default:
		}
		// LITERAL_SYNCHRONIZED
		synchronized (this) {
		}
		// ARRAY_INIT
		@SuppressWarnings("unused")
		int[] arrayInit = {};
	}

	public void blocksWithText() {
		// LITERAL_TRY, LITERAL_CATCH, LITERAL_FINALLY
		try {
			//
		} catch (Exception e) {
			//
		} finally {
			//
		}
		// LITERAL_WHILE
		while (bool) {
			//
		}
		// LITERAL_DO
		do {
			//
		} while (bool);
		// LITERAL_IF, LITERAL_ELSE
		if (bool) {
			//
		} else {
			//
		}
		// LITERAL_FOR
		for (int i = 0; i < 1; i++) {
			//
		}
		// LITERAL_SWITCH
		switch (1) {
		//
		}
		// LITERAL_CASE
		switch (1) {
		case 1:
			//
		}
		// LITERAL_DEFAULT
		switch (1) {
		default:
			//
		}
		// LITERAL_SYNCHRONIZED
		synchronized (this) {
			//
		}
		// ARRAY_INIT
		@SuppressWarnings("unused")
		int[] arrayInit = { //
		};
	}

	public void blocksWithStmt() {
		// LITERAL_TRY, LITERAL_CATCH, LITERAL_FINALLY
		try {
			;
		} catch (Exception e) {
			;
		} finally {
			;
		}
		// LITERAL_WHILE
		while (bool) {
			;
		}
		// LITERAL_DO
		do {
			;
		} while (bool);
		// LITERAL_IF, LITERAL_ELSE
		if (bool) {
			;
		} else {
			;
		}
		// LITERAL_FOR
		for (int i = 0; i < 1; i++) {
			;
		}
		// LITERAL_SWITCH
		// switch (1) {
		// ;
		// }
		// LITERAL_CASE
		switch (1) {
		case 1:
			;
		}
		// LITERAL_DEFAULT
		switch (1) {
		default:
			;
		}
		// LITERAL_SYNCHRONIZED
		synchronized (this) {
			;
		}
		// ARRAY_INIT
		@SuppressWarnings("unused")
		int[] arrayInit = { 1 };
	}

}
