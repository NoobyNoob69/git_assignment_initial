package MathTopics;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestFibonacci {

	@Test
	public void FibonacciTest() {
		long TestRes = Fibonacci.GetFib(10);

		long ans = 55;

		assertEquals(ans, TestRes);
	}
}
