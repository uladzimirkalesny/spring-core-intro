package core.principles.iocSpring.applicationContext.beanDeclaration.autowiredConstructor;

import core.principles.iocSpring.applicationContext.beanDeclaration.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("autowiredConfigurableMessageProviderWithoutValue")
public class AutowiredConfigurableMessageProviderWithoutValue implements MessageProvider {
    private String message;

    @Autowired
    public AutowiredConfigurableMessageProviderWithoutValue(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
