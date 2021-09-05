package kramarenko.hw9.task1;

public abstract class Planet implements Planet1 {
    private String name;
    private long square;
    public double gravityAccel;
    private boolean atmosphere;

    public Planet(String name, long square, double earthDay, boolean atmosphere) {
        this.name = name;
        this.square = square;
        gravityAccel = getGOfThePlanet();
        this.atmosphere = atmosphere;
    }

    public String getName() {
        return name;
    }

    public boolean isAtmosphere() {
        return atmosphere;
    }

    @Override
    public double getGOfThePlanet() {
        double g;
        return g = Math.abs(square * square / square);
    }
}
