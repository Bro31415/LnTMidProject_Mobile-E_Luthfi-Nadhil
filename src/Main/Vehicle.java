package Main;

import java.util.Scanner;

public class Vehicle {

    public String brand;
    public String name;
    public String licenseplate;
    public int speed;
    public int gas;
    public int wheel;
    public String type;
//    public int audiosys;
//    public int helm;


    Scanner scan = new Scanner(System.in);

    public void getBrand(){
        brand = scan.nextLine();
        if (brand.length() > 5){
            System.out.println("Brand name is : " + brand);
        }else{
            System.out.println("Please enter a brand name with more than 5 characters!");
        }
    }

    public void getName() {
        name = scan.nextLine();
        if (name.length() > 5){
            System.out.println("Model Name is : " + name);
        }else{
            System.out.println("Please enter a model name with more than 5 characters!");
        }
    }

//    public void getLicensePlate() {
//        licenseplate = scan.nextLine();
//        String lp =
//        if (licenseplate.matches("[A-Z] " + "[0-9]"+"[0-9]"+"[0-9]"+"[0-9]" + " [A-Z]"+"[A-Z]"+"[A-Z]")){
//
//        }else{
//            System.out.println("Wrong license plate format");
//        }
//    }

    public void getTopSpeed() {
        speed = scan.nextInt();
        if (speed > 100 || speed < 250){
            System.out.println("Top speed is : " + speed);
        }else{
            System.out.println("Please enter a model name with more than 5 characters!");
        }
    }

    public void getGasCapacity() {
        gas = scan.nextInt();
        if (gas > 30 || gas < 60){
            System.out.println("Fuel tank capacity is : " + gas);
        }else{
            System.out.println("Please enter a model name with more than 5 characters!");
        }
    }

    public void getWheels(){
//        wheel = scan.nextInt();
    }

    public void getType(){
    }


}

