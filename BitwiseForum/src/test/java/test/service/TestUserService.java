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
		user.setName("Priyanka Minocha");
		user.setEmail("priyanka@gmail.com");
		user.setPassword("priyanka");
		user.setActive_Status("Active");
		service.addUser(user);
		
		User user1 = new User();
		user1.setName("Amit Pandey");
		user1.setEmail("amit_pandey@gmail.com");
		user1.setPassword("amit");
		user1.setActive_Status("Inactive");
		service.addUser(user1);
		
		User user2 = new User();
		user2.setName("Ankur Aggarwal");
		user2.setEmail("ankur@gmail.com");
		user2.setPassword("ankur");
		user2.setActive_Status("Active");
		service.addUser(user2);
		
		User user3 = new User();
		user3.setName("Sukriti Bakshi");
		user3.setEmail("sukriti@gmail.com");
		user3.setPassword("sukriti");
		user3.setActive_Status("Active");
		service.addUser(user3);
		
		User user4 = new User();
		user4.setName("Ashima Setia");
		user4.setEmail("ashima@gmail.com");
		user4.setPassword("ashima");
		user4.setActive_Status("Active");
		service.addUser(user4);
		
		User user5 = new User();
		user5.setName("Ankit Jaiswal");
		user5.setEmail("ankit@gmail.com");
		user5.setPassword("ankit");
		user5.setActive_Status("Active");
		service.addUser(user5);
		
	}

}
