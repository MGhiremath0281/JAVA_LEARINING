/* Assignment - 1

class person{
    String name;
    int age;    
}
public class Assingnment {
    public static void main(String args[]){
    person p =new person();
    p.name = "Muktananda";
    p.age=18;

    System.out.println("Name lf the person:"+p.name+"Age:"+p.age);
    }
}
*/
/* Assignment - 2 
class Laptop { // Class names should be capitalized
    String color;
    float rate;

    // Default constructor
    Laptop() {
        System.out.println("Laptop created!");
    }
}

public class Assignment { // File name should match this class name (if public)
    public static void main(String args[]) {
        Laptop l = new Laptop(); // Create object
        l.color = "Red";
        l.rate = 60000;

        System.out.println("The color of laptop is: " + l.color + " & Rate is: " + l.rate);
    }
}

// Assignment - 3
class Area{
    float length,breadth;

    Area(float a, float b ){
        length = a;
        breadth = b ;
    }
    void calcArea(){
        float area = length * breadth;
        System.out.println("The are aof REctangle is :"+area);
    }
}

public class Assingnment{
    public static void main(String args[]){
        Area a1 = new Area(2,4);
        a1.calcArea();
    }
}
//Assignment - 4
class Area{
    float area,radius;

    Area(){
        radius = 1;
    }
    Area(float r ){
        radius = r;
    }
    void calcArea(){
        float area = 3.14f * radius*radius;
        System.out.println("The area of circle is:"+area);
    }
}

public class Assingnment{
    public static void main(String args[]){
        Area a1 = new Area();
        a1.calcArea();
        Area a2 = new Area(4);
        a2.calcArea();
    }
}
*/
//Assignment - 5
class Employe{
    String name;
    float salary;

    Employe(String name,float salary){
        this.name=name;
        this.salary=salary;
    }
    void showdetails(){
        System.out.println("The name of the employee is:"+name+"Salary is:"+salary);
    }
}
public class Assingnment{
    public static void main(String[] args) {
        Employe e1 = new Employe("Muktananda",60000);
        e1.showdetails();
    }
}