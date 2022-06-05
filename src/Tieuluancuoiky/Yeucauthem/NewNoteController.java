package Tieuluancuoiky.Yeucauthem;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;

import Tieuluancuoiky.Datphong.BookroomEntity;

public class NewNoteController {
    private static final JsonArray memory = null;
    private static BookroomEntity bookroomEntity;

    public NewNoteController(BookroomEntity bookroomEntity) {
        this.bookroomEntity = bookroomEntity;
    }

    public static BookroomEntity getBookroomEntity() {
        return bookroomEntity;
    }

    public static void note(String sophong, Object object) {
        List<Object> listcheck;
        listcheck = roomValid(sophong);
        if (!(boolean) listcheck.get(0)) {
            System.out.println(listcheck.get(1));
            ((StroredFile) BookroomEntity.getRoom()).update(sophong);
            ((StroredFile) BookroomEntity.getRoom()).write();
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
        index = ((StroredFile) BookroomEntity.getRoom()).search("NU", sophong);
        if (index == -1) {
            list.add(false);
            list.add("[Don't have any room] dia diem nay da het phong");
            return list;
        }
        return list;
    }

    public BookroomEntity getRoom() {
        return bookroomEntity;
    }

    public static void readFile(StroredFile stroredFile) {
        stroredFile = new StroredFile("room.json", memory);
        stroredFile.read();
        System.out.println("");
    }

    @Override
    public String toString() {
        return "NewNoteController [bookroomEntity=" + bookroomEntity + "]";
    }
}
