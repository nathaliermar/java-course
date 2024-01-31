package Enum;

public class Person {

    private DocumentType documentType;
    private String numberDocument;


    public Person(){
        super();
    }

    public Person(DocumentType documentType, String numberDocument) {
        this.documentType = documentType;
        this.numberDocument = numberDocument;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public String getNumberDocument() {
        return numberDocument;
    }

    public void setNumberDocument(String numberDocument) {
        this.numberDocument = numberDocument;
    }

    @Override
    public String toString() {
        return "Person{" +
                "documentType=" + documentType +
                ", numberDocument='" + numberDocument + '\'' +
                '}';
    }
}
