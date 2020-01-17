package core.principles.iocSpring.applicationContext.beanDeclaration;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponentsRunner {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();

        context.load("classpath:principles/iocSpring/applicationContext/context-base-template.xml");
        context.refresh();

        MessageRenderer messageRenderer = context.getBean("messageRenderer", MessageRenderer.class);
        messageRenderer.render();

        context.close();
    }
}
