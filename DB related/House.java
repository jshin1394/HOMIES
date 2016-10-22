/**
 * House class object to pass House info entity
 */

public class House {
    public String houseId;
    private String address;
    private int numMembers;

    public House(){
    } // end of default House constructor

    public House(String houseID, String address, int numMembers){
        this.houseId = houseID;
        this.address = address;
        this.numMembers = numMembers;
    } // end of House constructor
} // end of House class