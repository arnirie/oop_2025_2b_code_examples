import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //input series of double-store array
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[999];
        int counter = 0;
        double sum = 0;
        for(;;){
            double input = sc.nextDouble();
            numbers[counter++] = input;
            sum += input;
            if((int)input % 2 == 0) break;
        }
        //display reverse
        for(int i = counter -1 ; i >= 0 ; i--){
            System.out.println(numbers[i]);
        }
        //display cast
        for(int i = 0 ; i < counter ; i++){
            System.out.println((int)numbers[i]);
        }
        //ave, display above
        double ave = sum / counter;
        for(int i = 0 ; i < counter ; i++){
            if(numbers[i] > ave)
                System.out.println(numbers[i]);
        }
    }
}

class Counter {
    private static int count = 0;
    private int instanceCount = 0;

    public Counter() {
        count++;
        instanceCount++;
    }
    public int getInstanceCount() {
        return instanceCount;
    }
    public static int getCount() {
        return count;
    }
}

/*
Create a Bike class with the following fields:
int gear, speed, wheels
bool withPassenger
String color
with the following methods:
Bike()
Bike(gear, wheels, color)
Bike(color)
setter and getter for each field
printValues()-> shows all values of the fields

 */

class Vehicle{
    static int counter;
    int wheels;
    private int gear;
    int speed;
    double gasInLiters;

    Vehicle(){
        wheels=0;
        gear=0;
        speed=0;
        gasInLiters = 50;
        counter++;
    }

    Vehicle(int gear){
        wheels = 0;
        this.gear = gear;
        speed = 0;
        gasInLiters = 50;
        counter++;
    }

    Vehicle(int wheels, int gear, int speed, double gasInLiters){
        this.wheels = wheels;
        this.gear = gear;
        this.speed = speed;
        this.gasInLiters = gasInLiters;
        counter++;
    }

    static int getCounter(){
        return counter;
    }

    void setGear(int gear){
        if(gear < 0 ){
            //throw exception
            System.out.println("Invalid gear value");
            return;
        }
        this.gear = gear;
    }

    int getGear(){
        return gear;
    }

    void gearUp(){
        gear++;
    }

    void gearDown(){
        gear--;
    }
}