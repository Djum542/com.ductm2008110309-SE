package Tieuluancuoiky.Themphong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Tieuluancuoiky.Datphong.BookroomEntity;
import Tieuluancuoiky.Yeucauthem.Action;

public class NewRoomUI {
    private static Scanner in = new Scanner(System.in);
    private Action command;
    private NewRoomController newRoomController;

    public NewRoomUI(NewRoomController newRoomController) {
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
            List<Object> list = newRoomInput();
            newRoomController.newRoom(((BookroomEntity) list).getDiachi(), ((BookroomEntity) list).getDientich(),
                    ((BookroomEntity) list).getGia(), ((BookroomEntity) list).getSophong(),
                    ((BookroomEntity) list).getTienich());
        }
    }

    private static List<Object> newRoomInput() {
        List<Object> list = new ArrayList<>();
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
        list.add(diachi);
        list.add(sophong);
        list.add(dientich);
        list.add(gia);
        list.add(tienich);
        // return new BookroomEntity(diachi, sophong, tienich, gia, dientich);

        return newRoomInput();
    }

    @Override
    public String toString() {
        return "NewRoomUI [command=" + command + ", newRoomController=" + newRoomController + "]";
    }

    public String handleCommands(String rep) {
        return null;
    }

    public void handleInputs() {
    }

}
