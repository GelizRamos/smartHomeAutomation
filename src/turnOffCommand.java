public class turnOffCommand implements Command {
    private Device device;

    public turnOffCommand(Device device) {
        this.device = device;
    }

    public void execute() {
        device.turnOff();
    }
}