public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    //Constructors
    public Address(String street, String city, String state, String zip){
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    //To string
    public String toString(){
        return street + ", " + city + ", " + state + "\n" + zip;
    }
}
