package javabasic;

public class DemoEnum {
    public static void main(String[] args) {
        // platform
        // if platform == "Windows" --> in ra "Running on Windows"
        // if platform == "Mac" --> in ra "Running on MAC"
        // if platform == "Linux" --> in ra "Running on Linux"
        // else --> in ra "Invalid"

//        String platform = "WINDOWS"; //bất cẩn truyền sai (thiếu dấu s)
        run(Platform.WINDOWS);
    }
    public static void run(Platform platform) {
        if(platform == Platform.WINDOWS) {
            System.out.println("Running on Windows");
        } else if(platform == Platform.MAC) {
            System.out.println("Running on MAC");
        } else if(platform == Platform.LINUX) {
            System.out.println("Running on Linux");
        } else {
            System.out.println("Invalid");
        }
    }
}
