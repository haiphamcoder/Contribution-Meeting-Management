package Model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Account {
    // Attributes
    private final String id;
    private String username;
    private String password;
    private TypeAccount type;

    // parameterized constructor
    public Account(String username, String password, TypeAccount type) {
        id = generateID();
        this.username = username;
        this.password = password;
        this.type = type;
    }

    // getter and setter methods
    public String getId(){
        return id;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TypeAccount getType() {
        return type;
    }

    public void setType(TypeAccount type) {
        this.type = type;
    }

    // generate id
    private String generateID(){
        Calendar cal = Calendar.getInstance();
        Date time = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        return sdf.format(time);
    }
}
