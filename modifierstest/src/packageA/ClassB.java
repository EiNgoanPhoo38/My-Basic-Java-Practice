package packageA;

public class ClassB {
    private ClassA a;

    public ClassB(){
        a = new ClassA();
        a.publicMethod();
        a.defaultMethod();
        a.protectMethod();

        //a.privateMethod(); same package but we cant use private
    }
}
