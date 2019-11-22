package MathTopics;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestFactorial {

	@Test
	public void FactorialTest() {
		long TestRes = Factorial.GetFactorial(10);

		long ans = 3628800;

		assertEquals(ans, TestRes);
	}
}
