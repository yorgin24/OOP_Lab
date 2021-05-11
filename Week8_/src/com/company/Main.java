package com.company;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("UserPertama", "Password1",false);

        System.out.println("Id User : " + user1.getUser_id());
        System.out.println("Password : " + user1.getPassword());
        System.out.println("Login Status : " + user1.verify_login(user1.getPassword()));

        System.out.println("\n");

        Customer customer1 = new Customer("CustomerSatu", "Customer1", false, "NamaCustomer1",
                "alamatCustomer1", "customer1@email.com", "ccCustomer1Info", "shippingCustomer1");

        System.out.println("Id User : " + customer1.getUser_id());
        System.out.println("Password : " + customer1.getPassword());
        System.out.println("Login Status : " + customer1.verify_login(customer1.getPassword()));
        System.out.println("Customer Name : " + customer1.getCustomer_name());
        System.out.println("Address : " + customer1.getAddress());
        System.out.println("Email : " + customer1.getEmail());
        System.out.println("Credit card Info : " + customer1.getCredit_card_info());
        System.out.println("Shipping Info : "+ customer1.getShipping_info());


        System.out.println("\n");


        Admin admin1 = new Admin("AdminSatu", "Admin1", false, "NamaAdmin1", "admin1@email.com");

        System.out.println("Id User : " + admin1.getUser_id());
        System.out.println("Password : " + admin1.getPassword());
        System.out.println("Login Status : " + admin1.verify_login(admin1.getPassword()));
        System.out.println("Admin Name : " + admin1.getAdmin_name());
        System.out.println("Admin email: " + admin1.getEmail());

    }
}
