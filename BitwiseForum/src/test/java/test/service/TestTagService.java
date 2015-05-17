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
		
		Tags tag4= new Tags();
		tag4.setTagName("HTML");
		service.addTagsService(tag4);
		
		Tags tag5= new Tags();
		tag5.setTagName("CSS");
		service.addTagsService(tag5);
		
		Tags tag6= new Tags();
		tag6.setTagName("SQL");
		service.addTagsService(tag6);
		
		Tags tag7= new Tags();
		tag7.setTagName("Hibernate");
		service.addTagsService(tag7);
		
		Tags tag8= new Tags();
		tag8.setTagName("Spring");
		service.addTagsService(tag8);
		
		Tags tag9= new Tags();
		tag9.setTagName("Struts");
		service.addTagsService(tag9);
		
		Tags tag10= new Tags();
		tag10.setTagName("MVC Architecture");
		service.addTagsService(tag10);

		
	}

}
