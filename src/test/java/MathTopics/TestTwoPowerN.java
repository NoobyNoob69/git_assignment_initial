package MathTopics;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestTwoPowerN {

	@Test
	public void TwoPowerNTest() {
		long TestRes = TwoPowerN.Get2PN(15);

		long ans = 32768;

		assertEquals(ans, TestRes);
	}
}
