package core.helloworld.annotation;

import core.helloworld.vanilla.HelloWorldMessageProvider;
import core.helloworld.vanilla.MessageProvider;
import core.helloworld.vanilla.MessageRenderer;
import core.helloworld.vanilla.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
    /*
        <bean id="provider" class="core.helloworld.vanilla.HelloWorldMessageProvider"/>
     */
    @Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }

    /*
        <bean id="renderer" class="core.helloworld.vanilla.StandardOutMessageRenderer" p:messageProvider-ref="provider"/>
     */
    @Bean
    public MessageRenderer renderer() {
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());

        return renderer;
    }
}
