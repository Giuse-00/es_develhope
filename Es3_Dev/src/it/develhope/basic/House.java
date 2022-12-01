package it.develhope.basic;

public class House {

    public String address;
    public int numberOfFloors;

    public House(String address, int numberOfFloors){
        System.out.println("House was created! At " + address + " with " + numberOfFloors + " floors");
    }

    public String getAddress() {
        return address;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }
}
