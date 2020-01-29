package core.principles.iocSpring.applicationContext.beanDeclaration.autowiredAndResourceSetter;

import core.principles.iocSpring.applicationContext.beanDeclaration.MessageProvider;
import core.principles.iocSpring.applicationContext.beanDeclaration.MessageRenderer;
import core.principles.iocSpring.applicationContext.beanDeclaration.StandardOutMessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("resourceMessageProvider")
class ResourceMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Resource works № 1";
    }
}

@Component("resourceMessageRenderer")
class ResourceStandardOutMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;

    @Override
    @Resource(name = "resourceMessageProvider")
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException("You must set the property messageProvider of class:" + StandardOutMessageRenderer.class
                    .getName());
        } else {
            System.out.println(messageProvider.getMessage());
        }
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}

public class ResourceRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:principles/iocSpring/autowiredAndResourceSetter/autowired.xml");
        MessageRenderer renderer = context.getBean("resourceMessageRenderer", MessageRenderer.class);
        renderer.render();
    }
}
