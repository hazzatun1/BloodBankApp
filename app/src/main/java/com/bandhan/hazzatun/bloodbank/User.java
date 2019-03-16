package com.bandhan.hazzatun.bloodbank;

public class User {
    private int id;
    private String name;
    private String email;
    private String password;
    private String bloodGroup;

    public User(int id, String name, String email, String password, String bloodGroup) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.bloodGroup = bloodGroup;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                '}';
    }
}
