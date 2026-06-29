package SolidPrinciples.ISP.GoodCode;

import SolidPrinciples.ISP.BadCode.Document;

public class MultiFuncPrinter implements Printer,Scanner,Coppier {
    @Override
    public void copy(Document doc) {
        System.out.println("Copying Document: "+doc);
    }

    @Override
    public void print(Document doc) {
        System.out.println("Printing Document: "+doc);
    }

    @Override
    public void scan(Document doc) {
        System.out.println("Scanning Document: "+doc);
    }
}
