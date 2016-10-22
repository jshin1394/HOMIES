/**
 * Finance class object to pass Finance info entity
 *
 */

public class Finance {
    public String FID;
    public Stirng memberId;
    public String type;
    public String date;
    public int amount;

    public Finance() {
    } // end of default Finance constructor

    public Finance(String FID, String memberId, String type, String date, int amount) {
        this.FID = FID;
        this.memberId = memberId;
        this.type = type;
        this.date = date;
        this.amount = amount;
    } // end of Finance constructor
} // end of Finance class
