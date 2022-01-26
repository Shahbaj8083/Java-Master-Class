package com.company;

public class Vehicles {
    private boolean steering;
    private int gear;
    private int speed;

    public Vehicles(){

    }

    public Vehicles(boolean steering, int gear, int speed) {
        this.steering = steering;
        this.gear = gear;
        this.speed = speed;
    }
}
        class Car extends Vehicles{
        private int wheels;
        private int camera;
        private int airBags;

            public Car(boolean steering, int gear, int speed,int wheels,int camera,int airBags) {
                super(steering, gear, speed);
                this.wheels=wheels;
                this.camera=camera;
                this.airBags=airBags;
            }
        }

     class SpecialCar extends Car{
        private boolean sunRoof;
        private boolean rareCamera360;

         public SpecialCar(boolean steering, int gear, int speed, int wheels, int camera, int airBags,
                           boolean sunRoof,boolean rareCamera360) {

             super(steering, gear, speed, wheels, camera, airBags);
             this.sunRoof=sunRoof;
             this.rareCamera360=rareCamera360;
             System.out.println("Sun Roof "+sunRoof);
             System.out.println("Gears "+gear);

         }
     }

