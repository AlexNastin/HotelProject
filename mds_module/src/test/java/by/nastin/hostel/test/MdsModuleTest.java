package by.nastin.hostel.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MdsModuleTest {


    @Test
    public void contextLoads() {
//        HibernateEntityManagerFactory entityManagerFactory = (HibernateEntityManagerFactory) applicationContext.getBean("entityManagerFactory");
//        System.out.println(entityManagerFactory.getProperties().get("hibernate.connection.datasource"));
    }
}
