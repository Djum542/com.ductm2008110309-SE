package Tieuluancuoiky.Themphong;

import java.util.ArrayList;
import java.util.List;

import Tieuluancuoiky.Datphong.BookroomEntity;

public class NewRoomController {
    private BookroomEntity bookroomEntity;

    public NewRoomController(BookroomEntity bookroomEntity) {
        this.bookroomEntity = bookroomEntity;
    }

    public void newRoomInput(String diachi, float dientich, float gia, String sophong, String tienich) {
        List<Object> listcheck;
        listcheck = roomValid(diachi, sophong);
        if (!(boolean) listcheck.get(0)) {
            System.out.println(listcheck.get(1));

        } else

        {
            BookroomEntity.getNewRoom.update(diachi, sophong, gia, tienich, dientich);
            BookroomEntity.getNewRoom.write();
            System.out.println(listcheck.get(1));
        }
    }

    public List<Object> roomValid(String diachi, String sophong) {
        List<Object> list = new ArrayList<>();
        int index = 0;
        index = BookroomEntity.getNewRoom.search("AD", diachi);
        if (index != -1) {
            list.add(false);
            list.add("[ADDRESS EXISTS] dia chi da ton tai");
        }
        index = BookroomEntity.getNewRoom.search("NU", sophong);
        if (index != -1) {
            list.add(false);
            list.add("[ROOM NUMBER EXISTS] so phong da ton tai");
        }
        if (index == -1) {
            list.add(true);
            list.add("[New room] them phong thanh cong");

        }
        return list;
    }

    public BookroomEntity getNewRoom() {
        return bookroomEntity;
    }

    @Override
    public String toString() {
        return "NewRoomController [bookroomEntity=" + bookroomEntity + "]";
    }

}
