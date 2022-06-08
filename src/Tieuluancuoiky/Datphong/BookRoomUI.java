package Tieuluancuoiky.Datphong;

import java.util.Scanner;

import Tieuluancuoiky.Yeucauthem.Action;

public class BookRoomUI {
    private static final String tienich = null;
    private static Scanner in = new Scanner(System.in);
    private Tieuluancuoiky.Yeucauthem.Action command;
    private BookingControler bookingControler;

    public BookRoomUI(String command, BookingControler bookingControler) {
        this.command = null;
        this.bookingControler = bookingControler;
    }

    // Action
    public String hanldCommand(String rep) {
        String cmd = rep.toUpperCase();
        this.command = Action.valueOf(cmd);
        if (this.command.equals(Action.YC)) {
            return "Enter a adress, a roomnumber";
        } else {
            return "Unkown command";
        }

    }

    public void hanldInput() {
        if (this.command.equals(Tieuluancuoiky.Yeucauthem.Action.YC)) {
            BookroomEntity bookroomEntity = bookRoomInput();
            BookingControler.bookroom(bookroomEntity.getDiachi(), bookroomEntity.getSophong());
        }
    }

    private static BookroomEntity bookRoomInput() {
        System.out.println("ADDRESS: ");
        String diachi = in.nextLine();
        System.out.println("ROOMNUMBER: ");
        String sophong = in.nextLine();
        return new BookroomEntity(diachi, sophong, tienich, 0, 0);
    }
}
