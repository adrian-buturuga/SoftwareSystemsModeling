package adapter.client;

import org.w3c.dom.Document;

public interface StockDataAPI {

    /**
     * Calls an endpoint that returns a xml
     * @return document
     */
    Document getStockDataInfo();

}
