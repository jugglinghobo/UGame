package uGameTests;

import static org.junit.Assert.*;

import javax.activity.InvalidActivityException;

import org.junit.Before;
import org.junit.Test;
import uGame.*;

public class StudentTest {
	
	Student radischa, fuetzgue;
	
	@Before
	public void initializeStudents() {
		this.radischa = new Student("Radischa");
		this.fuetzgue = new Student("Fuetzgue");
	}
	
	@Test
	public void stringRepresentationShouldShowNameAndXP() {
		assertEquals("Fuetzgue: 0 XP", this.fuetzgue.toString());
	}
	
	@Test
	public void namesShouldBeCorrect() {
		assertEquals("Radischa", radischa.getName());
		assertEquals("Fuetzgue", fuetzgue.getName());
	}
	
	@Test
	public void XPShouldBeZero() {
		assertEquals(0, radischa.getXP());
	}
	
	@Test
	public void XPShouldAddUp() {
		try {
			this.fuetzgue.addXP(5);
		} catch (InvalidActivityException e) {
			assertNotNull(e);
		}
		assertEquals(5, fuetzgue.getXP());
		this.fuetzgue.resetXP();
		assertEquals(0, fuetzgue.getXP());
	}
	
	@Test
	public void NegativeXPShouldInvokeException() {
		try {
			this.radischa.addXP(-5);
			fail("expected InvalidActivityException");
		} catch (InvalidActivityException e) {
			assertNotNull(e);
		}
	}

	

}
