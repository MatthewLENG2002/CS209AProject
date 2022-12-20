package sustc.cs209.github.base.bean;

import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Configuration
public class HttpConfig {

    @Bean
    public OkHttpClient okHttpClient() {
        return new OkHttpClient.Builder()
                .connectionPool(new ConnectionPool())
                .connectTimeout(Duration.ofSeconds(3))
                .readTimeout(Duration.ofMinutes(1))
                .retryOnConnectionFailure(true)
                .build();
    }
}
