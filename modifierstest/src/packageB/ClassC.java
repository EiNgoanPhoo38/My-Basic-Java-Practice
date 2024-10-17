package packageB;

import packageA.ClassA;

public class ClassC extends ClassA {
    //private ClassA a;
    public ClassC(){

        //a = new ClassA();
        //a.publicMethod();
        //a.defaultMethod();

        //a.protectMethod();
        //a.privateMethod();

        publicMethod();
        protectMethod(); //can use because C is sub class of A

        //defaultMethod();
        //privateMethod();
    }
}
