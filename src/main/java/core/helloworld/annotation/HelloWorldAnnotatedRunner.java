package core.helloworld.annotation;

import core.helloworld.vanilla.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldAnnotatedRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        MessageRenderer renderer = applicationContext.getBean("renderer", MessageRenderer.class);
        renderer.render();
    }
}
