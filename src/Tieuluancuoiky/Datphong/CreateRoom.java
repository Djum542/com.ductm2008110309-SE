package Tieuluancuoiky.Datphong;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import Tieuluancuoiky.RoomHotel;

public class CreateRoom {
    private static final String room = null;

    public static void main(String[] args) {
        RoomHotel roomHotel = new RoomHotel();
        roomHotel.addProperty(new RoomHotel(1000000, 80, "254 Dương an, 24, Tan Cu, Da Nang", "true", "5A16"));
        roomHotel.addProperty(new RoomHotel(850000, 60, "13 Chu văn an, 22, Tan Cu, Da Nang ", "false", "12B2"));
        roomHotel.addProperty(new RoomHotel(7450000, 58, "1 Chu văn an, 22, Tan Cu, Da Nang ", "false", "12B2"));
        roomHotel.addProperty(new RoomHotel(9650000, 45, "12 Chu văn an, 22, Tan Cu, Da Nang ", "false", "12B2"));
        roomHotel.addProperty(new RoomHotel(450000, 42, "14 Chu văn an, 22, Tan Cu, Da Nang ", "false", "12B2"));
        roomHotel.addProperty(new RoomHotel(2700000, 74, "116 Chu văn an, 22, Tan Cu, Da Nang ", "false", "12B2"));
        roomHotel.addProperty(new RoomHotel(700000, 57, "24 Chu văn an, 22, Tan Cu, Da Nang ", "false", "12B2"));

        List<RoomHotel> list = new ArrayList<>();
        list.add(roomHotel);
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter("room.json")) {
            gson.toJson(list, writer);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
