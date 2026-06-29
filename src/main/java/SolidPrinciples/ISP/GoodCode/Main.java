package SolidPrinciples.ISP.GoodCode;

import SolidPrinciples.ISP.BadCode.Document;
import SolidPrinciples.ISP.BadCode.MultipurposeMachine;

public class Main {
    public static void main(String[] args) {

        Document d1=new Document("Viratkholi");
        Document d2=new Document("Rohit_Sharma");

        SimplePrinter simplePrinter = new SimplePrinter();
        simplePrinter.print(d1);
        System.out.println();
        MultipurposeMachine multipurposeMachine = new MultipurposeMachine();
        multipurposeMachine.scan(d2);

        System.out.println(simplePrinter);

    }
}
