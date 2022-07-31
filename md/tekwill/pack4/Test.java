package md.tekwill.pack4;
import md.tekwill.pack1.*;
import md.tekwill.pack2.B;
import md.tekwill.pack3.C;
import md.tekwill.pack5.D;

public class Test {
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();
        D d= new D();
        a.printAll();
        a.page(263);
        a.option("Next page is 264");
        b.result();
        System.out.println(b.color());
        System.out.println(c.library());
        System.out.println(c.delivery("EU"));
        c.dates();
        d.call();


    }
}
