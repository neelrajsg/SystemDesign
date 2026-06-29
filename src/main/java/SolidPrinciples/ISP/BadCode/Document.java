package SolidPrinciples.ISP.BadCode;

public class Document {

    String docname;
    public Document(String docname) {
        this.docname = docname;
    }
    public String getDocname() {
        return docname;
    }
}
