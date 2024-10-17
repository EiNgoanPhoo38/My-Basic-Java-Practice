package constructortest;

public class Car {
    String type;//instance variable
    String color;//instance variable
    int year;//instance variable

    Car(String type, String color){//local variables
        this.type = type;
        this.color = color;
    }

    Car (String type){//local variable
        this.type=type;
    }

    Car (int yr){//local variable
        this.year=yr;
    }

    Car (String str, boolean isType){//local variables
        if(isType){
            this.type=str;
        }else{
            this.color=str;
        }
    }

    Car(){}

    void info(){//instance method
        System.out.println("Type is " + type);
        System.out.println("Color is " + color);
    }
}
