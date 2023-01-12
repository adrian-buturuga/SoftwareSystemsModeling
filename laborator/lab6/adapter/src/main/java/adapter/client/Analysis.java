package adapter.client;

import org.w3c.dom.Document;

public interface Analysis {

    /**
     * analises content of xml file
     * @param document
     * @return string with conclusion
     */
    String analiseXML(Document document);

}
