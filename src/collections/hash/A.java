package collections.hash;

import java.util.Objects;

class A {

    private final int diameter;
    private final int mass;
    private final int remoteness;
    private final HeavenlyBodyType heavenlyBodyType;
    private final B temperatures;

    public enum HeavenlyBodyType {
        STAR
//        , PLANET
//        , MOON
//        , ASTEROID
    }

    public A(int diameter, int mass, int remoteness, HeavenlyBodyType heavenlyBodyType, B temperatures) {
        this.diameter = diameter;
        this.mass = mass;
        this.remoteness = remoteness;
        this.heavenlyBodyType = heavenlyBodyType;
        this.temperatures = temperatures;
    }

    @Override
    public String toString() {
        return "A{" +
                "diameter=" + diameter +
                ", mass=" + mass +
                ", remoteness=" + remoteness +
                ", heavenlyBodyType=" + heavenlyBodyType +
                ", temperatures=" + temperatures +
                '}';
    }

    // Переопределение необходимо, чтобы не дублировать сущности с одинаковыми полями
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return diameter == a.diameter &&
                mass == a.mass &&
                remoteness == a.remoteness &&
                heavenlyBodyType == a.heavenlyBodyType &&
                temperatures.equals(a.temperatures);
    }

    // Переопределение необходимо, чтобы положить в одну корзину (bucket)
    @Override
    public int hashCode() {
        return Objects.hash(diameter, mass, remoteness, heavenlyBodyType, temperatures);
    }
}

