package by.nastin.hotel;

import by.nastin.hotel.config.ConfigProject;
import by.nastin.hotel.repository.FeedbackRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;


public class RatingModuleApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ConfigProject.class, args);
		MongoTemplate mongoTemplate = (MongoTemplate) applicationContext.getBean(MongoTemplate.class);
		mongoTemplate.getCollectionNames().forEach(it-> System.out.println(it));
		mongoTemplate.getDb().getCollection("feedback").createIndex("idHotel");
		mongoTemplate.getDb().getCollection("feedback").getIndexInfo().forEach(it-> System.out.println(it));
		FeedbackRepository feedbackRepository = (FeedbackRepository) applicationContext.getBean("feedbackRepository");
		feedbackRepository.findAll().forEach(it-> System.out.println(it));
	}
}
