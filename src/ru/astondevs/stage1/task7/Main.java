package ru.astondevs.stage1.task7;

import ru.astondevs.stage1.task7.builder.Builder;
import ru.astondevs.stage1.task7.builder.PlaneBuilder;
import ru.astondevs.stage1.task7.singleton.Singleton;

public class Main {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance("one and only");
        System.out.println(singleton);

        PlaneBuilder planeBuilder = new PlaneBuilder();
        planeBuilder.registration("RA-73728").aircraftType("Airbus-A321").countryReg("Russia").color("White");
        System.out.println(planeBuilder.build());

    }

}
