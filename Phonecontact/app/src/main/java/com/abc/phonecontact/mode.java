package com.abc.phonecontact;

public class mode {

    public String uid;

    public String name;
    public String number;
    public String email;



    public mode() {
    }

    public mode(String uid, String name, String number, String email) {
        this.uid = uid;
        this.name = name;
        this.number = number;
        this.email = email;

    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getEmail() {
        return email;
    }

    public String getUid() {
        return uid;
    }
}

