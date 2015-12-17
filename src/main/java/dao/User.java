package dao;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by huangyazhou on 2015/12/17.
 */
public class User implements Serializable {
    private int user_id;
    private String user_name;
    private String password;
    private Date last_vist;
    private String last_ip;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLast_vist() {
        return last_vist;
    }

    public void setLast_vist(Date last_vist) {
        this.last_vist = last_vist;
    }

    public String getLast_ip() {
        return last_ip;
    }

    public void setLast_ip(String last_ip) {
        this.last_ip = last_ip;
    }


    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", password='" + password + '\'' +
                ", last_vist=" + last_vist +
                ", last_ip='" + last_ip + '\'' +
                '}';
    }
}
