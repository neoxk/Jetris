package jetris.events;

public class Event {
    private int type;
    private int payload;
    public static final int CONTROLLER_INPUT = 0;
    public static final int COLLISION = 1;

    public static final int CONTROLLER_VK_LEFT = 0;
    public static final int CONTROLLER_VK_RIGHT = 1;
    public static final int CONTROLLER_VK_SPACE = 2;


    public Event(int type, int payload) {
       this.type = type;
       this.payload = payload;
    }

    public int getType() {
        return type;
    }

    public int getPayload() {
        return payload;
    }
}
