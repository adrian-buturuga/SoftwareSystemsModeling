package bridge.api;

import bridge.Component;

public class ProfileComponent implements Component {

    @Override
    public String getComponentAsString() {
        return "                   __ _ _      \n" +
                "  _ __  _ __ ___  / _(_) | ___ \n" +
                " | '_ \\| '__/ _ \\| |_| | |/ _ \\\n" +
                " | |_) | | | (_) |  _| | |  __/\n" +
                " | .__/|_|  \\___/|_| |_|_|\\___|\n" +
                " |_|     ";
    }
}
