package Command;

public class RemoveCommand implements Command {
    private Editor editor;

    public RemoveCommand(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.removed();
    }
    
}
