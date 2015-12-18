package dao;

import java.util.Date;

/**
 * Created by huangyazhou on 2015/12/17.
 */
public class Login {
    private int login_log_id;
    private int user_id;
    private String ip;
    private Date login_datetime;

    public int getLogin_log_id() {
        return login_log_id;
    }

    public void setLogin_log_id(int login_log_id) {
        this.login_log_id = login_log_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getLogin_datetime() {
        return login_datetime;
    }

    public void setLogin_datetime(Date login_datetime) {
        this.login_datetime = login_datetime;
    }

    @Override
    public String toString() {
        return "Login{" +
                "login_log_id=" + login_log_id +
                ", user_id=" + user_id +
                ", ip='" + ip + '\'' +
                ", login_datetime=" + login_datetime +
                '}';
    }
}
