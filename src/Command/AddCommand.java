package Command;

public class AddCommand implements Command {
    private Editor editor;

    public AddCommand(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.added();
    }
}
