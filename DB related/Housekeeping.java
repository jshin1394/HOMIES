/**
 * Housekeeping class object to pass Housekeeping info entity
 *
 */

public class Housekeeping {
    public String HKID;
    public String memberId;
    public String type;
    public String comment;
    public String date;
    
    public Housekeeping() {
    } // end of default Housekeeping constructor

    public Housekeeping(Stirng HKID, String memberId, String type, String comment, String date) {
        this.HKID = HKID;
        this.memberID = memberID;
        this.type = type;
        this.comment = comment;
        this.date = date;
    } // end of Housekeeping constructor
} // end of Housekeeping class
