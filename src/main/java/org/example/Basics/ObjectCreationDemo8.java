package org.example.Basics;

import java.io.*;

class MyClass implements Cloneable, Serializable {
    String message;

    // Default Constructor
    public MyClass() {
        this.message = "Object created using 'new' keyword!";
    }

    // Parameterized Constructor
    public MyClass(String message) {
        this.message = message;
    }

    // Factory Method
    public static MyClass createInstance() {
        return new MyClass("Object created using Factory method!");
    }

    // Overriding clone() method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return this.message;
    }
}

public class ObjectCreationDemo8 {

    public static void main(String[] args) {
        try {
            // 1. Using the `new` keyword
            MyClass obj1 = new MyClass();
            System.out.println(obj1);

            // 2. Using Class.forName() and newInstance()
            MyClass obj2 = (MyClass) Class.forName("org.example.Basics.MyClass").newInstance();  // Corrected with full class name
            System.out.println(obj2);

            // 3. Using clone() method
            MyClass obj3 = (MyClass) obj1.clone();
            obj3.message = "Object created using clone()!";
            System.out.println(obj3);

            // 4. Using Object Deserialization
            // Serialize the object
            FileOutputStream fileOut = new FileOutputStream("objectdata.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj1);
            out.close();
            fileOut.close();

            // Deserialize the object
            FileInputStream fileIn = new FileInputStream("objectdata.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            MyClass obj4 = (MyClass) in.readObject();
            obj4.message = "Object created using Deserialization!";
            in.close();
            fileIn.close();
            System.out.println(obj4);

            // 5. Using Factory method
            MyClass obj5 = MyClass.createInstance();
            System.out.println(obj5);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
