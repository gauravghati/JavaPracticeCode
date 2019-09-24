package com.company;

public class Car
{
    private boolean engine;
    private int wheels;
    private int cylinders;
    private String name;

    public Car(int cylinders, String name,int wheels,boolean engine) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public void startengine()
    {
        if(engine==true)
        {
            System.out.println("Engine is working");
        }
        else
        {
            System.out.println("Engine is not working");
        }
    }
    public void accelerate()
    {
        System.out.println("Car Acelerated");
    }
    public void breaks()
    {
        System.out.println("Breaks Applied!");
    }

}
