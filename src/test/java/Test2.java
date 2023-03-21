public class Test2 {

    int add(int a, int b) {
        return a + b;
    }
}
class Mainclass extends Test2{
    public static void main(String[] args) {
        Short s=4;
        System.out.println(new Test2().add(s,5));
    }
}
