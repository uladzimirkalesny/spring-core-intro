package core.principles.iocSpring.parameterDI.simple;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("injectSimpleConfig")
class InjectSimpleConfig {
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

public class InjectSimpleWithSpEL {
    private String name;
    private int age;
    private float height;
    private boolean programmer;
    private Long ageInSeconds;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public boolean isProgrammer() {
        return programmer;
    }

    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }

    public Long getAgeInSeconds() {
        return ageInSeconds;
    }

    public void setAgeInSeconds(Long ageInSeconds) {
        this.ageInSeconds = ageInSeconds;
    }

    @Override
    public String toString() {
        return "InjectSimpleWithSpEL{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", programmer=" + programmer +
                ", ageInSeconds=" + ageInSeconds +
                '}';
    }

    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("classpath:principles/iocSpring/parameterDI/simple/InjectSimpleParameterWithSpEL.xml");
        InjectSimpleWithSpEL injectSimpleSpEL = context.getBean("injectSimpleSpEL", InjectSimpleWithSpEL.class);
        System.out.println(injectSimpleSpEL);
    }
}