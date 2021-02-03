package collections.tree;

class B implements Comparable<B> {

    private final BrandName brandName;
    private final int brandPriority;

    public enum BrandName {
        ACER
        , XIAOMI
        , HUAWEI
        , APPLE
        , ASUS
    }

    public B(BrandName brandName, int brandPriority) {
        this.brandName = brandName;
        this.brandPriority = brandPriority;
    }

    @Override
    public int compareTo(B o) {
        if (brandPriority > o.brandPriority) {
            return 1;
        } else if (brandPriority < o.brandPriority) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "B{" +
                "brandName=" + brandName +
                ", brandPriority=" + brandPriority +
                '}';
    }
}
