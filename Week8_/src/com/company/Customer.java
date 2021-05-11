package com.company;

import java.lang.ref.SoftReference;

public class Customer extends User{
    private String customer_name;
    private String address;
    private String email;
    private String credit_card_info;
    private String shipping_info;

    public Customer(String user_id, String password, boolean login_status,
                    String customer_name, String address, String email, String credit_card_info, String shipping_info ) {
        super(user_id, password, login_status);
        this.customer_name = customer_name;
        this.address = address;
        this.email = email;
        this.credit_card_info = credit_card_info;
        this.shipping_info = shipping_info;
    }

    public String getCustomer_name(){
        return customer_name;
    }

    public String getAddress(){
        return address;
    }

    public String getEmail(){
        return email;
    }

    public String getCredit_card_info(){
        return credit_card_info;
    }

    public String getShipping_info(){
        return shipping_info;
    }

    public void bill(){
        //?
    }

    public void register(){
        //?
    }

    public void login(){
        //?
    }

    public void update_profil(String customer_name, String address){
        this.customer_name = customer_name;
        this.address = address;
    }

    private void calculate_next_bill_amount(){
        //?
    }

    private void generate_invoice_pdf_version(){
        // ?
    }
}
