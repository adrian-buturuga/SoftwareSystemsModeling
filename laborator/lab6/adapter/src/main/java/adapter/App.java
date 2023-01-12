package adapter;

import adapter.client.Analysis;
import adapter.client.DocumentAnalysis;
import adapter.client.StockData;
import adapter.client.StockDataAPI;
import adapter.lib.JsonAnalysisImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        final StockDataAPI stockData = new StockData();
        final var document = stockData.getStockDataInfo();

        final Analysis analysis = new DocumentAnalysis();
        analysis.analiseXML(document);

        final Analysis analysis1 = new XMLToJSONAdapter(new JsonAnalysisImpl());
        analysis1.analiseXML(document);
    }
}
