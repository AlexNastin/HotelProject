package by.nastin.hotel.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@SpringBootApplication
@EnableMongoRepositories(basePackages = "by.nastin.hotel.repository")
@PropertySource(value = "file:project.properties")
public class ConfigProject {

}
