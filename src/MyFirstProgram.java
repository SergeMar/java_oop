public class MyFirstProgram {
    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Sergey");
        int s = 5;
        System.out.println("Площадь квадрата со стороной "+s+" равна "+ area(s));
    }

    public static void hello(String hi) {
        System.out.println("Hello, " + hi);
    }

    public static int area(int l){
        return l*l;
    }
}
