/**
 * Member class object to pass Member info entity
 *
 */

public class Member {
    public String memberId;
    public String username;
    public String houseId;
    public Stirng status;

    public Member() {
    } // end of default Member constructor

    public Member(String memberId, String username, String houseId, String status) {
        this.memberId = memberId;
        this.username = username;
        this.houseId = houseId;
        this.status = status;        
    } // end of Member constructor

} // end of Member class
