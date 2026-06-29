package SolidPrinciples.LSP.BadCode;

public class Main {
    public static void main(String[] args) {
        File fs=new ReadOnlyFile();
        fs.write();
        fs.read();
    }
}
