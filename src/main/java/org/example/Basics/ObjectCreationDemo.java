//package org.example.Basics;
//
//import java.io.*;
//import java.lang.reflect.Constructor;
//
//class MyClass implements Cloneable, Serializable {
//    String message;
//
//    // Default Constructor
//    public MyClass() {
//        this.message = "Object created using 'new' keyword!";
//    }
//
//    // Parameterized Constructor
//    public MyClass(String message) {
//        this.message = message;
//    }
//
//    // Factory Method
//    public static MyClass createInstance() {
//        return new MyClass("Object created using Factory method!");
//    }
//
//    // Overriding clone() method
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
//
//    @Override
//    public String toString() {
//        return this.message;
//    }
//}
//
//enum MyEnum {
//    INSTANCE;
//    String message;
//
//    MyEnum() {
//        this.message = "Object created using Enum!";
//    }
//
//    public String getMessage() {
//        return message;
//    }
//}
//
//public class ObjectCreationDemo {
//
//    public static void main(String[] args) {
//        try {
//            // 1. Using the `new` keyword
//            MyClass obj1 = new MyClass();
//            System.out.println(obj1);
//
//            // 2. Using Class.forName() and newInstance()
//            MyClass obj2 = (MyClass) Class.forName("MyClass").newInstance();
//            System.out.println(obj2);
//
//            // 3. Using clone() method
//            MyClass obj3 = (MyClass) obj1.clone();
//            obj3.message = "Object created using clone()!";
//            System.out.println(obj3);
//
//            // 4. Using Object Deserialization
//            // Serialize the object
//            FileOutputStream fileOut = new FileOutputStream("objectdata.ser");
//            ObjectOutputStream out = new ObjectOutputStream(fileOut);
//            out.writeObject(obj1);
//            out.close();
//            fileOut.close();
//
//            // Deserialize the object
//            FileInputStream fileIn = new FileInputStream("objectdata.ser");
//            ObjectInputStream in = new ObjectInputStream(fileIn);
//            MyClass obj4 = (MyClass) in.readObject();
//            obj4.message = "Object created using Deserialization!";
//            in.close();
//            fileIn.close();
//            System.out.println(obj4);
//
//            // 5. Using newInstance() method of Constructor class
//            Constructor<MyClass> constructor = MyClass.class.getConstructor(String.class);
//            MyClass obj5 = constructor.newInstance("Object created using Constructor's newInstance()!");
//            System.out.println(obj5);
//
//            // 6. Using Factory method
//            MyClass obj6 = MyClass.createInstance();
//            System.out.println(obj6);
//
//            // 7. Using Enum
//            MyEnum obj7 = MyEnum.INSTANCE;
//            System.out.println(obj7.getMessage());
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
