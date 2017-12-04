package models;
import com.sun.javafx.beans.IDProperty;
import io.ebean.*;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="USER_TYPE")
public class User extends Model{

    @Id
    public Integer userID;
    public String userName;
    public String userEmail;
    public String userPassword;
    public BigInteger phoneNo;

    public static Finder<String, User> find = new Finder<>(User.class);

}
