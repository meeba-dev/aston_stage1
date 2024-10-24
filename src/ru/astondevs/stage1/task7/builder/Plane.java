package ru.astondevs.stage1.task7.builder;



public class Plane {

    private String registration;
    private String aircraftType;
    private String countryReg;
    private String color;

    public Plane(String registration, String aircraftType, String countryReg, String color) {
        this.registration = registration;
        this.aircraftType = aircraftType;
        this.countryReg = countryReg;
        this.color = color;
    }

    @Override
    public String toString() {
        return registration + " " + aircraftType + " " + countryReg + " " + color;
    }
}
