package java9;

public interface Test {

    void m2();

    default void m1() {
        System.out.println("testing...");
        m3();
    }

    private void m3() {
        System.out.println("testing.33..");
    }
}

