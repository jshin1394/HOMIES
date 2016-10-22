/**
 * Finance class object to pass Finance info entity
 *
 */

public class Finance {
    public String FID;
    public Stirng memberId;
    public String type;
    public String date;
    public int damount;

    public Finance() {
    }

    public Finance(String FID, String memberId, String type, String date, int amount) {
        this.FID = FID;
        this.MemberId = memberId;
        this.Type = type;
        this.Date = date;
        this.Amount = amount;
    }
} // end of Finance class
