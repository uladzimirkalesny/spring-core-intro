package core.helloworld.xml;

import core.helloworld.vanilla.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldDependencyInjectionRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/helloworld/xml/app-context.xml");
        MessageRenderer renderer = applicationContext.getBean("renderer", MessageRenderer.class);
        renderer.render();
    }
}
