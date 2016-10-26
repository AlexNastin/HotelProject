package by.nastin.hostel.config;

import by.nastin.hostel.config.DataSourceConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@Configuration
@Import(DataSourceConfig.class)
@PropertySource(value = "file:..\\project.properties"/*, ignoreResourceNotFound = true*/)
public class MdsModuleApplicationConfig {

	@Bean
	public DataSource dataSource(){
		EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
		return builder
				.setType(EmbeddedDatabaseType.HSQL)
				.addScript("../db_hostelproject.sql")
				.build();
	}
}
