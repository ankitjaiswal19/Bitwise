package test.service;

import java.util.Date;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.forum.entities.Post;
import com.forum.service.CommentService;
import com.forum.service.PostService;
import com.forum.service.TagsService;
import com.forum.service.UserService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestPostService {
	
	@Autowired
	PostService postService;
	@Autowired 
	UserService userService;
	@Autowired
	TagsService tagsService;
	@Autowired 
	CommentService commentService;
	@Test
	public void test() {
		Post post=new Post();
		post.setOwner(userService.findByEmail("priyanka@gmail.com"));
		post.setPostDate(new Date());
		post.setPostText("Difference between Java and Javascript");
		post.setTitle("Java vs Javascript");
		post.addtag(tagsService.findByName("Java"));
		post.addtag(tagsService.findByName("Javascript"));
		System.out.println(post);
		postService.addPostService(post);
		
		Post post1=new Post();
		post1.setOwner(userService.findByEmail("amit_pandey@gmail.com"));
		post1.setPostDate(new Date());
		post1.setPostText("Difference between JQuery and Javascript");
		post1.setTitle("JQuery vs Javascript");
		post1.addtag(tagsService.findByName("JQuery"));
		post1.addtag(tagsService.findByName("Javascript"));
		System.out.println(post1);
		postService.addPostService(post1);
	}

}
