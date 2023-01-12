package bridge.view;

import bridge.Component;
import bridge.View;

public class LargeView implements View {

    private Component component;
    
    public LargeView(Component component) {
        this.component = component;
    }

    @Override
    public Component getComponent() {
        return component;
    }

    @Override
    public void showComponent() {
        final var large = "  _                      \n" +
                " | | __ _ _ __ __ _  ___ \n" +
                " | |/ _` | '__/ _` |/ _ \\\n" +
                " | | (_| | | | (_| |  __/\n" +
                " |_|\\__,_|_|  \\__, |\\___|\n" +
                "              |___/      ";
        System.out.println(large + component.getComponentAsString());
    }
}
