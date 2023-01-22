public class ddfdf{

    public static void main(String[] args) {

        Face bob = new Face();      // вызов первого конструктора без параметров
        bob.displayInfo();

        Face tom = new Face("Tom"); // вызов второго конструктора с одним параметром
        tom.displayInfo();

        Face sam = new Face("Sam", 25); // вызов третьего конструктора с двумя параметрами
        sam.displayInfo();
    }
}
class Face{

    String name;    //

    int age;        // возраст
    Face()
    {
        name = "Undefined";
        age = 18;
    }
    Face(String n)
    {
        name = n;
        age = 18;
    }
    Face(String n, int a)
    {
        name = n;
        age = a;
    }
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}