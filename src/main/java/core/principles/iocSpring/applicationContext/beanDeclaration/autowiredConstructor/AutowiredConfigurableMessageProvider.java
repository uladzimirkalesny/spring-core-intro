package core.principles.iocSpring.applicationContext.beanDeclaration.autowiredConstructor;

import core.principles.iocSpring.applicationContext.beanDeclaration.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("autowiredConfigurableMessageProvider")
public class AutowiredConfigurableMessageProvider implements MessageProvider {
    private String message;

    @Autowired
    public AutowiredConfigurableMessageProvider(@Value("Test message with Value annotation") String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
