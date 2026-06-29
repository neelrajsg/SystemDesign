package SolidPrinciples.ISP.BadCode;

import SolidPrinciples.LSP.GoodCode.Writeable;

public class MultipurposeMachine implements Machine {

    @Override
    public void print(Document doc) {
        System.out.println("MultipurposeMachine Printing");
    }

    @Override
    public void scan(Document doc) {
        System.out.println("MultipurposeMachine Scanning");
    }

    @Override
    public void copy(Document doc) {
        System.out.println("MultipurposeMachine Copying");

    }
}
