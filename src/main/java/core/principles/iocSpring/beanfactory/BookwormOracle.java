package core.principles.iocSpring.beanfactory;

public class BookwormOracle implements Oracle {
    private Encyclopedia encyclopedia;

    @Override
    public String defineMeaningOfLife() {
        return "Encyclopedias are а waste of money - go see the world instead";
    }

    public Encyclopedia getEncyclopedia() {
        return encyclopedia;
    }

    public void setEncyclopedia(Encyclopedia encyclopedia) {
        this.encyclopedia = encyclopedia;
    }
}
