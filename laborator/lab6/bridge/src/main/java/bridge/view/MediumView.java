package bridge.view;

import bridge.Component;
import bridge.View;

public class MediumView implements View {
    private Component component;

    public MediumView(Component component) {
        this.component = component;
    }

    @Override
    public Component getComponent() {
        return component;
    }

    @Override
    public void showComponent() {
        final var medium = "                    _ _                 \n" +
                "  _ __ ___   ___  __| (_)_   _ _ __ ___  \n" +
                " | '_ ` _ \\ / _ \\/ _` | | | | | '_ ` _ \\ \n" +
                " | | | | | |  __/ (_| | | |_| | | | | | |\n" +
                " |_| |_| |_|\\___|\\__,_|_|\\__,_|_| |_| |_|\n" +
                "                                         ";
        System.out.println(medium + component.getComponentAsString());
    }
}
