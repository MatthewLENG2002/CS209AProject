package sustc.cs209.github.service.impl;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import sustc.cs209.github.base.properties.ThridPartiesProps;
import sustc.cs209.github.service.GeoService;

@Service
public class GeoServiceImpl implements GeoService {

    @Autowired
    private OkHttpClient httpClient;

    @Autowired
    private ThridPartiesProps thridPartiesProps;

    @Override
    @Cacheable
    public String countryOf(String dist) {
        if (!StringUtils.hasText(dist)) {
            return null;
        }
//        Request req = new Request.Builder()
//                .get()
        return null;
    }
}
