/**
 * House class object to pass House info entity
 */

public class House {
    public String houseId;
    private String street;
    private String city;
    public String state;
    private String zip;
    private int numMembers;

    public House(){
    } // end of default House constructor

    public House(String houseID, String street, String city, String state, String zip, int numMembers){
        this.houseId = houseID;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.numMembers = numMembers;
    } // end of House constructor
} // end of House class