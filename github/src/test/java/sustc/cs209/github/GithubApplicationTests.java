package sustc.cs209.github;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.annotation.DirtiesContext;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@DirtiesContext
class GithubApplicationTests {

    @Autowired
    ApplicationContext ctx;

    @Test
    void contextLoads() {
        assertThat(ctx).isNotNull();
    }
}
