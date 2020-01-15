package core.helloworld.vanillaFactory;

import core.helloworld.vanilla.MessageProvider;
import core.helloworld.vanilla.MessageRenderer;

public class HelloWorldWithFactoryRunner {
    public static void main(String[] args) {
        MessageSupportFactory FACTORY_INSTANCE = MessageSupportFactory.getInstance();

        MessageRenderer renderer = FACTORY_INSTANCE.getMessageRenderer();
        MessageProvider provider = FACTORY_INSTANCE.getMessageProvider();

        renderer.setMessageProvider(provider);
        renderer.render();
    }
}
