package test.service;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.forum.entities.Comment;
import com.forum.entities.Reply;
import com.forum.service.CommentService;
import com.forum.service.PostService;
import com.forum.service.ReplyService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestCommentService {
	
	@Autowired
	CommentService commentService;
	@Autowired
	ReplyService replyService;
	@Autowired
	PostService postService;
	@Test
	public void test() {
//		Comment comment = new Comment();
//		comment.setText("this is a comment");
//		
//		comment.setCommentDate(new Date());
//		commentService.addCommentOnReply(30, comment);
		//comment.setPost(postService.findPost(27));
		//service.addComment(comment);
//		System.out.println(commentService.findByPost(postService.findPost(2)));
//		
		List<Reply> listReplies=replyService.findByPost(postService.findPost(2));
		for (Iterator<Reply> iterator = listReplies.iterator(); iterator.hasNext();) {
			Reply reply = iterator.next();
			System.out.println(commentService.findByReply(reply));
			
			
			
		}
		
		
	}

}
