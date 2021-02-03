package collections.hash;

import java.util.Objects;

class B {

    private final int min_t;
    private final int max_t;

    public B(int min_t, int max_t) {
        this.min_t = min_t;
        this.max_t = max_t;
    }

    @Override
    public String toString() {
        return "B{" +
                "min_t=" + min_t +
                ", max_t=" + max_t +
                '}';
    }

    // Необходимо переопределять, т.к. вызывается в A
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        B b = (B) o;
        return min_t == b.min_t &&
                max_t == b.max_t;
    }

    // Необходимо переопределять, т.к. вызывается в A
    @Override
    public int hashCode() {
        return Objects.hash(min_t, max_t);
    }
}

