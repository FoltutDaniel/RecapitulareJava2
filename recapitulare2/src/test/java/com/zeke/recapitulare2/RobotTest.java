package com.zeke.recapitulare2;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import com.zeke.recapitulare2.robot.Robot;

import junit.framework.TestCase;

public class RobotTest extends TestCase {
	
	private Robot robot;
	
	@BeforeEach
	public void init() {
		robot = new Robot();
	}
	
	@Test
	public void testInit(){
		assertEquals(1,robot.getX());
		
	}
	
	@Test
	public void testChange() {
		robot.change(5);
		assertEquals(5,	robot.getX());
	}
	
	@Test
	public void testToString() {
		assertEquals("The robot's position is 1", robot.toString());
		
	}
}
