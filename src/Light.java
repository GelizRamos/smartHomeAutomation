public class Light implements Device {
    public void turnOn() {
        System.out.println("Light is ON: Brightness set to 100%.");
    }
    public void turnOff() {
        System.out.println("Light is OFF.");
    }
}