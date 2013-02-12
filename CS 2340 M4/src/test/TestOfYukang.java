package test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.gatech.oad.antlab.person.*;

public class TestOfYukang {

	@Test
	public void p1() {
		Person1 p1 = new Person1("p1");
		assertEquals("p1g123bgt", p1.toString("gtg123b"));
		Person4 p4 = new Person4("p4");
		assertEquals("p4tg123bg", p4.toString("gtg123b"));
		Person3 p3 = new Person3("p3");
		assertEquals("p4tg123bg", p3.toString("gb321gt4p"));
	}

}
