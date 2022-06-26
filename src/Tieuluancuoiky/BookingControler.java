package Tieuluancuoiky;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import javafx.event.EventType;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.PickResult;

public class BookingControler extends MouseEvent {
    public BookingControler(EventType<? extends MouseEvent> eventType, double x, double y, double screenX,
            double screenY, MouseButton button, int clickCount, boolean shiftDown, boolean controlDown, boolean altDown,
            boolean metaDown, boolean primaryButtonDown, boolean middleButtonDown, boolean secondaryButtonDown,
            boolean synthesized, boolean popupTrigger, boolean stillSincePress, PickResult pickResult) {
        super(eventType, x, y, screenX, screenY, button, clickCount, shiftDown, controlDown, altDown, metaDown,
                primaryButtonDown, middleButtonDown, secondaryButtonDown, synthesized, popupTrigger, stillSincePress,
                pickResult);
        // TODO Auto-generated constructor stub
    }

    private RoomHotel roomHotel;

    public RoomHotel getdiachi() {
        return roomHotel;
    }

    public void bookroom(String diachi) {
        String tempMemory = RoomHotel.getDiachi();
        int index = -1;
        // 1. Đặt phòng
        if (diachi.equals(this.getdiachi())) {
            System.out.println("danh sách phòng" + tempMemory);

        } else if (this.roomHotel.getDiachi() != null && this.roomHotel.getDiachi().equals(diachi)) {
            System.out.println("Bạn đã đặt phòng ở đây rồi, bạn có muốn đặt thêm không?");
            

        }
    }

    @Override
    public String toString() {
        return "BookingControler [roomHotel=" + roomHotel + "]";
    }

}
