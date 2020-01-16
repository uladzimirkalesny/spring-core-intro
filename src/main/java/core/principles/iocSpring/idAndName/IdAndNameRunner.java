package core.principles.iocSpring.idAndName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IdAndNameRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:principles/iocSpring/idAndName/app-context.xml");
        Person person = context.getBean(Person.class);
        System.out.println("person = " + person);
    }
}
