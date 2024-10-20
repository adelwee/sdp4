public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Command tvOnCommand = new TurnTVOn(tv);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(tvOnCommand);

        remote.pressButton();
        remote.pressUndo();
    }
}