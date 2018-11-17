package yunprac.com.example.springPrac.Services;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by yunzhao on 17/11/18.
 */
@Component
public class NoteServiceAnnotation {

    public void getNote(){

        System.out.println("Spring Configuration using component scan and annotation");
    }

    @PostConstruct
    public void postConstruct(){

        System.out.println("After construction of NoteServiceAnnotation bean, this gets called");
    }

    @PreDestroy
    public void preDestroy(){

        System.out.println("Before destruction of NoteSErviceAnnotation bean, this gets called");
    }
}
