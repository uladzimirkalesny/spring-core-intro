package core.helloworld.vanillaFactory;

import core.helloworld.vanilla.MessageProvider;

import java.io.IOException;
import java.util.Properties;

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
