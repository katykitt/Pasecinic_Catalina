package md.tekwill.pack6;

public class Person {
    long id;
    String firstName;
    String lastName;
    public long getId(){
        return id;
    }
    public void setId(long someId){
        id = someId;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String someFirstName){
        firstName=someFirstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String someLastName){
        lastName=someLastName;
    }
    public void dates(){
        System.out.println(getId());
        System.out.println(getFirstName());
        System.out.println(getLastName());
    }
}
