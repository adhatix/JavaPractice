public class Counter {
    private int clicks = 0;

    public void click() {
        ++this.clicks;
    }

    public int getClicks() {
        return this.clicks;
    }

    public void reset() {
        this.clicks = 0;
    }
}
