package FactoryMethod;

public class DocumentFactory {
    // Enum to define supported document types
    public enum DocumentType {
        WORD, EXCEL
    }

    // Factory method to create documents based on the type
    public static Document getDocument(DocumentType type) {
        switch (type) {
            case WORD:
                return new WordDocument();
            case EXCEL:
                return new ExcelDocument();
            default:
                throw new IllegalArgumentException("Unknown document type: " + type);
        }
    }
}
