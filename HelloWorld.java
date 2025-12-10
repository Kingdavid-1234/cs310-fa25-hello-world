/**
 * @author David Ndubuisi
 */
public class HelloWorld {

    public static void main(String[] args) {

        Class1 c1 = new Class1();
        Class2 c2 = new Class2();

        c1.f1();
        c2.f1();

        c1.f2();
        c2.f2();

        c1.f3();
        c2.f3();

        c1.f4();
        c2.f4();

        System.out.println("Hello World!");
    }

    public void f1() {
        System.out.println("f1() called");
    }

    public void f2() {
        System.out.println("f2() called");
    }

    public void f3() {
        System.out.println("f3() HOTFIX applied");
    }

    public void f4() {
        System.out.println("f4() feature added");
    }
}
