/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinPro;

/**
 *
 * @author HP
 */
import java.util.Arrays;
import java.util.List;

public class Akun{

    private String username;
    private String password;
    private String role;

    private String[] roleList = {"admin", "customer"};
    List<String> list = Arrays.asList(roleList);

    Akun(String username, String password, String role){
        this.username = username;
        this.password = password;
        if(list.contains(role)){
            this.role = role;
        }else this.role = null;
    }

    public String getRole(){
        return this.role;
    }

    public Akun authenticate(String username, String password){
        if(this.username.equals(username) && this.password.equals(password))
            return this;

        return null;
    }


}
