package MathTopics;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCircleCircumference {

	@Test
	public void CircleCircumferenceTest() {
		double TestRes = CircleCircumference.GetCircleCircumference(10);

		double ans = (double)440 / 7;

		assertEquals(ans, TestRes, 0);
	}
}
