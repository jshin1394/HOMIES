import com.google.firebase.*;
import com.google.firebase.database;

/**
 * Created by JeongeunLee on 10/22/16.
 */

public class Upload_data {
    private DatabaseReference mDatabase;
    FirebaseApp data = FirebaseApp.getInstance();

    public void NewUser(String username, String email, String fname, String lname,String DOB ) {
        User user = new User(username, email, fname, lname, DOB);
        mDatabase.child("users").child(username).setValue(user);
    }

    public void NewEvent(String EId, String MemberId, String Title, int Date) {
        Event event = new Event(username, email, fname, lname, DOB);
        mDatabase.child("event").child(EId).setValue(event);
    }

    public void NewMember(String MemberId, String Username, String HouseID, String status){
        Member m = new Member(MemberId, Username, String HouseID, String status);
        mDatabase.child("m").child(MemberId).setValue(m);
    }

    public void NewHouse(String HouseId, String street, String city, int zip, int num){
        House h = new House(HouseId, street, city, zip, num);
        mDatabase.child("h").child(HouseId).setValue(h);
    }

    public void NewFinance(String FId, String memberID, String type, int date, int amount){
        Finance f = new Finance(FID, memberID, type, date, amount));
        mDatabase.child("f").child(FId).setValue(f);
    }

    public void NHousekeeping(String HKID, String memberID, String type, String comment, String date){
        Housekeeping hk = new Housekeeping(HKID, memberID, type, comment, date)
        mDatabase.child("hk").child(HKID).setValue(hk);
    }

}
