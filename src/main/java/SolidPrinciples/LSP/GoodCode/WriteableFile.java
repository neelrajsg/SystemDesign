package SolidPrinciples.LSP.GoodCode;

public class WriteableFile extends ReadableFile implements Writeable {
    @Override
    public String write() {
        return "You can read this file";
    }
}
