package md.tekwill.pack1;
public class A {
    public void page(int somePage){
        System.out.println("You are now on page "+somePage);


    }
    public void option(String turnThePage){
        System.out.println(turnThePage);
    }
    private String name(){
        return "Name of the wind";
    }
    int tome(int someTome){
        return someTome;
    }
    public void printAll(){
        System.out.println(name());
        System.out.println(tome(2));
    }
}
