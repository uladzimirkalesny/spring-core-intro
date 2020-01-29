package core.principles.iocSpring.applicationContext.beanDeclaration;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Properties;

@Component("messageFromPropertiesProvider")
public class MessageFromPropertiesProvider implements MessageProvider {
    private Properties properties = new Properties();

    public String getMessage() {
        String message = null;

        try {
            this.properties.load(this.getClass().getResourceAsStream("/helloworld/vanillaFactory/message.properties"));
            message = this.properties.getProperty("message");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return message;
    }
}
