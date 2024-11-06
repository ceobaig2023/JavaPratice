package org.example.solid;

class Engin{
    void start(){
        System.out.println("Engin start");
    }
}
class Car{
    private Engin e=new Engin();

    void start(){
        e.start();
        System.out.println("Car start");
    }
}
public class TightlyCoupled {
    public static void main(String[] args) {

        Car c=new Car();
        c.start();

    }
}

/*"In Java, tight coupling means that classes are highly dependent on each other. For example, if I create an instance of Engine directly inside a Car class, the Car class becomes tightly coupled with Engine. This setup is rigid because if the Engine changes, we may need to change Car too.

Loose coupling is achieved by reducing these dependencies, often using interfaces and dependency injection. Instead of Car creating Engine, we pass Engine into Car through a constructor. This way, Car only depends on the Engine interface, not any specific implementation. This makes the code flexible and allows us to easily switch between different Engine types, like DieselEngine or PetrolEngine, without modifying the Car class.

In my experience, loose coupling is a good practice because it keeps code flexible and easier to test or extend. I’d typically aim to use loose coupling in projects to make maintenance and future changes simpler."
*/
