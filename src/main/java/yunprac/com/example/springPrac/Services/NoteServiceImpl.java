package yunprac.com.example.springPrac.Services;

import org.springframework.stereotype.Service;

/**
 * Created by yunzhao on 17/11/18.
 */
@Service
public class NoteServiceImpl implements NoteService {

    @Override
    public void getNote() {

        System.out.println("Spring Component scan with application context");
    }
}
