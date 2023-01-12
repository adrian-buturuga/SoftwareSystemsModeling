package adapter.client;

import org.w3c.dom.Document;

public class DocumentAnalysis implements Analysis {

    @Override
    public String analiseXML(Document document) {
        final var conclusion = "Conclusion: company name is " +
                document.getDocumentElement().getElementsByTagName("name").item(0).getTextContent();
        System.out.println(conclusion);
        return conclusion;
    }

}
