package com.example.learn;

import com.example.learn.springboottestlearn.entity.User;
import com.example.learn.springboottestlearn.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTestLearnApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	public void testAddUser() {
		User user = new User();
		user.setName("john");
		user.setAddress("earth");

		userService.add(user);
	}

}
