package core.helloworld.vanillaFactory;

import core.helloworld.vanilla.MessageProvider;
import core.helloworld.vanilla.MessageRenderer;

import java.util.Properties;

public class MessageSupportFactory {
    private static MessageSupportFactory instance;

    static {
        instance = new MessageSupportFactory();
    }

    private Properties properties;
    private MessageRenderer renderer;
    private MessageProvider provider;

    private MessageSupportFactory() {
        try {
            properties = new Properties();
            this.properties.load(this.getClass().getResourceAsStream("/helloworld/vanillaFactory/msf.properties"));

            String rendererClass = this.properties.getProperty("renderer.class");
            String providerClass = this.properties.getProperty("provider.class");

            this.renderer = (MessageRenderer) Class.forName(rendererClass).newInstance();
            this.provider = (MessageProvider) Class.forName(providerClass).newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static MessageSupportFactory getInstance() {
        return instance;
    }

    public MessageRenderer getMessageRenderer() {
        return renderer;
    }

    public MessageProvider getMessageProvider() {
        return provider;
    }
}
