package SolidPrinciples.LSP.GoodCode;

public class Main {
    public static void readAnyFile(ReadableFile file){
        file.read();
    }
    public static void main(String[] args) {
        ReadableFile readableFile = new ReadableFile();
        readableFile.read();
        WriteableFile writeableFile = new WriteableFile();
        writeableFile.write();
        writeableFile.read();

        readAnyFile(readableFile);
        readAnyFile(writeableFile);
        System.out.println("You can read this file  ");
        System.out.println(readableFile.read());

    }
}
