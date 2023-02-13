package Main;

public class Motorcycle extends Vehicle{


    @Override
    public void getType() {
        type = scan.nextLine();
        System.out.println("Input type [ Automatic | Manual ]");
        if(type.matches("Automatic") || type.matches("Motorcycle")){
            System.out.println("Motorcycle type is : " + type);
        }else{
            System.out.println("Please enter the correct type of motorcycle!");
        }
    }
}
