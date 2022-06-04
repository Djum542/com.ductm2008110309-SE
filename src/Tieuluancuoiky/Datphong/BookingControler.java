package Tieuluancuoiky.Datphong;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ListSelectionEvent;

public class BookingControler {
    private static final String getDiachi = null;
    private static final String getsophong = null;
    private BookroomEntity bookroomEntity;

    public BookingControler(BookroomEntity bookroomEntity) {
        this.bookroomEntity = bookroomEntity;
    }

    public BookroomEntity getBookroomEntity() {
        return bookroomEntity;
    }

    public static void bookroom(String diachi, String sophong) {
        List<Object> listCheck;
        listCheck = bookroomValid(diachi, sophong);
        if (!(boolean) listCheck.get(0)) {
            System.out.println(listCheck.get(1));
        } else {
            System.out.println("[don't have any room] hay chon dia diem khac");
        }
    }

    @Override
    public String toString() {
        return "BookingControler [bookroomEntity=" + bookroomEntity + "]";
    }

    public static List<Object> bookroomValid(String diachi, String sophong) {
        List<Object> list = new ArrayList<>();
        int index = -1;
        index = ((StroredFile) BookroomEntity.getBookroom()).search("AD", getDiachi);
        if (index == -1) {
            list.add(false);
            list.add("[Don't have any room] dia diem nay da het phong");
            return list;
        }
        index = BookroomEntity.getBookroom().search("NU", getsophong);
        if (index != -1) {
            list.add(true);
            list.add("[have any room] con phong");
            return list;
        }
        return list;
    }
}
