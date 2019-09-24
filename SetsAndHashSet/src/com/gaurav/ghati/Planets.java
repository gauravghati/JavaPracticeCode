package com.gaurav.ghati;

class Planets extends HeavenlyBody {

    Planets(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyType.PLANETS);
    }

    @Override
    boolean addSatellite(HeavenlyBody moon) {
        if (moon.getKey().getBodyType() == BodyType.MOONS) {
            return super.addSatellite(moon);
        }
        return false;
    }
}
