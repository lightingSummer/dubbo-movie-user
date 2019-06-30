package club.lightingsummer.movie.userapi.bo;

import lombok.ToString;

/**
 * @author     ：lightingSummer
 * @date       ：2019/6/28 0028
 * @description：
 */
@ToString
public class UserModel {

    private String userName;
    private String userPwd;
    private String email;
    private String userPhone;
    private String address;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
