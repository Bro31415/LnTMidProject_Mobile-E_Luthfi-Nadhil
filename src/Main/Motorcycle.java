package Main;

import java.util.Scanner;

public class Motorcycle extends Vehicle{
    Scanner scan = new Scanner(System.in);

    @Override
    public int getWheel(){
        wheel = scan.nextInt();
        System.out.println("Input number of wheels [ 2 <= wheel <= 3 ]");
        if (wheel >= 2 && wheel <= 3 ){
            System.out.println("Number of wheels are : " + wheel);
        }else{
            System.out.println("Please enter the correct number of wheels!");
        }
        setWheel(wheel);

        return wheel;
    }

    @Override
    public String getType() {
        type = scan.nextLine();
        System.out.println("Input type [ Automatic | Manual ]");
        if (type.matches("Automatic") || type.matches("Motorcycle")) {
            System.out.println("Motorcycle type is : " + type);
        } else {
            System.out.println("Please enter the correct type of motorcycle!");
        }
        setType(type);

        return type;
    }

    @Override
    public int getHelm() {
        helm = scan.nextInt();
        System.out.println("Input Helm amount [>=1]: ");
        if (helm >= 1) {
            System.out.println("Amount of helmets : " + helm);
        }else{
            System.out.println("Please enter the correct amount of helmets!");
        }
        setHelm(helm);

        return helm;
    }
}
