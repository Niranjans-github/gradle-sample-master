package org.broonix;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;



@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoStarterApplication.class)
@WebAppConfiguration
public class DemoStarterApplicationTests {

	@Test
	public void contextLoads() {
	}

}
