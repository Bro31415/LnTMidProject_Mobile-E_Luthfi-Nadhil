package Main;

public class Cars extends Vehicle{
    @Override
    public void getWheels(){
        wheel = scan.nextInt();
        System.out.println("Input number of wheels [ 4 <= wheel <= 6 ]");
        if (wheel >= 4 && wheel <= 6 ){
            System.out.println("Number of wheels are : " + wheel);
        }else{
            System.out.println("Please enter the correct number of wheels!");
        }
    }

    @Override
    public void getType() {
        type = scan.nextLine();
        System.out.println("Input type [ SUV | Supercar | Minivan ]");
        if(type.matches("SUV") || type.matches("Supercar") || type.matches("Minivan")){
            System.out.println("Car type is : " + type);
        }else{
            System.out.println("Please enter the correct type of car!");
        }
    }
}
