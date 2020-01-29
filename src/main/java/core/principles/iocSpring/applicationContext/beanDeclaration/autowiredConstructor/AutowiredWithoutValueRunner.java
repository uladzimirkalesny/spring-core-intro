package core.principles.iocSpring.applicationContext.beanDeclaration.autowiredConstructor;

import core.principles.iocSpring.applicationContext.beanDeclaration.MessageProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AutowiredWithoutValueRunner {
    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("classpath:principles/iocSpring/autowiredConstructorDI/autowiredConstructorDI.xml");
        MessageProvider providerWithoutValue = context.getBean("autowiredConfigurableMessageProviderWithoutValue", MessageProvider.class);
        System.out.println("message = " + providerWithoutValue.getMessage());
    }
}
