package jetris.events;

import jetris.pieces.Line;

import java.util.ArrayList;

public class EventBus {

    private static ArrayList<LineRemoveListener> lineRemoveListeners = new ArrayList<>();

    public static void dispatch(Event e) {
        for (LineRemoveListener listener : lineRemoveListeners) listener.lineRemoved(0);
    }

}
