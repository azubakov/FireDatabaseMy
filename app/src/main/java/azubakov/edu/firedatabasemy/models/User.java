package azubakov.edu.firedatabasemy.models;

/**
 * Created by azubakov on 7/22/16.
 */
public class User {
   private String email;
   private String UID;

    public User() {
    }

    public User(String email, String UID) {
        this.email = email;
        this.UID = UID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }
}
