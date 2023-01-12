package adapter;

import adapter.client.Analysis;
import adapter.lib.JsonAnalysisLibrary;
import org.json.XML;
import org.w3c.dom.Document;

import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;

public class XMLToJSONAdapter implements Analysis {

    private final JsonAnalysisLibrary jsonLibrary;

    public XMLToJSONAdapter(JsonAnalysisLibrary jsonAnalysisLibrary) {
        this.jsonLibrary = jsonAnalysisLibrary;
    }

    @Override
    public String analiseXML(Document document) {
        try {
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            StringWriter writer = new StringWriter();
            transformer.transform(new DOMSource(document), new StreamResult(writer));
            String output = writer.getBuffer().toString().replaceAll("\n|\r", "");
            var jsonObject = XML.toJSONObject(output);

            return jsonLibrary.analiseStockData(jsonObject);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }
    }

}
