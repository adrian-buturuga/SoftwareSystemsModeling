package bridge.api;

import bridge.Component;

public class VideoComponent implements Component {

    @Override
    public String getComponentAsString() {
        return "        _     _            \n" +
                " __   _(_) __| | ___  ___  \n" +
                " \\ \\ / / |/ _` |/ _ \\/ _ \\ \n" +
                "  \\ V /| | (_| |  __/ (_) |\n" +
                "   \\_/ |_|\\__,_|\\___|\\___/ ";
    }

}
