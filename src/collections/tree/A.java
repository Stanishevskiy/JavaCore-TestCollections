package collections.tree;

class A implements Comparable<A> {

    private final B brand;
    private final String model;
    private final int cost;
    private final int count;

    public A(B brand, String model, int cost, int count) {
        this.brand = brand;
        this.model = model;
        this.cost = cost;
        this.count = count;
    }

    @Override
    public int compareTo(A o) {
        int compareB = brand.compareTo(o.brand);

        if (compareB == 0) {
            if ((cost * count) < (o.cost * o.count)) {
                return 1;
            } else if ((cost * count) > (o.cost * o.count)) {
                return -1;
            }
            return 0;
        } else {
            return compareB;
        }


    }

    @Override
    public String toString() {
        return "A{" +
                "brand=" + brand +
                ", model='" + model + '\'' +
                ", cost=" + cost +
                ", count=" + count +
                '}';
    }
}
