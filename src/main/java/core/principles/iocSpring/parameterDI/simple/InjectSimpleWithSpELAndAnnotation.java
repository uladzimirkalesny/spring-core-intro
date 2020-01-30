package core.principles.iocSpring.parameterDI.simple;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("injectSimpleConfigAnnotation")
class InjectSimpleConfigAnnotation {
    private String name = "Martin Fowler";
    private int age = 45;
    private float height = 1.89f;
    private boolean programmer = true;
    private Long ageInSeconds = 4444444444L;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public boolean isProgrammer() {
        return programmer;
    }

    public Long getAgeInSeconds() {
        return ageInSeconds;
    }
}

@Service("injectSimpleWithSpELAndAnnotation")
public class InjectSimpleWithSpELAndAnnotation {
    @Value("#{injectSimpleConfigAnnotation.name}")
    private String name;
    @Value("#{injectSimpleConfigAnnotation.age}")
    private int age;
    @Value("#{injectSimpleConfigAnnotation.height}")
    private float height;
    @Value("#{injectSimpleConfigAnnotation.programmer}")
    private boolean programmer;
    @Value("#{injectSimpleConfigAnnotation.ageInSeconds}")
    private Long ageInSeconds;

    @Override
    public String toString() {
        return "InjectSimpleWithSpELAndAnnotation{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", programmer=" + programmer +
                ", ageInSeconds=" + ageInSeconds +
                '}';
    }

    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("classpath:principles/iocSpring/parameterDI/simple/injectSimpleParameterWithSpELAndAnnotation.xml");
        InjectSimpleWithSpELAndAnnotation injectSimpleWithSpELAndAnnotation = context.getBean("injectSimpleWithSpELAndAnnotation", InjectSimpleWithSpELAndAnnotation.class);
        System.out.println(injectSimpleWithSpELAndAnnotation);
    }
}