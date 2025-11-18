package supersub;

public class Animal {
    protected String specie;

    Animal(){
        this.specie = "";
    }

    Animal(String specie){
        this.specie = specie;
    }

    public void walk(){
        System.out.println("the animal walks");
    }
}
