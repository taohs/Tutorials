package com.makotojava.intro;

import java.util.logging.Logger;

public class Person {

	public static void main(String args[]) {
		Logger l = Logger.getLogger("Person");

		l.warning("one");
	}

	public void Person() {

		Logger l = Logger.getLogger("Person");

		l.info("two");
	}

}
