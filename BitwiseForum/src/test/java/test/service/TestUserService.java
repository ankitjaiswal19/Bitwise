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
		user1.setName("Amit Kumar Pandey");
		user1.setEmail("amit@hotmail.com");
		user1.setPassword("amit");
		user1.setActive_Status("Active");
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
		
		User user6 = new User();
		user6.setName("Mahima Girdhar");
		user6.setEmail("mahima@rediff.com");
		user6.setPassword("mahima");
		user6.setActive_Status("Active");
		service.addUser(user6);
		
		User user7 = new User();
		user7.setName("Priya Rani");
		user7.setEmail("priya@yahoo.com");
		user7.setPassword("priya");
		user7.setActive_Status("Active");
		service.addUser(user7);
		
		User user8 = new User();
		user8.setName("Mayank Paul");
		user8.setEmail("mayank@ymail.com");
		user8.setPassword("mayank");
		user8.setActive_Status("Active");
		service.addUser(user8);
		
		User user9 = new User();
		user9.setName("Nitish Sharma");
		user9.setEmail("nitish@hotmail.com");
		user9.setPassword("nitsh");
		user9.setActive_Status("Active");
		service.addUser(user9);
		
		User user10 = new User();
		user10.setName("Manpreet Singh");
		user10.setEmail("manpreet@gmail.com");
		user10.setPassword("manpreet");
		user10.setActive_Status("Active");
		service.addUser(user10);
		
		User user11 = new User();
		user11.setName("Sanjay Barnwal");
		user11.setEmail("sanjay@gmail.com");
		user11.setPassword("sanjay");
		user11.setActive_Status("Active");
		service.addUser(user11);
		
		User user12 = new User();
		user12.setName("Preeti Rathi");
		user12.setEmail("preeti@ymail.com");
		user12.setPassword("preeti");
		user12.setActive_Status("Active");
		service.addUser(user12);
		
		User user13 = new User();
		user13.setName("Priya beri");
		user13.setEmail("priya_beri@yahoo.co.in");
		user13.setPassword("sanjay");
		user13.setActive_Status("Active");
		service.addUser(user13);
		
		User user14 = new User();
		user14.setName("Neha Malik");
		user14.setEmail("neha@outlook.com");
		user14.setPassword("neha");
		user14.setActive_Status("Active");
		service.addUser(user14);
	}

}
