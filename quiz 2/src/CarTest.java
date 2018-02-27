import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

	@Test
	void testMonthlyCarPayment() {
		Car testCar=new Car(35000, .1,0, 60);
		assertEquals(743.65,testCar.monthlyCarPayment(),.01);
	}

	@Test
	void testTotalInterestPaid() {
		Car testCar=new Car(35000, .1,0, 60);
		assertEquals(9618.79,testCar.totalInterestPaid(),.01);
		
	}

}

