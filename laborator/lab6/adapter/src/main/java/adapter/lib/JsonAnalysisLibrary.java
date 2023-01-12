package adapter.lib;

import org.json.JSONObject;

import java.util.Map;

public interface JsonAnalysisLibrary {

    /**
     * Analises stock data. Accepts a json object as input
     * @return a string with conclusion
     */
    String analiseStockData(JSONObject json);

}
