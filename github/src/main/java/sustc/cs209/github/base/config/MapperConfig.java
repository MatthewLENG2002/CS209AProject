package sustc.cs209.github.base.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@MapperScan(basePackages = "sustc.cs209.github.dao.mapper")
public class MapperConfig {
}
