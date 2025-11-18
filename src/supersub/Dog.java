package supersub;

public class Dog extends  Animal{
    private String color;

    Dog(){
        super();
        this.color = "";
    }

    Dog(String specie, String color){
        super(specie);
        this.color =  color;
    }

    public void run(){
        super.walk();
        System.out.println("dog runs");
    }

    @Override
    public void walk(){
        System.out.println("dog walks");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


class Aspin extends Dog{
    Aspin(String s, String c){
        super(s, c);
    }
}

class AnimalDemo{
    public static void main(String[] args) {
        Animal animal = new Animal("zebra");
        Dog dog = new Dog("aspin","white");
        animal.walk();
        dog.walk();
    }
}
