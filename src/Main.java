public class Main {
    public static void main(String[] args) {
        CentralHub hub = new CentralHub();

        Device light = new Light();
        Command lightOn = new TurnOnCommand(light);
        Command lightOff = new TurnOffCommand(light);

        System.out.println("--- LIGHT ---");
        hub.setCommand(lightOn);
        hub.pressButton(); // Turn ON

        hub.setCommand(lightOff);
        hub.pressButton(); // Turn OFF

        Device music = new MusicPlayer();
        Command musicOn = new TurnOnCommand(music);
        Command musicOff = new TurnOffCommand(music);

        System.out.println("\n--- MUSIC PLAYER ---");
        hub.setCommand(musicOn);
        hub.pressButton();

        hub.setCommand(musicOff);
        hub.pressButton();

        Device aircon = new Aircon();
        Command airconOn = new TurnOnCommand(aircon);
        Command airconOff = new TurnOffCommand(aircon);

        System.out.println("\n--- AIRCON ---");
        hub.setCommand(airconOn);
        hub.pressButton();

        hub.setCommand(airconOff);
        hub.pressButton();
    }
}