public class WaterBottle {

    private int volume;

    public WaterBottle() {
        this.volume = 100;
    }

    public int getVolume() {
        return this.volume;
    }

    public int drink() {
        return this.volume - 10;
    }

    public void empty() {
        this.volume = 0;
    }
}
