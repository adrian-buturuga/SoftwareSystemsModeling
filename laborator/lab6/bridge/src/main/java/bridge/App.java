package bridge;

import bridge.api.ProfileComponent;
import bridge.api.VideoComponent;
import bridge.view.LargeView;
import bridge.view.MediumView;

public class App 
{
    public static void main( String[] args ) {
        Component video = new VideoComponent();
        View largeView = new LargeView(video);
        largeView.showComponent();

    }
}
