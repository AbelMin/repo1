import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HolidayBonusTestStudent {
	private double[][] dataSet1 = { {40,34,66},
									{90,10},
									{28,97}};

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testCalculateHolidayBonusSTUDENTA()
	{
		try 
		{
			double[] result = HolidayBonus.calculateHolidayBonus(dataSet1, 5000, 1000, 2000);
			assertEquals(9000.0, result[0], .001);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		} 
	}
	
	
	@Test
	public void testCalculateHolidayBonusSTUDENTB() {
		try 
		{
			double[] result = HolidayBonus.calculateHolidayBonus(dataSet1,1000, 250, 500);
			assertEquals(1250.0, result[1], .001);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		} 	
	}
	
	@Test
	public void testCalculateTotalHolidayBonusA() {
		assertEquals(21000.0, HolidayBonus.calculateTotalHolidayBonus(dataSet1, 5000, 1000, 2000), .001);
	}
	
	@Test
	public void testCalculateTotalHolidayBonusB() {
		assertEquals(4500.0, HolidayBonus.calculateTotalHolidayBonus(dataSet1, 1000, 250, 500), .001);
	}

}
