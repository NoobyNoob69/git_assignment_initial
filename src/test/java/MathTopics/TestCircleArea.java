package MathTopics;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestCircleArea {

	@Test
	public void CircleAreaTest() {
		double TestRes = CircleArea.GetCircleArea(10);

		double ans = (double)(22 * 100) / 7;

		assertEquals(ans, TestRes, 0);
	}
}
