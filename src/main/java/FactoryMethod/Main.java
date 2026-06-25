package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        // Create a Word document using the factory method
        Document wordDoc = DocumentFactory.getDocument(DocumentFactory.DocumentType.WORD);
        wordDoc.open(); // Outputs: Opening Excel Document. (Should be "Opening Word Document.")

        // Create an Excel document using the factory method
        Document excelDoc = DocumentFactory.getDocument(DocumentFactory.DocumentType.EXCEL);
        excelDoc.open(); // Outputs: Opening Word Document. (Should be "Opening Excel Document.")
    }
}
