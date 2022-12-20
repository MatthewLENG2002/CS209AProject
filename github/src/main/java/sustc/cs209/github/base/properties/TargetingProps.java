package sustc.cs209.github.base.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.List;

@Data
@Configuration
@ConfigurationProperties("targeting")
public class TargetingProps {

    private List<String> repositories;

    private DataSource dataSource;
}
