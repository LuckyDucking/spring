package dao;

import java.util.Date;

/**
 * Created by huangyazhou on 2015/12/17.
 */
public class Login {
    private int loginLogId;
    private int userId;
    private String ip;
    private Date loginDatatime;

    public int getLoginLogId() {
        return loginLogId;
    }

    public void setLoginLogId(int loginLogId) {
        this.loginLogId = loginLogId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getLoginDatatime() {
        return loginDatatime;
    }

    public void setLoginDatatime(Date loginDatatime) {
        this.loginDatatime = loginDatatime;
    }

    @Override
    public String toString() {
        return "Login{" +
                "loginLogId=" + loginLogId +
                ", userId=" + userId +
                ", ip='" + ip + '\'' +
                ", loginDatatime=" + loginDatatime +
                '}';
    }
}
