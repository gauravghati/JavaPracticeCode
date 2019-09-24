package com.company;

public class Honda extends Car
{
    public Honda(int cylinders, String name, int wheels, boolean engine) {
        super(cylinders, name, wheels, engine);
    }

    @Override
    public void startengine() {
        super.startengine();
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void breaks() {
        super.breaks();
    }
}
