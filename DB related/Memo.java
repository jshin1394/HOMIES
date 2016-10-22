/**
 * Memo class object to pass Memo info entity
 *
 */

public class Memo {
    public String memoId;
    public String memberId;
    public String content;

    public Memo() {
    } // end of default Memo constructor

    public Memo(String memoId, String memberId, String content) {
        this.memoId = memoId;
        this.memberId = memberId;
        this.content = content;
    } // end of Memo constructor

} // end of Memo class
