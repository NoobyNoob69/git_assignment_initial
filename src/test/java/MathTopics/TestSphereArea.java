package MathTopics;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestSphereArea {

	@Test
	public void SphereAreaTest() {
		double TestRes = SphereArea.GetShpereArea(10);

		double ans = (double)8800 / 7;

		assertEquals(ans, TestRes, 0);
	}
}
