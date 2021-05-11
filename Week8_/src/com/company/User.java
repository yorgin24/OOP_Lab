package com.company;

public class User {
    private String user_id;
    private String password;
    private boolean login_status;

    public User(String user_id, String password, boolean login_status ){
        this.user_id = user_id;
        this.password = password;
        this.login_status = login_status;
    }

    public boolean verify_login(String password){
        login_status = this.password.equals(password);
        return login_status;
    }

    public String getUser_id(){
        return user_id;
    }

    public String getPassword(){
        return password;
    }
}
