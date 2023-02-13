package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArrayList<Vehicle> vehicle = new ArrayList<>();




    public void view(){
        if(vehicle.isEmpty()){
            System.out.println("[Error] Vehicles data are unavailable.");
        } else {
            System.out.println("============ Vehicle Database ============");
            System.out.println("------------------------------------------");
            System.out.println("| No    |  Type              |  Name     |");
            System.out.println("------------------------------------------");
            for (int i = 0; i < vehicle.size(); i++){
                System.out.println("| " + (i+1) + "    |" + vehicle.get(i).getType()+ "         |" + " " + vehicle.get(i).getName()+ "           |");
                System.out.println("--------------------------------------");
            }
        }
    }

    public void list(){
        int idx = 0;
        Scanner scan = new Scanner(System.in);
        do {
            idx=scan.nextInt();
            scan.nextLine();
        }while(idx<1 || idx>vehicle.size());

        for(int i=0; i<vehicle.size(); i++) {
            if(idx==i+1) {

                if(vehicle.get(i).getType().equals("Car")) {
                    System.out.println();
                    System.out.println("Brand               : " + vehicle.get(i).getBrand());
                    System.out.println("Name                : " + vehicle.get(i).getName());
                    System.out.println("Licence Plate       : " + vehicle.get(i).getLicenseplate());
                    System.out.println("Type                : " + vehicle.get(i).getType());
                    System.out.println("Gas capacity        : " + vehicle.get(i).getGas());
                    System.out.println("Wheel(s)            : " + vehicle.get(i).getWheel());
                    System.out.println("Entertaiment System : " + vehicle.get(i).getAudiosys());
                    System.out.println("Turning on entertaiment system......");
                    if(vehicle.get(i).getType().equals("Supercar")) {
                        System.out.println(vehicle.get(i).getName() + " Boosting!");
                    }
                }else {
                    System.out.println();
                    System.out.println("Brand         : " + vehicle.get(i).getBrand());
                    System.out.println("Name          : " + vehicle.get(i).getName());
                    System.out.println("Licence Plate : " + vehicle.get(i).getLicenseplate());
                    System.out.println("Type          : " + vehicle.get(i).getType());
                    System.out.println("Gas capacity  : " + vehicle.get(i).getGas());
                    System.out.println("Wheel(s)      : " + vehicle.get(i).getWheel());
                    System.out.println("Helm          : " + vehicle.get(i).getHelm());
                    System.out.println(vehicle.get(i).getName() + " is standing!");
                }
            }
        }
    }

    public static void main(String[] args){
        new Main();
    }
}
