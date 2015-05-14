package test.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.forum.entities.Tags;
import com.forum.service.TagsService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestTagService {
	
	@Autowired
	TagsService service;
	@Test
	public void test() {

		Tags tag= new Tags();
		tag.setTagName("Java");
		service.addTagsService(tag);
		
		Tags tag1= new Tags();
		tag1.setTagName("Javascript");
		service.addTagsService(tag1);
		
		Tags tag2= new Tags();
		tag2.setTagName("JQuery");
		service.addTagsService(tag2);
		
		Tags tag3= new Tags();
		tag3.setTagName("JUnit");
		service.addTagsService(tag3);
		
	}

}
