package com.example.myfirst.temp;

/**
 * Created by 树俭啊 on 2017/12/7.
 */

public class User {
    private String name;
    private String password;
    private String hobby;
    private char sex;
    private String City;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getCity() {
        return City;
    }
    public  void setCity(String City) {
        this.City = City;
    }

    public String getHobby() {
        return hobby;
    }
    public void setHobby (String hobby) {
        this.hobby = hobby;
    }

    public User() {

    }
    public User(String name,String password,char sex,String hobby,String city) {
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.hobby = hobby;
        this.City = city;
    }
    @Override
    public String  toString() {
        return "User[name="+name+",pwd="+password+",sex="+sex+",city=" +
                City+",hobby="+hobby+"]";
    }

}
