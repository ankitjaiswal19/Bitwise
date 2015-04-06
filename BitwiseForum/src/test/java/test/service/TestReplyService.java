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
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestReplyService {
	
	@Autowired
	ReplyService service;
	@Autowired 
	PostService postService;
	@Test
	public void test() {
		// Set User Entity
		Reply reply = new Reply();
//		reply.setReply_content("This is the reply to the first post");
//		reply.setReply_by(2);
//		reply.setReply_date(new Date());
		Post p=postService.findPost(2);
		reply.setPost(p);
		reply.setText("reply on post 2");
		service.addReplyService(reply);
	}

}
