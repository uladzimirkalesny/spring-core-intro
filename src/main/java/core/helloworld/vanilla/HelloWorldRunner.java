package core.helloworld.vanilla;

public class HelloWorldRunner {
    public static void main(String[] args) {
        MessageProvider provider = new HelloWorldMessageProvider();
        MessageRenderer renderer = new StandardOutMessageRenderer();

        renderer.setMessageProvider(provider);
        renderer.render();
    }
}
