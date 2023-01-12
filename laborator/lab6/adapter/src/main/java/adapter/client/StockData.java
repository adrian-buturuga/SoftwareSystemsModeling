package adapter.client;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class StockData implements StockDataAPI {

    public Document getStockDataInfo() {
        try {
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();
            // root element

            // employee element
            Element company = document.createElement("company");

            document.appendChild(company);

            // set an attribute to staff element
            Element name = document.createElement("name");
            name.appendChild(document.createTextNode("Apple"));
            company.appendChild(name);

            Element symbol = document.createElement("symbol");
            symbol.appendChild(document.createTextNode("AAPL"));
            company.appendChild(symbol);

            Element ceo = document.createElement("ceo");
            ceo.appendChild(document.createTextNode("Tim Cook"));
            company.appendChild(ceo);
            return document;

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("Failed to get xml document");
    }
}
