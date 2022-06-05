package Tieuluancuoiky.Yeucauthem;

import java.util.ArrayList;
import java.util.List;
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
            List<Object> list = noteInput();
            NewNoteController.note(list.get(0).toString(), list.get(1));
        }
    }

    private static List<Object> noteInput() {
        List<Object> list = new ArrayList<>();
        System.out.println("NOTE SERVICE");
        // for (int i = 0; i < 20; i++) {
        String sophong = in.nextLine();
        String yeucauthem = in.nextLine();

        // break;
        // }
        list.add(sophong);
        list.add(yeucauthem);
        return noteInput();
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
