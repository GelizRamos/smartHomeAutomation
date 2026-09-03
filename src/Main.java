public class Main {
    public static void main(String[] args) {
        centralHub hub = new centralHub();

        Device light = new Light();
        Command lightOn = new turnOnCommand(light);
        Command lightOff = new turnOffCommand(light);

        System.out.println("--- LIGHT ---");
        hub.setCommand(lightOn);
        hub.pressButton(); // Turn ON

        hub.setCommand(lightOff);
        hub.pressButton(); // Turn OFF

        Device music = new MusicPlayer();
        Command musicOn = new turnOnCommand(music);
        Command musicOff = new turnOffCommand(music);

        System.out.println("\n--- MUSIC PLAYER ---");
        hub.setCommand(musicOn);
        hub.pressButton();

        hub.setCommand(musicOff);
        hub.pressButton();

        Device aircon = new Aircon();
        Command airconOn = new turnOnCommand(aircon);
        Command airconOff = new turnOffCommand(aircon);

        System.out.println("\n--- AIRCON ---");
        hub.setCommand(airconOn);
        hub.pressButton();

        hub.setCommand(airconOff);
        hub.pressButton();
    }
}