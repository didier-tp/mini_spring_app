package tp.mini_spring_app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions;

@SpringBootTest
class MiniSpringAppApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void test2(){
		int a=5;
		int b=6;
		int c=a+b;
		Assertions.assertTrue(c==11);
	}

}
