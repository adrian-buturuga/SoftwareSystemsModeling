package bridge.view;

import bridge.Component;
import bridge.View;

public class SmallView implements View {

    private Component component;

    public SmallView(Component component) {
        this.component = component;
    }

    @Override
    public Component getComponent() {
        return component;
    }

    @Override
    public void showComponent() {
        final var small = "                      _ _ \n" +
                "  ___ _ __ ___   __ _| | |\n" +
                " / __| '_ ` _ \\ / _` | | |\n" +
                " \\__ \\ | | | | | (_| | | |\n" +
                " |___/_| |_| |_|\\__,_|_|_|";
        System.out.println(small + component.getComponentAsString());
    }

}
