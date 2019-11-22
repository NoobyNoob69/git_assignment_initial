package MathTopics;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCircleVolume {

	@Test
	public void CircleCircumferenceTest() {
		double TestRes = CircleVolume.GetCircleVolume(10);

		double ans = 88000 / 21;

		assertEquals(ans, TestRes, 0);
	}
}
