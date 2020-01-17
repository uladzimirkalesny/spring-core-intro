package core.principles.iocSpring.applicationContext.beanDeclaration;

public interface MessageRenderer {
    void render();

    void setMessageProvider(MessageProvider provider);

    MessageProvider getMessageProvider();
}
