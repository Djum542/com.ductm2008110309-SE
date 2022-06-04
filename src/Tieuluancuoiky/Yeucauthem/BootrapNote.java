package Tieuluancuoiky.Yeucauthem;

import java.util.Scanner;

import Tieuluancuoiky.Datphong.BookroomEntity;

public class BootrapNote {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("************* MENU *********");
        Scanner inpuScanner = new Scanner(System.in);
        BookroomEntity bookroomEntity = new BookroomEntity();
        NewNoteController newNoteController;
        newNoteController = new NewNoteController(bookroomEntity);
        // tao ra ghi chu lai yeu cau them cua khach hang
        NoteUI noteUI = new NoteUI(newNoteController);
        System.out.println("Welcome to the luxury hotel System!!\n (To exit type 'exit') \n");

        while (true) {
            Thread.sleep(5000);
            displayOptions(newNoteController);
            getPrompt(newNoteController);
            // chon
            // command
            String rep = inpuScanner.nextLine();

            String resCmd;
            if (rep.toUpperCase().equals(Action.YC.toString())) {
                resCmd = noteUI.handleCommands(rep);// ?????
                System.out.println(resCmd);
                // if(resCmd != null && !resCmd.equals("Unkown command.")){
                noteUI.handleInputs();
                // }

            } else if (rep.toUpperCase().equals(Action.YC.toString())) {
                resCmd = noteUI.handleCommands(rep);
                System.out.println(resCmd);
                noteUI.handleInputs();
            }

            // LI
            // String cmd = handleCommands(rep);

            // if(cmd != null && !cmd.equals("Unkown command.")){
            // System.out.println(cmd);
            // uiTerminal.handleInputs();
            // }
            // inpuScanner.nextLine();

        }
    }

    // B-C-E
    public static void displayOptions(NewNoteController newNoteController) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~CRS MENU~~~~~~~~~~~~~~~~~~~");
        // check
        if (!newNoteController.getBookroomEntity().bookroomValid()) {

            System.out.println("Enter one of the commands in the brackets:\n" +
                    "[CA] Create Account\n" +
                    "[LI] Login");
        } else {

            System.out.println("Enter on of the commands in brackets:\n " +
                    "[LO] Logout");
        }
    }

    public static String getPrompt(NewNoteController newNoteController) {

        // check
        if (!NewNoteController.getBookroomEntity().bookroomValid()) {
            return "";
        }

        return "note room# " + newNoteController.getBookroomEntity().getSophong();

    }
}
