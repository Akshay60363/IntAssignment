package Factory;
interface Document {
    void open();
}
class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Word Document opened.");
    }
}

class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("PDF Document opened.");
    }
}

abstract class DocumentFactory {
    public abstract Document createDocument();
}

class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
public class Factory {
    public static void main(String[] args) {
        DocumentFactory factory = new WordDocumentFactory();
        Document document = factory.createDocument();
        document.open();

        factory = new PdfDocumentFactory();
        document = factory.createDocument();
        document.open();
    }
}
