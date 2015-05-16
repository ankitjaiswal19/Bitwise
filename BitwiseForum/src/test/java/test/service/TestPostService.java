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
		
		Post post2=new Post();
		post2.setOwner(userService.findByEmail("sukriti@gmail.com"));
		post2.setPostDate(new Date());
		post2.setPostText("Difference between HTML and HTML5");
		post2.setTitle("HTML vs HTML5");
		post2.addtag(tagsService.findByName("HTML"));
		System.out.println(post2);
		postService.addPostService(post2);
		
		Post post3=new Post();
		post3.setOwner(userService.findByEmail("ankit@gmail.com"));
		post3.setPostDate(new Date());
		post3.setPostText("Difference between CSS and CSS3");
		post3.setTitle("CSS vs CSS3");
		post3.addtag(tagsService.findByName("CSS"));
		System.out.println(post3);
		postService.addPostService(post3);
		
		Post post4=new Post();
		post4.setOwner(userService.findByEmail("ankur@gmail.com"));
		post4.setPostDate(new Date());
		post4.setPostText("Does Operator Overloading happen in Java");
		post4.setTitle("Operator Overloading");
		post4.addtag(tagsService.findByName("Java"));
		System.out.println(post4);
		postService.addPostService(post4);
	}

}
