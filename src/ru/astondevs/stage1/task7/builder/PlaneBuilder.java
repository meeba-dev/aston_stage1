package ru.astondevs.stage1.task7.builder;



public class PlaneBuilder implements Builder {

    private String registration;
    private String aircraftType;
    private String countryReg;
    private String color;


    @Override
    public Builder registration(String registration) {
        this.registration = registration;
        return this;
    }

    @Override
    public Builder aircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
        return this;
    }

    @Override
    public Builder countryReg(String countryReg) {
        this.countryReg = countryReg;
        return this;
    }

    @Override
    public Builder color(String color) {
        this.color = color;
        return this;
    }

    public Plane build() {
        return new Plane(registration, aircraftType, countryReg, color);
    }
}
