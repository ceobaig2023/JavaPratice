package org.example.ineritance;

public class ChildClass extends ParentClass{

    public static void main(String[] args) {
        ChildClass obj9=new ChildClass();
        obj9.pin=1234;
        obj9.addharNo=123456789;
        obj9.setHousenumber(1112);
        System.out.println(obj9.getHousenumber());
        System.out.println(obj9.pin);
        System.out.println(obj9.addharNo);

    }
}
