package collections.tree;

import java.util.*;

public class TestTree {

    public static void main(String[] args) {

        Set<A> mySet = new TreeSet<>();

        A a1 = new A(new B(B.BrandName.ACER, 5), "PREDATOR-1000",1200, 3);
        A a2 = new A(new B(B.BrandName.XIAOMI,3), "XIAOMI PRO BOOK",1100, 5);
        A a3 = new A(new B(B.BrandName.HUAWEI,2), "HUAWEI PRO BOOK",1600, 1);
        A a4 = new A(new B(B.BrandName.ASUS,4), "ZENBOOK UX303UA",1250, 3);
        A a41 = new A(new B(B.BrandName.ASUS,4), "ZENBOOK UX331UA",1550, 2);
        A a5 = new A(new B(B.BrandName.APPLE,1), "MACBOOK AIR",1800, 3);
        A a51 = new A(new B(B.BrandName.APPLE,1), "MACBOOK PRO",2250, 2);

        mySet.add(a1);
        mySet.add(a2);
        mySet.add(a3);
        mySet.add(a4);
        mySet.add(a41);
        mySet.add(a5);
        mySet.add(a51);

        for (A x : mySet) {
            System.out.println(x);
        }
    }
}
