package com.gaurav.ghati;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetChallenge {
            /*
        Modify the previous HeavenlyBody example so that the HeavenlyBody
        class also has a "bodyType" field. This field will store the
        type of HeavenlyBody (such as STAR, PLANET, MOON, etc).//

        You can include as many types as you want, but must support at
        least PLANET and MOON.//

        For each of the types that you support, subclass the HeavenlyBody class
        so that your program can create objects of the appropriate type.//

        Although astronomers may shudder at this, our solar systems will
        allow two bodies to have the same name as long as they are not the
        same type of body: so you could have a star called "BetaMinor" and
        an asteroid also called "BetaMinor", for example.//

        Hint: This is much easier to implement for the Set than it is for the Map,
        because the Map will need a key that uses both fields.//

        There is a restriction that the only satellites that planets can have must
        be moons. Even if you don't implement a STAR type, though, your program
        should not prevent one being added in the future (and a STAR's satellites
        can be almost every kind of HeavenlyBody).

        Test cases:
        1. The planets and moons that we added in the previous video should appear in
        the solarSystem collection and in the sets of moons for the appropriate planets.

        2. a.equals(b) must return the same result as b.equals(a) - equals is symmetric.

        3. Attempting to add a duplicate to a Set must result in no change to the set (so
        the original value is not replaced by the new one).

        4. Attempting to add a duplicate to a Map results in the original being replaced
        by the new object.

        5. Two bodies with the same name but different designations can be added to the same set.

        6. Two bodies with the same name but different designations can be added to the same map,
        and can be retrieved from the map.
*/

    private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<Planets> planets = new HashSet<>();
    private static Set<Astroids> astroids = new HashSet<>();
    private static Set<Moons> moons = new HashSet<>();

    public static void main(String[] args) {

        HeavenlyBody sun = new HeavenlyBody("SUN", 0, HeavenlyBody.BodyType.STARS);
//        solarSystem.put(sun);

        Planets temp = new Planets("Mercury", 88);

        sun.addSatellite(temp);
        planets.add(temp);
        solarSystem.put(temp.getKey(), temp);

        temp = new Planets("Venus", 236);
        sun.addSatellite(temp);
        planets.add(temp);
        solarSystem.put(temp.getKey(), temp);

        temp = new Planets("Earth", 365);
        sun.addSatellite(temp);
        planets.add(temp);
        solarSystem.put(temp.getKey(), temp);

        Moons tempMoon = new Moons("Earth Moon", 27);
        temp.addSatellite(tempMoon); //temp is now Earth
        moons.add(tempMoon);
        solarSystem.put(tempMoon.getKey(), tempMoon);

        temp = new Planets("MARS", 543);
        sun.addSatellite(temp);
        planets.add(temp);
        solarSystem.put(temp.getKey(), temp);

        tempMoon = new Moons("DiaMos", 1.3);
        temp.addSatellite(tempMoon); //temp is now Mars
        moons.add(tempMoon);
        solarSystem.put(tempMoon.getKey(), tempMoon);

        tempMoon = new Moons("Phobos", 0.3);
        temp.addSatellite(tempMoon); //temp is now Mars
        moons.add(tempMoon);
        solarSystem.put(tempMoon.getKey(), tempMoon);

        temp = new Planets("JUPITER", 2342);
        sun.addSatellite(temp);
        planets.add(temp);
        solarSystem.put(temp.getKey(), temp);

        tempMoon = new Moons("Io", 1.8);
        moons.add(tempMoon);
        temp.addSatellite(tempMoon); // temp is still
        solarSystem.put(tempMoon.getKey(), tempMoon);

        tempMoon = new Moons("Europa", 3.5);
        moons.add(tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter
        solarSystem.put(tempMoon.getKey(), tempMoon);

        tempMoon = new Moons("Ganymede", 7.1);
        moons.add(tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter
        solarSystem.put(tempMoon.getKey(), tempMoon);

        tempMoon = new Moons("Callisto", 16.7);
        moons.add(tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter
        solarSystem.put(tempMoon.getKey(), tempMoon);

        temp = new Planets("Saturn", 1059);
        sun.addSatellite(temp);
        planets.add(temp);
        solarSystem.put(temp.getKey(), temp);

        temp = new Planets("Uranus", 30660);
        sun.addSatellite(temp);
        planets.add(temp);
        solarSystem.put(temp.getKey(), temp);

        temp = new Planets("Neptune", 165);
        sun.addSatellite(temp);
        planets.add(temp);
        solarSystem.put(temp.getKey(), temp);

        temp = new Planets("Pluto", 248);
        sun.addSatellite(temp);
        planets.add(temp);
        solarSystem.put(temp.getKey(), temp);

        HeavenlyBody tempnew = new HeavenlyBody("Pluto", 567, HeavenlyBody.BodyType.DWAFT_PLANET);
        sun.addSatellite(tempnew);
//                planets.add(temp);

        Astroids newAstro = new Astroids("BetMind", 456);
        astroids.add(newAstro);
        solarSystem.put(newAstro.getKey(), newAstro);

        temp = new Planets("BetMind", 456);
        sun.addSatellite(temp);
        planets.add(temp);
        solarSystem.put(temp.getKey(), temp);

        System.out.println("planets : ");
        for (Planets pla : planets) {
            System.out.println("--> " + pla.toString());
        }

        System.out.println("Whole Solar System : ");
        for (HeavenlyBody.Key pla : solarSystem.keySet()) {
            System.out.println("--> " + pla.toString());
        }

        System.out.println("Planets of sun : ");
        for (HeavenlyBody body : sun.getSatellite()) {
            System.out.println("-->" + body.toString());
        }

        System.out.println("All moons : ");
        for (Moons bodyW : moons) {
            System.out.println("--> " + bodyW.toString());
        }

        HeavenlyBody earth1 = new Planets("Earth", 365);
        HeavenlyBody earth2 = new Planets("Earth", 365);
        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));

        System.out.println(earth1.equals(temp));
        System.out.println(temp.equals(earth1));

//        solarSystem.put(HeavenlyBody.makeKey("Pluto",HeavenlyBody.BodyType.PLANETS),);
    }

}
