package com.gaurav.ghati;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
    private final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellite = new HashSet<>();

    HeavenlyBody(String name, double orbitalPeriod, BodyType bodyType) {
        this.orbitalPeriod = orbitalPeriod;
        this.key = new Key(name, bodyType);
    }

    public static Key makeKey(String name, BodyType bodyType) {
        return new Key(name, bodyType);
    }


    double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    boolean addSatellite(HeavenlyBody moon) {
        return this.satellite.add(moon);
    }

    Set<HeavenlyBody> getSatellite() {
        return new HashSet<>(satellite);
    }

    public Key getKey() {
        return key;
    }

    @Override
    public int hashCode() {
        return this.key.hashCode();
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HeavenlyBody) {
            return this.key.equals(((HeavenlyBody) obj).getKey());
        }
        return false;
    }

    @Override
    public String toString() {
        return key.name + " : " + orbitalPeriod + ", " + key.bodyType;
    }

    public enum BodyType {
        STARS,
        PLANETS,
        MOONS,
        ASTROID,
        DWAFT_PLANET
    }

    public static final class Key {
        private String name;
        private BodyType bodyType;

        private Key(String name, BodyType bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyType getBodyType() {
            return bodyType;
        }

        @Override
        public boolean equals(Object o) {
            Key key = (Key) o;
            if (this == o) return true;
            if (this.name.equals(key.getName())) {
                return this.bodyType.equals(key.getBodyType());
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.bodyType.hashCode() + 57 + this.name.hashCode();
        }

        @Override
        public String toString() {
            return this.name + " : " + this.bodyType;
        }
    }
}
