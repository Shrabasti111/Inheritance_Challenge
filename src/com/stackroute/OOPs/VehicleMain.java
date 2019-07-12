package com.stackroute.OOPs;



class Vehicle {

    String vehicleType="";
    int noOfWheels;

    public Vehicle(String vehicleType, int noOfWheels) {
        this.vehicleType = vehicleType;
        this.noOfWheels = noOfWheels;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }
}

class Car extends Vehicle  {

    String carType;

    public Car(String vehicleType, int noOfWheels, String carType) {
        super(vehicleType, noOfWheels);
        this.carType = carType;
    }

    public String getCarType() {
        return carType;
    }


    public void steering()
    {
        System.out.println("steering");
    }

    public void changingGears()
    {
        System.out.println("gearing");
    }

    public void moving() {
        System.out.println("moving");
    }


}

class HondaCity extends Car {

    public HondaCity(String vehicleType, int noOfWheels, String carType) {
        super(vehicleType, noOfWheels, carType);
    }

    public void hondaSteering(){
        super.steering();
        System.out.println("Honda City is steering");
    }

    public void hondaChangingGears() {
        super.changingGears();
        System.out.println("Honda City is changing gears");
    }

    public void hondaMoving() {
        super.moving();
        System.out.println("Honda City is moving");
    }

    public void automatic() {
        System.out.println("automatic car");
    }

    public void suspensionRear() {
        System.out.println("Torsial beam axle with stabilizer, coil spring");
    }
}


class VehicleMain {
    public static void main(String[] args) {

        HondaCity hondaCity = new HondaCity("car", 4, "Honda City");
        hondaCity.hondaSteering();
        hondaCity.hondaChangingGears();
        hondaCity.hondaMoving();
        hondaCity.automatic();
        hondaCity.suspensionRear();

    }
}
