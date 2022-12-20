package sustc.cs209.github.service;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

@Service
public interface GeoService {

    @Nullable
    String countryOf(@Nullable String dist);
}
