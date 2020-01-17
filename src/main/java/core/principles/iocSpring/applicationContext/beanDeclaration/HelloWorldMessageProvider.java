package core.principles.iocSpring.applicationContext.beanDeclaration;

import org.springframework.stereotype.Component;

@Component("messageProvider")
public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
