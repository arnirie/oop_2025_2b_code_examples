import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Your name is " + name);
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