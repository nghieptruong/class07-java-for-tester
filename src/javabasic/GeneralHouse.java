package javabasic;

public class GeneralHouse {

    protected String color;
    public static final String location = "HCM"; //bien instance

    GeneralHouse(){
        color = "Blue";
    }

    GeneralHouse(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void display() {
        System.out.println("Color: " + color);
    }

}
