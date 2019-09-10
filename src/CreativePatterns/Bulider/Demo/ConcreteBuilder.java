package CreativePatterns.Bulider.Demo;

public class ConcreteBuilder extends Builder {
    public void buildPartA() {
        product.setPartA("建造 wall");
    }

    public void buildPartB() {
        product.setPartB("建造 sofa");
    }

    public void buildPartC() {
        product.setPartC("建造 windows");
    }
}
