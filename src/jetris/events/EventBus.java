package jetris.events;

import java.util.ArrayList;

public class EventBus {
    public static ArrayList<Listener> controlsListeners = new ArrayList<>();

    public static void subscribe_controller(Listener listener) {
        controlsListeners.add(listener);
    }

    public static void unsubscribe_controller(Listener listener) {
        controlsListeners.remove(listener);
    }

    public static void dispatch(Event e) {
        switch (e.getType()) {
            case Event.CONTROLLER_INPUT:
                for (Listener listener : controlsListeners) listener.listen(e); break;

        }

    }

}
