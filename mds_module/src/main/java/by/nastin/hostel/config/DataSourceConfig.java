package by.nastin.hostel.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;


@Configuration
@EnableJpaRepositories(basePackages = "by.nastin.hostel.repository")
@PropertySource(value = "file:project.properties")
public class DataSourceConfig {

    @Value("${mds_module.datasource.hikari.driverClassName}")
    private String driver;
    @Value("${mds_module.datasource.hikari.url}")
    private String url;
    @Value("${mds_module.datasource.hikari.username}")
    private String username;
    @Value("${mds_module.datasource.hikari.password}")
    private String password;
    @Value("${mds_module.datasource.hibernate.dialect}")
    private String dialect;
    @Value("${mds_module.datasource.hibernate.hbm2ddl.auto}")
    private String hbm2ddlAuto;
    @Value("${mds_module.datasource.hikari.maximum-pool-size}")
    private Integer poolSize;
    @Value("${mds_module.datasource.hikari.pool-name}")
    private String poolName;

    @Bean(destroyMethod = "close")
    public DataSource dataSource(){
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDriverClassName(driver);
        hikariConfig.setJdbcUrl(url);
        hikariConfig.setUsername(username);
        hikariConfig.setPassword(password);
        hikariConfig.setMaximumPoolSize(poolSize);
        hikariConfig.setPoolName(poolName);
        HikariDataSource dataSource = new HikariDataSource(hikariConfig);
        return dataSource;
    }
}
