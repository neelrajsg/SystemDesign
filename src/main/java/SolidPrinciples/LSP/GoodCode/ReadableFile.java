package SolidPrinciples.LSP.GoodCode;

public class ReadableFile implements Readable {
    @Override
    public String read() {
        return "You can read and have Glance on this file";
    }
}
