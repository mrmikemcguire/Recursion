import static org.junit.Assert.*;

import org.junit.Test;

public class NumberSumTest extends NumberSum
	{
	@Test
	public void sumNumbersTest()
		{
		assertEquals(15, NumberSum.sumNumbers(5));
		assertEquals(55, NumberSum.sumNumbers(10));
		assertEquals(325, NumberSum.sumNumbers(25));
		}
	}

