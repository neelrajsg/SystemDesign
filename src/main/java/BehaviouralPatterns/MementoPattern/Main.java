package BehaviouralPatterns.MementoPattern;

// this program make understand of this pattern by undo and redo example

public class Main {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor();
        CareTaker caretaker = new CareTaker(); //History / StateMgmt

        editor.write("A");
        caretaker.saveState(editor);

        editor.write("B");
        caretaker.saveState(editor);
        //Problem - > Undo the last write!
        editor.write("C");
        caretaker.saveState(editor);

        //CareTaker Undo
        caretaker.undo(editor);

        System.out.println(editor.getContent());
    }
}
