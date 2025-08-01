package tp.mini_spring_app.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestCalculService {
	
	@Autowired
	private CalculService calculService; //à tester
	
	@Test
	public void testMoyenne() {
		double resMoyenne = calculService.moyenne(5, 7);
		System.out.println("moyenne de 5 et 7 = " + resMoyenne);
		assertEquals(11,resMoyenne,0.00001);
	}

}
