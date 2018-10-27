package yunprac.com.example.springPrac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringPracApplication {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Printer printer = (Printer) context.getBean("printer");
		printer.printMessage();

//		SpringApplication.run(SpringPracApplication.class, args);

		/*
		* what are beans?
		* what are their dependencies?
		* where to search for them?
		*
		*
		* */
	}
}
