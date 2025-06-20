public class RemoteControl {
    private Command slot;

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void pressButton() {
        if (slot != null) {
            slot.execute();
        } else {
            System.out.println("No command assigned.");
        }
    }
}
