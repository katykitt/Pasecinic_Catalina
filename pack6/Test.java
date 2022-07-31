package md.tekwill.pack6;

public class Test {

    public static void main(String[] args) {
        long x = 24L;

        while (x < 28L) {
            if (x == 24L) {
                Person person = new Person();
                person.setId(x);
                person.setFirstName("A");
                person.setLastName("B");
                person.dates();
            }
            if(x==25L){
                Person person1 = new Person();
                person1.setId(x);
                person1.setFirstName("C");
                person1.setLastName("D");
                person1.dates();
            }
            if(x==26L) {
                Person person2 = new Person();
                person2.setId(x);
                person2.setFirstName("E");
                person2.setLastName("F");
                person2.dates();
            }
            if (x==27L){
                Person person3 = new Person();
                person3.setId(x);
                person3.setFirstName("G");
                person3.setLastName("H");
                person3.dates();
            }
            x++;

        }
    }}
