/**
 * Housekeeping class object to pass Housekeeping info entity
 *
 */

public class Housekeeping {
    public String HKID;
    public String memberId;
    public String type;
    public String detail;
    public String date;
    
    public Housekeeping() {
    } // end of default Housekeeping constructor

    public Housekeeping(String HKID, String memberId, String type, String detail, String date) {
        this.HKID = HKID;
        this.memberId = memberId;
        this.type = type;
        this.detail = detail;
        this.date = date;
    } // end of Housekeeping constructor
} // end of Housekeeping class
