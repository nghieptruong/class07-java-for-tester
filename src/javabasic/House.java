package javabasic;

public class House {

    //mac dinh la gan gia tri mac dinh
    //kieu so: int, float, double,short <--gan 0
    //kieu String: null
    //kieu boolean: false
    private int bedRoom; // thuoc tinh (attribute) -> phong ngu
    private int floor; // thuoc tinh --> so tang


    //ko co ham khoi tao
    //mac dinh Java se add 1 ham khoi tao ko tham so
    House() {
        bedRoom = 1;
        floor = 2;
    }

    House(int nobedRoom, int nofloor) {
        this.bedRoom = nobedRoom;
        this.floor = nofloor;
    }


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
