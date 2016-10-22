/**
 * Member class object to pass Member info entity
 *
 */

public class Member {
    public String memberId;
    public String username;
    public String houseId;
    public Stirng status;
    public String FID;
    public String HKID;
    public String EID;

    public Member() {
    } // end of default Member constructor

    public Member(String memberId, String username, String houseId,
        String status, String FID, String HKID, String EID) {
        this.memberId = memberId;
        this.username = username;
        this.houseId = houseId;
        this.status = status;
        this.FID = FID;
        this.HKID = HKID;
        this.EID = EID;
    } // end of Member constructor

} // end of Member class
