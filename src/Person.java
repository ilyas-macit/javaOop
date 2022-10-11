public class Person extends Customer{
    public Person(){}
    public Person(int id, String firstName, String lastName, String NationalIdentity){

        this.firstName = firstName;
        this.lastName = lastName;
        this.NationalIdentity = NationalIdentity;
        this.id = id;
    }
    String firstName;
    String lastName;
    String NationalIdentity;
}
