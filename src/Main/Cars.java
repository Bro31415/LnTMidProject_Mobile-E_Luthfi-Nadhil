package Main;

import java.util.Scanner;

public class Cars extends Vehicle{
    Scanner scan = new Scanner(System.in);

    @Override
    public int getWheel(){
        wheel = scan.nextInt();
        System.out.println("Input number of wheels [ 4 <= wheel <= 6 ]");
        if (wheel >= 4 && wheel <= 6 ){
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
        System.out.println("Input type [ SUV | Supercar | Minivan ]");
        if(type.matches("SUV") || type.matches("Supercar") || type.matches("Minivan")){
            System.out.println("Car type is : " + type);
        }else{
            System.out.println("Please enter the correct type of car!");
        }
        setType(type);

        return type;
    }

    public int getAudioSys(){
        audiosys = scan.nextInt();
        System.out.println("Input Entertaiment system amount [>=1]: ");
        if(audiosys >= 1){
            System.out.println("Amount of helmets : " + audiosys);
        }else{
            System.out.println("Please enter the correct amount of audio system!");
        }
        setAudiosys(audiosys);

        return audiosys;
    }
}
