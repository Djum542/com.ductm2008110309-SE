package Tieuluancuoiky.Yeucauthem;

import java.util.ArrayList;
import java.util.List;

import Tieuluancuoiky.Datphong.BookroomEntity;

public class NewNoteController {
    private static BookroomEntity bookroomEntity;

    public NewNoteController(BookroomEntity bookroomEntity) {
        this.bookroomEntity = bookroomEntity;
    }

    public static BookroomEntity getBookroomEntity() {
        return bookroomEntity;
    }

    public static void note(String yeucauthem, String sophong) {
        List<Object> listcheck;
        listcheck = bookroomValid(yeucauthem, sophong);
        if (!(boolean) listcheck.get(0)) {
            System.out.println(listcheck.get(0));
        } else {
            System.out.println(listcheck.get(-1));
        }
    }

    public static List<Object> bookroomValid(String diachi, String sophong) {
        List<Object> list = new ArrayList<>();
        int index = -1;
        index = BookroomEntity.getNote().search("NU", sophong);
        if (index == -1) {
            list.add(false);
            list.add("[Don't have any room] dia diem nay da het phong");
            return list;
        }
        return list;
    }

    @Override
    public String toString() {
        return "NewNoteController [bookroomEntity=" + bookroomEntity + "]";
    }

	public static void note(String yeucauthem) {
	}

}
