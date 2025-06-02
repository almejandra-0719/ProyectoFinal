package com.co.Izyacademic.models;

public class Datauser {

    private String name;
    private String username;
    private String city;

    public Datauser(String name, String username, String city, Double identification, Double phone, String email, String password) {
        this.name = name;
        this.username = username;
        this.city = city;
        this.identification = identification;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

    private Double identification;

    private Double phone;

    private String email;

    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getIdentification() {
        return identification;
    }

    public void setIdentification(Double identification) {
        this.identification = identification;
    }

    public Double getPhone() {
        return phone;
    }

    public void setPhone(Double phone) {
        this.phone = phone;
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











}
