package core.principles.iocSpring.idAndName;

public class Audi implements Car {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "name='" + name + '\'' +
                '}';
    }
}
