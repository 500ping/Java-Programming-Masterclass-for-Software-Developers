package com.company;

class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford --> startEngine()";
    }

    @Override
    public String acclerate() {
        return "Ford --> acclerate()";
    }

    @Override
    public String brake() {
        return "Ford --> brake()";
    }
}

