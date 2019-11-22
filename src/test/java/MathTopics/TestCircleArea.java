package MathTopics;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestCircleArea {

	@Test
	public void CircleAreaTest() {
		double TestRes = CircleArea.GetCircleArea(10);

		double ans = 314.1592653589793;

		assertEquals(ans, TestRes, 0);
	}
}
