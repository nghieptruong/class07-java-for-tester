package javabasic;

public class House extends GeneralHouse {

    //mac dinh la gan gia tri mac dinh
    //kieu so: int, float, double,short <--gan 0
    //kieu String: null
    //kieu boolean: false
    private int bedRoom; // instance - thuoc tinh cua lop (attribute) -> phong ngu
    private int floor; // thuoc tinh --> so tang
    public static int x; //static variable


    //ko co ham khoi tao
    //mac dinh Java se add 1 ham khoi tao ko tham so
    House() {
        super(); // goi GeneralHouse()
        bedRoom = 1;
        floor = 2;
    }

    House(int nobedRoom, int nofloor, String color) {
        this(nobedRoom, nofloor); // House(int nobedRoom, int nofloor)
        this.color = color;
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

    //override: hàm cùng tên với cha
    public void display() {
        super.display();
        System.out.println("Bedroom: " + bedRoom);
        System.out.println("Floor: " + floor);
    }

    public void printLocation() {
        System.out.println(location);
    }
}
