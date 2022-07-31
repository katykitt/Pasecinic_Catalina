package md.tekwill.pack2;

public class B {
    public String color(){
        return"Blue";
    }
      String thickness(String thick){
        return "Thick";
    }
    private int volume(){
        return 1546;
    }
    public void result(){
        System.out.println(volume());
        System.out.println(thickness("Thick"));
    }
}
