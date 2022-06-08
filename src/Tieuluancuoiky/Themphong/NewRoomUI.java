package Tieuluancuoiky.Themphong;

import java.util.Scanner;

import Tieuluancuoiky.Action;
import Tieuluancuoiky.Datphong.BookroomEntity;

public class NewRoomUI {
    private static Scanner in = new Scanner(System.in);
    private Action command;
    private NewRoomController newRoomController;

    public NewRoomUI(String command, NewRoomController newRoomController) {
        this.command = null;
        this.newRoomController = newRoomController;
    }

    public String hanldcomand(String rep) {
        String cmd = rep.toUpperCase();
        this.command = Tieuluancuoiky.Yeucauthem.Action.valueOf(cmd);

        if (this.command.equals(Tieuluancuoiky.Yeucauthem.Action.NE())) {
            return "Nhập vào diachi, sophong, dientich, tienich, gia";
        } else {
            return "không hiểu lệnh";
        }
    }

    public void hanldInput() {
        if (this.command.equals(Tieuluancuoiky.Yeucauthem.Action.NE())) {
            BookroomEntity bookroomEntity = newRoomInput();
            this.newRoomController.newRoomInput(bookroomEntity.getDiachi(), bookroomEntity.getDientich(),
                    bookroomEntity.getGia(), bookroomEntity.getSophong(), bookroomEntity.getTienich());
        }
    }

    public BookroomEntity newRoomInput() {
        System.out.println("địa chỉ");
        String diachi = in.nextLine();
        System.out.println("số phòng");
        String sophong = in.nextLine();
        System.out.println("diện tích");
        String dientich = in.nextLine();
        System.out.println("giá");
        float gia = in.nextFloat();
        System.out.println("tiện ích");
        Boolean tienich = in.nextBoolean();
        return new BookroomEntity(diachi, sophong, tienich, gia, dientich)
    }

    @Override
    public String toString() {
        return "NewRoomUI [command=" + command + ", newRoomController=" + newRoomController + "]";
    }

}
