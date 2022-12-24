package sustc.cs209.github;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import sustc.cs209.github.base.properties.TargetingProps;
import sustc.cs209.github.dao.mapper.RepositoryMapper;
import sustc.cs209.github.service.RepositoryService;
import sustc.cs209.github.service.impl.RepositoryServiceImpl;

@SpringBootApplication
@EnableAsync
@Configuration
@EnableCaching
@EnableTransactionManagement
@Slf4j
public class GithubApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(GithubApplication.class, args);
    }
}
