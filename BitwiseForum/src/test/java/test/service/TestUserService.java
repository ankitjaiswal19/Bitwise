package test.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.forum.entities.User;
import com.forum.service.UserService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestUserService {
	
	@Autowired
	UserService service;
	@Test
	public void test() {
		
		User user = new User();
		user.setName("Ankit2");
		user.setEmail("abc1@abc.com");
		user.setPassword("abc2");
		
		service.addUser(user);
	}

}
