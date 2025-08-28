package javabasic;

public class DemoSameClass {
    public static void main(String[] args) {
        GeneralHouse baseHouse = new GeneralHouse();
    }
}
class BaseHouse {

    //mac dinh la gan gia tri mac dinh
    //kieu so: int, float, double,short <--gan 0
    //kieu String: null
    //kieu boolean: false
    int bedRoom; // thuoc tinh (attribute) -> phong ngu
    int floor; // thuoc tinh --> so tang

    //ko can return (tra ve) du lieu
    public void setBedRoom(int noBedRoom) {
        bedRoom = noBedRoom;
    }

    //phuong thuc cua lop (class)
    public int getBedRoom() {
        return bedRoom;
    }

    public int getFloor() {
        return floor;
    }

}
