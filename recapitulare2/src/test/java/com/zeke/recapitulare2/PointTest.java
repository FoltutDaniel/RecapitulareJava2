package com.zeke.recapitulare2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import recapitulare2.Point.MyPoint;

class PointTest{

	private MyPoint point1;
	private MyPoint point2;
	@BeforeEach
	public void init() {
		point1 = new MyPoint(4,5);
		point2 = new MyPoint(4,5);
	}
	
	@Test
	public void testDistance() {
		assertEquals(0, point1.distance(point2));
		assertEquals(0, point1.distance(4,5));
	}
}
