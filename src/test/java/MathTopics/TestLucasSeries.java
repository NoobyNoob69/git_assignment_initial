package MathTopics;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestLucasSeries {

	@Test
	public void LucasSeriesTest() {
		long TestRes = LucasSeries.GetLucas(10);

		long ans = 123;

		assertEquals(ans, TestRes);
	}
}
