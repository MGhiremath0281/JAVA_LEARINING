class car{
    String color;

    public void engine(){
        System.out.println("Engine Started!");
    }
}
public class OOPS{
    public static void main(String args[]){
        car mycar = new car();
        mycar.engine();
        mycar.color="red";
        System.out.println("The color of car is :" +mycar.color);
    }
}