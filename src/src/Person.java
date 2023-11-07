package src;

public class Person {
    String name;
    String email;
    public void setNameAndEmail( String n, String e){
        this.name = n;
        this.email = e;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
}
