/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg251.group;

public class user 
{
    private String userName;
    private String name;
    private int password;
    private String phoneNum;
    private String email;

    public user() {
    }
    public user(String userName, String name, int password, String phoneNum, String email) {
        this.userName = userName;
        this.name = name;
        this.password = password;
        this.phoneNum = phoneNum;
        this.email = email;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public String getName() {
        return name;
    }

    public int getPassword() {
        return password;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getEmail() {
        return email;
    }

}
