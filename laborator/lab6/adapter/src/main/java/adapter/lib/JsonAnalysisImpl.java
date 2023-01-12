package adapter.lib;

import org.json.JSONObject;
public class JsonAnalysisImpl implements JsonAnalysisLibrary {

    @Override
    public String analiseStockData(JSONObject json) {
        String symbol = json.getJSONObject("company").getString("symbol");
        String conclusion = "and symbol is: " + symbol;
        System.out.println(conclusion);
        return conclusion;
    }
    
}
