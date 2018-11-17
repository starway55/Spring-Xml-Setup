package yunprac.com.example.springPrac.MainApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringPracApplication {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Printer printer = (Printer) context.getBean("printer");
		printer.printMessage();

//		ApplicationContext applicationContext = SpringApplication.run(SpringPracApplication.class, args);



		/*
		* what are beans?
		* what are their dependencies?
		* where to search for them?
		*
		*
		* */
	}
}
