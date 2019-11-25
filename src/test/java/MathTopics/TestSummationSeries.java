package MathTopics;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestSummationSeries {

	@Test
	public void SummationSeriesTest() {
		long TestRes = SummationSeries.GetSum(10);

		long ans = 55;

		assertEquals(ans, TestRes);
	}
}
