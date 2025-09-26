package advanced;

public class Car {
    private String maker;
    private String model;
    private Engine engine;
    private static int count;

    class Engine{
        double displacement;
        int horsepower;
        boolean isRunning;

        Engine(double displacement, int hp){
            this.displacement  = displacement;
            this.horsepower = hp;
        }
    }

    { //instance init block

        System.out.println("init block called");
    }

    static { //static init block
        count = 10;
        System.out.println("static init block called");
    }

    Car(String maker, String model){
        this.maker = maker;
        this.model = model;
        System.out.println("constructor called");
        count++;
    }

    void setEngine(double displacement, int hp){
        this.engine = new Engine(displacement, hp);
    }

    Engine getEngine(){
        return this.engine;
    }

    protected Car setMaker(String maker){
        this.maker = maker;
        return this;
    }



    protected void  displayInfo(){
        class Message{
            void displayMessage(){
                System.out.println("message from local inner");
            }
        }

//        Message m = new Message();
//        m.displayMessage();
        new Message().displayMessage();
        System.out.println("maker " + maker);
    }

    static void displayCount(){
        System.out.println(count);
    }

}

