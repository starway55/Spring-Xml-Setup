package yunprac.com.example.springPrac.MainApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import yunprac.com.example.springPrac.Services.NoteService;
import yunprac.com.example.springPrac.Services.NoteServiceImpl;

/**
 * Created by yunzhao on 17/11/18.
 */
@Configuration
@ComponentScan("yunprac.com.example.springPrac.Services")
public class SpringPackageScanConfig {

    @Bean
    public NoteService noteService() {

        return new NoteServiceImpl();
    }
}
