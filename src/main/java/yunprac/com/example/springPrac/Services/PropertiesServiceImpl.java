package yunprac.com.example.springPrac.Services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by yunzhao on 17/11/18.
 */
@Service
public class PropertiesServiceImpl {

    @Value("${service.url}")
    private String url;

    public String getServiceURL(){

        return url;
    }
}
