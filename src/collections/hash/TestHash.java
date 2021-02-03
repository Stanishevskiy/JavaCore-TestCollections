package collections.hash;

import java.util.HashSet;
import java.util.Set;

public class TestHash {

    public static void main(String[] args) {

        A a1 = new A(1, 2, 3, A.HeavenlyBodyType.STAR, new B(4, 5));
        A a2 = new A(1, 2, 3, A.HeavenlyBodyType.STAR, new B(4, 5));
        A a3 = new A(1, 2, 3, A.HeavenlyBodyType.STAR, new B(4, 5));
        A a4 = new A(1, 2, 3, A.HeavenlyBodyType.STAR, new B(4, 5));
        A a5 = new A(1, 2, 3, A.HeavenlyBodyType.STAR, new B(4, 5));

        Set<A> mySet = new HashSet<>();
        mySet.add(a1);
        mySet.add(a2);
        mySet.add(a3);
        mySet.add(a4);
        mySet.add(a5);

        for (A a : mySet) {
            System.out.println(a.hashCode());
            System.out.println(a.toString());
            System.out.println("----------");
        }

    }
}

