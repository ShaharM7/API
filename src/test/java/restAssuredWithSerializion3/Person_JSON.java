package restAssuredWithSerializion3;

import java.io.Serializable;

public class Person_JSON implements Serializable {

    private String FirstName;
    private String LastName;
    private String UserName;
    private String Password;
    private String Email;

    private static final long serialVersionUID = 5767787440650656765L;

    public Person_JSON(String FirstName, String LastName, String UserName, String Password, String Email) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.UserName = UserName;
        this.Password = Password;
        this.Email = Email;
    }
}