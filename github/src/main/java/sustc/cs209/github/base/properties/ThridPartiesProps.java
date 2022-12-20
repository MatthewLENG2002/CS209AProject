package sustc.cs209.github.base.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties("third-parties")
public class ThridPartiesProps {

    @Autowired
    private GithubConfig github;

    @Autowired
    private PositionStackConfig positionstack;

    @Data
    @Configuration
    @ConfigurationProperties("third-parties.github")
    public static class GithubConfig {
        private String token;
    }

    @Data
    @Configuration
    @ConfigurationProperties("third-parties.positionstack")
    public static class PositionStackConfig {
        private String token;
    }
}
