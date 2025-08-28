package javabasic;


public class DemoConstructorHouse {
    public static void main(String[] args) {
        House house1 = new House(); //khoi tao doi tuong --> goi ham constructor ko tham so
        String color = house1.getColor();
        System.out.println(color);

        System.out.println("------------------");
        House house2 = new House(5, 5, "Green");
        System.out.println(house2.getBedRoom()); // 5
        System.out.println(house2.getFloor()); // 5
        System.out.println(house2.color); // Green

        System.out.println("-----------");
        house2.display(); // in ra Color: Green

        System.out.println(House.x); //  --> 0 class.method
        System.out.println(house1.x); // --> 0 object.method
        System.out.println(house2.x); // --> 0 object.method

        House.x = 2;
        System.out.println(House.x); //  2
        System.out.println(house1.x); // 2
        System.out.println(house2.x); // 2

        String s = House.location; //static goi dc Class.method


    }
}
