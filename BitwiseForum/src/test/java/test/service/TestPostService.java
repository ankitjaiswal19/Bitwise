package test.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import oracle.net.aso.p;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.forum.entities.Post;
import com.forum.entities.User;
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
		post.setOwner(userService.findByEmail("abc1@abc.com"));
		post.setPostDate(new Date());
		post.setPostText("some thing");
		post.setTitle("my title");
		post.addtag(tagsService.findByName("Java"));
		post.addtag(tagsService.findByName("javaScript"));
		System.out.println(post);
		postService.addPostService(post);
		
		
		
		
//		System.out.println(postService.findMyPost(userService.findByEmail("ankit@gmail.com")));
	}

}
