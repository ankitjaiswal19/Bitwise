package test.service;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.forum.entities.Post;
import com.forum.entities.Reply;
import com.forum.service.PostService;
import com.forum.service.ReplyService;
import com.forum.service.UserService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestReplyService {
	
	@Autowired
	ReplyService service;
	@Autowired 
	PostService postService;
	@Autowired 
	UserService userService;
	
	@Test
	public void test() {
		Reply reply = new Reply();
		Post p=postService.findPost(10);
		reply.setReplier(userService.findByEmail("priyanka@gmail.com"));
		reply.setPost(p);
		reply.setText("This is my reply to post id: "+p.getPostId());
		reply.setReplyDate(new Date());
		service.addReplyService(reply);
		
		Reply reply1 = new Reply();
		Post p1=postService.findPost(11);
		reply1.setReplier(userService.findByEmail("amit_pandey@gmail.com"));
		reply1.setPost(p1);
		reply1.setText("This is my reply to post id: "+p1.getPostId());
		reply1.setReplyDate(new Date());
		service.addReplyService(reply1);
	}

}
