package com.abc.sql;

public class contact {
    String uname,ucontact,uemail,uaddress;

    public contact(String uname, String ucontact, String uemail, String uaddress) {
        this.uname = uname;
        this.ucontact = ucontact;
        this.uemail = uemail;
        this.uaddress = uaddress;

    }

    public String getUname() {
        return uname;
    }

    public String getUcontact() {
        return ucontact;
    }

    public String getUemail() {
        return uemail;
    }

    public String getUaddress() {
        return uaddress;
    }
}

