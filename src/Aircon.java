public class Aircon implements Device {
    private int temperature = 24;

    public void turnOn() {
        System.out.println("Aircon is ON: Temperature set to " + temperature + "°C.");
    }

    public void turnOff() {
        System.out.println("Aircon is OFF.");
    }
}