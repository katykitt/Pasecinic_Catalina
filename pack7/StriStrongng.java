package md.tekwill.pack7;

public class StriStrongng {
    public static void main(String[] args){

        String myString = "Home";
        int n=myString.length()-1;
        while (n<myString.length()){
            System.out.print( myString.charAt(n));
           n--;
           if (n==-1){
               break;
           }
        }

    }
}
