package core.principles.iocSpring.parameterDI.simple;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("injectSimpleWithAnnotation")
public class InjectSimpleWithAnnotation {
    @Value("Paul Pierce")
    private String name;
    @Value("45")
    private int age;
    @Value("1.99")
    private float height;
    @Value("false")
    private boolean programmer;
    @Value("77777777")
    private Long ageInSeconds;

    @Override
    public String toString() {
        return "InjectSimpleWithAnnotation{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", programmer=" + programmer +
                ", ageInSeconds=" + ageInSeconds +
                '}';
    }

    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("classpath:principles/iocSpring/parameterDI/simple/injectSimpleParameterWithAnnotation.xml");
        InjectSimpleWithAnnotation injectSimpleWithAnnotation = context.getBean("injectSimpleWithAnnotation", InjectSimpleWithAnnotation.class);
        System.out.println(injectSimpleWithAnnotation);
    }
}
