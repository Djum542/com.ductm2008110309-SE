package Tieuluancuoiky;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import Tieuluancuoiky.Datphong.BookroomEntity;
import javafx.event.EventType;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.PickResult;

public class BookingControler {
    private static final JsonArray memory = null;
    private RoomHotel roomHotel;

    public BookingControler(RoomHotel roomHotel) {
        this.roomHotel = roomHotel;
    }

    public RoomHotel getdiachi() {
        return roomHotel;
    }

    public void bookroom(String diachi, String sophong) {
        String tempMemory = RoomHotel.getDiachi();
        int index = -1;
        // 1. Đặt phòng
        if (diachi.equals(this.getdiachi())) {
            System.out.println("danh sách phòng" + tempMemory);

        } else if (this.roomHotel.getDiachi() != null && this.roomHotel.getDiachi().equals(diachi)) {
            System.out.println("Bạn đã đặt phòng ở đây rồi, bạn có muốn đặt thêm không?");

        }
        List<Object> listcheck;
        listcheck = roomValid(sophong);
        if (!(boolean) listcheck.get(0)) {
            System.out.println(listcheck.get(1));
            (BookroomEntity.getNewRoom()).update(sophong);
            (BookroomEntity.getNewRoom()).write();
        } else {
            System.out.println(listcheck.get(-1));
        }
    }

    public static List<Object> roomValid(String sophong) {
        StroredFile stroredFile = new StroredFile("room.json", memory);
        stroredFile.read();
        System.out.println("");
        List<Object> list = new ArrayList<>();
        int index = -1;
        index = (BookroomEntity.getNewRoom()).search("NU", sophong);
        if (index == -1) {
            list.add(false);
            list.add("[Don't have any room] dia diem nay da het phong");
            return list;
        }
        return list;
    }

    @Override
    public String toString() {
        return "BookingControler [roomHotel=" + roomHotel + "]";
    }

}
