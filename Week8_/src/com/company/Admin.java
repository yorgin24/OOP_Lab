package com.company;

public class Admin extends User{
    private String admin_name;
    private String email;

    public Admin(String user_id, String password, boolean login_status, String admin_name, String email) {
        super(user_id, password, login_status);
        this.admin_name = admin_name;
        this.email = email;
    }

    public void update_katalog(){
        //?
    }

    public String getEmail(){
        return email;
    }

    public String getAdmin_name(){
        return admin_name;
    }
}
