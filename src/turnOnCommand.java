public class turnOnCommand implements Command {
    private Device device;

    public turnOnCommand(Device device) {
        this.device = device;
    }

    public void execute() {
        device.turnOn();
    }
}