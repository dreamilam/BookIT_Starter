package models;
import java.util.*;
import io.ebean.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User extends Model{

    public Integer userID;
    @Id
    public String userName;
    public String userEmail;
    public String userPassword;

    public static Finder<String, User> find = new Finder<>(User.class);

}
