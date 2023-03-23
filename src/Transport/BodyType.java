package Transport;

public enum BodyType {
    SEDAN,
    HATCHBACK,
    COUPE,
    UNIVERSAL,
    SUV,
    CROSSOVER,
    PICKUP,
    VAN,
    MINIVAN;

    BodyType() {
    }

    @Override
    public String toString() {
        return "Тип кузова: " + super.toString();
    }
}
