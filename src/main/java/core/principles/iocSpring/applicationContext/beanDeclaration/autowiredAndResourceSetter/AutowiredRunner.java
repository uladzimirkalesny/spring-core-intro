package core.principles.iocSpring.applicationContext.beanDeclaration.autowiredAndResourceSetter;

import core.principles.iocSpring.applicationContext.beanDeclaration.MessageProvider;
import core.principles.iocSpring.applicationContext.beanDeclaration.MessageRenderer;
import core.principles.iocSpring.applicationContext.beanDeclaration.StandardOutMessageRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("autowiredMessageProvider")
class AutowiredMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Autowired works № 1";
    }
}

@Component("autowiredMessageProvider2")
class AutowiredMessageProvider2 implements MessageProvider {
    @Override
    public String getMessage() {
        return "Autowired works # 2";
    }
}

@Component("autowiredMessageRenderer")
class AutowiredStandardOutMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;

    @Override
    @Autowired
    @Qualifier("autowiredMessageProvider2")
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

public class AutowiredRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:principles/iocSpring/autowiredAndResourceSetter/autowired.xml");
        MessageRenderer renderer = context.getBean("autowiredMessageRenderer", MessageRenderer.class);
        renderer.render();
    }
}
