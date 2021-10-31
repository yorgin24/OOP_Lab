/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinPro;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

//Algoritma
/*
1.
-String auth (var global) berisi role (admin/customer/undefined)
-status auth ini akan di pass di tiap menu, lalu dilakukan pengecekkan
-jika role tdk sesuai pada menu masing" maka tdk bs akses



*/

public class Main2 {
        static int setCap;
    public static void main(String[] args){
        boolean repeat = true;
        int choice;
        String auth = null;
        int totSem = 0;

        //store Structure
        ArrayList<Akun> listUser = new ArrayList();
        ArrayList<Bahan> listBahan = new ArrayList<>();
        setValue(listBahan);

        while(repeat){

            System.out.println("Program Kalkulasi keuntungan\n\n");

            System.out.println("                                     Harga jual bahan hari ini                                        ");
            System.out.println("------------------------------------------------------------------------------------------------------");
            System.out.println("|                                        Data Harga Jual                                             |");
            System.out.println("------------------------------------------------------------------------------------------------------");
            System.out.println("|     Nama Bahan     |    Harga Produsen    | Persediaan Barang |    Harga Jual    |   Profit/Unit   |");
            System.out.println("------------------------------------------------------------------------------------------------------");
            for(Bahan bhn : listBahan){
                System.out.println(String.format("|%-20s| Rp.%-18d| %-14d Kg | Rp.%-14d| Rp.%-12d |", bhn.getNamaBahan(), bhn.getHargaProdusen(), bhn.getWeight(), bhn.getHargaJual(), bhn.getProfit()));

            }
            System.out.println("------------------------------------------------------------------------------------------------------");

            Scanner scan = new Scanner(System.in);
            System.out.println("1. Login");
            System.out.println("2. input supply (admin)");
            System.out.println("3. Calculate profit");

            System.out.print("\nMasukkan input anda: ");
            System.out.println("");
            if(scan.hasNextInt()){
                choice =scan.nextInt();
            }else continue;

            switch(choice){
                case 1: {
                    auth = menuLogin(auth, listUser);
                    break;
                }
                case 2: {
                    if(auth != "admin"){
                        if(auth!=null) auth = null;
                        System.out.println("Anda belum login / tidak memiliki akses ke menu ini");
                        enterToContinue();
                        break;
                    }
                    menuAdmin(listBahan);
                    auth = null;
                    System.out.println("logged out of Admin control");
                    break;
                }
                case 3: {
                    if(auth != "customer"){
                        if(auth!=null) auth = null;
                        System.out.println("Anda belum login / tidak memiliki akses ke menu ini");
                        enterToContinue();
                        break;
                    }
                    menuCustomer(listBahan);
                    ratioMe(listBahan);
                    comparing(listBahan);
                    countMaxValue(listBahan);
                    auth = null;
                    
                    for(Bahan bhn : listBahan){
                        System.out.println("Value accumulated from " + bhn.getNamaBahan() + " = " + bhn.getValue());
                        totSem += bhn.getValue();
                    }
                    System.out.println("Total value accumulated: " + totSem);
                    
                    System.out.println("logged out of Customer control\n");
               
                    break;
                }
            }
        }
    }

    public static void enterToContinue(){
        try{
            System.in.read();
        }catch(Exception e){};
    }
    
    public static void ratioMe(ArrayList<Bahan> listBahan){
        for(Bahan bhn : listBahan){
            bhn.deterRatio();
        }
    }
    public static void countMaxValue(ArrayList<Bahan> listBahan){
        for(Bahan bhn : listBahan){
            setCap = bhn.countValue(setCap);
        }
    }

    public static void comparing(ArrayList<Bahan> listArray){
        Collections.sort(listArray, Bahan.bahRat);
    }
    
    /*
    public void Compare(ArrayList<Bahan> listBahan){
        Collections.sort(listBahan, new CustomComparator());
    }
    */
    
    public static String menuLogin(String auth, ArrayList<Akun> listAkun){

        Scanner input = new Scanner(System.in);
        String username, password;

        if(listAkun.size() == 0){
            listAkun.add(new Akun("admin", "admin", "admin"));
            listAkun.add(new Akun("customer", "customer", "customer"));
        }

        System.out.println("Menu Login");

        if(auth != null){
            System.out.println("\nAnda sudah login, tekan enter untuk kembali");
            enterToContinue();
        }else{
            System.out.println("Masukkan username: ");
            username = input.nextLine();
            System.out.println("Masukkan password: ");
            password = input.nextLine();

            for(Akun akun: listAkun){
                Akun auths = (Akun)akun.authenticate(username, password);
                if(auths!=null){
                    System.out.println("\nLogin berhasil, tekan enter untuk melanjutkan");
                    enterToContinue();
                    auth =auths.getRole();
                    break;
                }
            }
            if(auth==null){
                System.out.println("Email atau password tidak terdaftar !, tekan untuk kembali");
                enterToContinue();
            }

        }
        return auth;
    }

    public static void setValue(ArrayList<Bahan> listBahan){
        listBahan.add(new Bahan("beras", 15000));
        listBahan.add(new Bahan("minyak", 13000));
        listBahan.add(new Bahan("tepung", 10000));
        listBahan.add(new Bahan("bawang merah", 5800));
        listBahan.add(new Bahan("bawang putih", 6000));
        listBahan.add(new Bahan("sayur", 3000));

    }

    public static void menuAdmin(ArrayList<Bahan> listBahan){
        Scanner scan = new Scanner(System.in);
        int weight;
        //how to loop
        for(Bahan bhn : listBahan){
            System.out.println("Masukkan jumlah weight: " + bhn.getNamaBahan());
            weight = scan.nextInt();
            bhn.setWeight(weight);
        }
    };

    public static void menuCustomer(ArrayList<Bahan> listBahan){
        Scanner scan = new Scanner(System.in);
        int hargaJual;
        System.out.println("Masukkan capacity truck: ");
        setCap = scan.nextInt();
        //how to loop
        for(Bahan bhn : listBahan){
            bhn.setCapVal(setCap);
            System.out.println("Masukkan value resell dari: " + bhn.getNamaBahan());
            hargaJual = scan.nextInt();
            bhn.setHargaJual(hargaJual);
        }
    };

}
