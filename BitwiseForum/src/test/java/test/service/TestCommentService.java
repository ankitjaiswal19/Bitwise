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
import com.forum.entities.Post;
import com.forum.entities.Reply;
import com.forum.service.CommentService;
import com.forum.service.PostService;
import com.forum.service.ReplyService;
import com.forum.service.UserService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestCommentService {
	
	@Autowired
	CommentService commentService;
	@Autowired
	ReplyService replyService;
	@Autowired
	PostService postService;
	@Autowired 
	UserService userService;
	
	@Test
	public void test() {

		Comment comment= new Comment();
		
		comment.setCommentDate(new Date());
		
		comment.setCommenter(userService.findByEmail("priyanka@gmail.com"));
		comment.setText("This is my comment on post id: "+ 41);
		
		commentService.addCommentOnPost(41,comment);
		
		/*Comment comment1= new Comment();
		Reply r=replyService.findById(117);
		comment1.setCommentDate(new Date());
		comment1.setReply(r);
		comment1.setCommenter(userService.findByEmail("amit_pandey@gmail.com"));
		comment1.setText("This is my comment on reply id: "+ r.getR_id());
		commentService.addCommentOnReply(8, comment1);
		*/
//		List<Reply> listReplies=replyService.findByPost(postService.findPost(2));
//		for (Iterator<Reply> iterator = listReplies.iterator(); iterator.hasNext();) {
//			Reply reply = iterator.next();
//			System.out.println(commentService.findByReply(reply));
			
//		}
		
		
	}

}
