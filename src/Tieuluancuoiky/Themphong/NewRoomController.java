package Tieuluancuoiky.Themphong;

import java.util.ArrayList;
import java.util.List;

import Tieuluancuoiky.Datphong.BookroomEntity;

public class NewRoomController {
    private BookroomEntity bookroomEntity;

    public NewRoomController(BookroomEntity bookroomEntity) {
        this.bookroomEntity = bookroomEntity;
    }

    public void createRoom(String diachi, float dientich, float gia, String sophong, boolean b, Object tienich) {
        List<Object> listcheck;
        listcheck = roomValid(diachi, sophong);
        if (!(boolean) listcheck.get(0)) {
            System.out.println(listcheck.get(1));

        } else

        {
            BookroomEntity.getNewRoom().update(diachi, sophong, dientich, gia, tienich);
            BookroomEntity.getNewRoom().write();
            System.out.println(listcheck.get(1));
        }
    }

    public List<Object> roomValid(String diachi, String sophong) {
        List<Object> list = new ArrayList<>();
        int index = 0;
        index = BookroomEntity.getNewRoom().search("AD", diachi);
        if (index != -1) {
            list.add(false);
            list.add("[ADDRESS EXISTS] dia chi da ton tai");
            return list;
        }
        index = BookroomEntity.getNewRoom().search("NU", sophong);
        if (index != -1) {
            list.add(false);
            list.add("[ROOM NUMBER EXISTS] so phong da ton tai");
            return list;
        }
        if (index == -1) {
            list.add(true);
            list.add("[New room] them phong thanh cong");
            return list;
        }
        return list;
    }

    public BookroomEntity getBookroomEntity() {
        return bookroomEntity;
    }

    @Override
    public String toString() {
        return "NewRoomController [bookroomEntity=" + bookroomEntity + "]";
    }

    public void newRoom(String diachi, float dientich, float gia, String sophong, boolean tienich) {
    }

}
