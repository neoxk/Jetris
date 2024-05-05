package jetris.events;

public class LineRemoveEvent extends Event{
    private int row;
    public LineRemoveEvent(int row) {
        this.row = row;
    }

    public int getRow() {
        return row;
    }
}
