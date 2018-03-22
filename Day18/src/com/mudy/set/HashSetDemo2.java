package com.mudy.set;

import java.util.HashSet;

/**
 * Created by mudy on 18/3/22.
 */
class A{
    public boolean equals(Object obj) {
        return true;
    }
}

class B{
    public int hashCode() {
        return 1;
    }
}

class C{
    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public int hashCode() {
        return 2;
    }
}

public class HashSetDemo2 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(new A());
        set.add(new A());
        set.add(new B());
        set.add(new B());
        set.add(new C());
        set.add(new C());
        System.out.println(set.toString());
    }
}
