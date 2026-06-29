package SolidPrinciples.ISP.BadCode;

public class SimplePrinter implements Machine{
    @Override
    public void print(Document doc) {
        System.out.println("Hello World");
    }

    @Override
    public void scan(Document doc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void copy(Document doc) {
        throw   new UnsupportedOperationException("Not supported yet.");
    }
}
