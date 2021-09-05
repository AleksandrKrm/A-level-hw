package kramarenko.hw9.task1;

public class Main {
        private static Object Planet;

        public static void main(String[] args) {
            kramarenko.hw9.task1.Planet[] planets = {new Earth("Earth", 510_072_000L, 1, true),
                    new Uranus("Uranus", 811_560_000_000L, 0.7, false),
                    new Venus("Venus", 460_000_000_000L, 243, false)};
            new Mars("Mars", 1_443_700_000L, 1.00001, true),
                    Planet[] planets = {new Earth("Earth", 510_072_000L, true),
                    new Mars("Mars", 1_443_700_000L, true),
                    new Uranus("Uranus", 811_560_000_000L, false),
                    new Venus("Venus", 460_000_000_000L, false)};

            for (var info : planets) {
                System.out.println("Planet's atmosphere " + info.getName() + " " + info.isAtmosphere());
                info.gOfThePlanet();
                System.out.println("Planet's atmosphere " + info.getName() + " " + info.isAtmosphere() +
                        ", acceleration of free fall = " + info.gravityAccel + " m/s²");
            }

        }
    }

