package Tieuluancuoiky.Yeucauthem;

import java.util.Scanner;

import Tieuluancuoiky.Datphong.BookingControler;
import Tieuluancuoiky.Datphong.BookroomEntity;

public class NoteUI {
    private static Scanner in = new Scanner(System.in);
    private Action command;
    private NewNoteController newNoteController;

    public NoteUI(String command, NewNoteController newNoteController) {
        this.command = null;
        this.newNoteController = newNoteController;
    }

    public NoteUI(NewNoteController newNoteController2) {
    }

    public String handcommand(String rep) {
        String cmd = rep.toUpperCase();
        this.command = Action.valueOf(cmd);
        if (this.command.equals(Action.YC)) {
            return "Enter a note";
        } else {
            return "Unkown command";
        }
    }

    public void hanldInput() {
        if (this.command.equals(Action.YC)) {
            BookroomEntity bookroomEntity = bookroomInput();
            NewNoteController.note(bookroomEntity.getYeucauthem());
        }
    }

    private static BookroomEntity bookroomInput() {
        System.out.println("NOTE SERVICE");
        // for (int i = 0; i < 20; i++) {
        String yeucauthem = in.nextLine();
        String sophong = in.nextLine();
        // break;
        // }
        return bookroomInput();
    }

    @Override
    public String toString() {
        return "NoteUI [command=" + command + ", newNoteController=" + newNoteController + "]";
    }

    public String handleCommands(String rep) {
        return null;
    }

    public void handleInputs() {
    }

}
