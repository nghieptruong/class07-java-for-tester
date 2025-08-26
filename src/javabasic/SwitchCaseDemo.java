package javabasic;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        //Interview: dieu gi xay ra khi ko co break trong switch case ?
        Scanner sc = new Scanner(System.in);
        String browserName = sc.nextLine();
//        switch (browserName) {
//            case "Chrome":
//                System.out.println("Run Chrome");
//                break;
//            case "firefox":
//                System.out.println("Run Firefox");
//                break;
//            default:
//                System.out.println("Invalid Browser");
//                break;
//        }

//        if(browserName.equals("Chrome")) {
//            System.out.println("Run Chrome");
//        } else if(browserName.equals("firefox")) {
//            System.out.println("Run Firefox");
//        } else {
//            System.out.println("Invalid Browser");
//        }

        switch (browserName) {
            case "Chrome":
            case "firefox":
            case "edge":
                System.out.println("Run browser on Windows platform");
                break;
            case "Safari":
                System.out.println("Run browser on MAC platform");
                break;
            default:
                System.out.println("Invalid Browser");
                break;
        }

        if(browserName.equals("Chrome") || browserName.equals("firefox") || browserName.equals("opera") || browserName.equals("edge")) {
            System.out.println("Run Chrome");
        } else {
            System.out.println("Invalid Browser");
        }
    }
}

