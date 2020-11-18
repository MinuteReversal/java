package OOP;

class Notepad {
    String content;

    Notepad(String content) {
        this.content = content;
    }
}

public class DemoReference {
    public static void main(String[] args) {
        Notepad notepad = new Notepad("hello world");
        System.out.println(notepad.content);

        Notepad notepad2 = notepad;
        notepad2.content = "111";
        System.out.println(notepad.content);
    }
}
