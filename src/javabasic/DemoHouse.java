package javabasic;

public class DemoHouse {
    public static void main(String[] args) {
//        House myHouse = new House();
//        //lay so phong ntu
//        int noBedRoom = myHouse.getBedRoom();
//        System.out.println(noBedRoom); // mac dinh ra 0
//
//        myHouse.setBedRoom(10);
////        System.out.println(myHouse.bedRoom); // loi
//        System.out.println(myHouse.getBedRoom()); // 10
//
//        System.out.println("---------------");
//        House house2 = new House();
//        System.out.println(house2.getBedRoom()); // ra so may ? ra 0
//
//        System.out.println("------------");
//        House house3 = myHouse; // tro house3 do myHouse
////        house3.bedRoom = 7; // loi
////        System.out.println(house3.bedRoom); // loi  7 hay 10; ==> 7
////        System.out.println(myHouse.bedRoom); // loi thanh 7 hay la giu 10 ? ==> 7
//
//        Cat myCat = new Cat();
//        myCat.getColor();

        House myHouse1 = new House();
        System.out.println(myHouse1.getBedRoom()); // so may ? 0 hay 1

        House myHouse2 = new House(5, 4);
        System.out.println(myHouse2.getBedRoom()); // 5
    }
}
//compile: bien dich
//run time: luc chay thuc