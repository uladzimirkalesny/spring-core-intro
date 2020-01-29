package core.principles.iocSpring.applicationContext.beanDeclaration;

import core.principles.iocSpring.idAndName.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = {
        "classpath:principles/iocSpring/importResource/app-context1.xml",
        "classpath:principles/iocSpring/importResource/app-context2.xml"})
@Configuration
class ImportResourceConfiguration {
}

public class ImportResourceRunner {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ImportResourceConfiguration.class);
        Person vasya = ctx.getBean("vasya", Person.class);
        Person jane = ctx.getBean("jane", Person.class);
        System.out.println("vasya = " + vasya);
        System.out.println("jane = " + jane);
    }
}
