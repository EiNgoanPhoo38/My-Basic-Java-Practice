package packageB;

import packageA.ClassA;

public class ClassD {
    private ClassA a;
    public ClassD(){
        a = new ClassA();
        a.publicMethod();
        /*a.defaultMethod();
        a.protectMethod();
        a.privateMethod();*/
    }
}
