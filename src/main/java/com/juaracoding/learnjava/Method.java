package com.juaracoding.learnjava;

public class Method {

    public static void main(String[] args) {

        login("admin", "Admin123");
        
        //Method tanpa parameter
        kotak();
        System.out.println();
        kotak();

        //Method menggunkan parameter
        segitiga(5);
        System.out.println();
        segitiga(10);

        //Method return
        System.out.println(luasKotak(5));
        System.out.println(luasKotak(10));

        System.out.println(diskon(500000, 50));


        double[] prices = {30000,40000,50000};
        System.out.println(totalBayar(prices));

        String [] namaProducts = {"Asus", "MSI", "colorful"};

        listProducts(namaProducts, prices);
    }

    public static void kotak (){
        int sisi = 10;
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void segitiga (int tinggi){
        for (int i = 1; i <= tinggi; i++){
            for (int j = 1; j <= i; j++){
                    System.out.print("*");  
            }
             System.out.println("*");
        }
    } 

    public static int luasKotak (int sisi){
        return sisi * sisi;
    }

    public static int diskon (int hargaAwal, int potongan){
        return hargaAwal - (hargaAwal * potongan / 100);
    }

    public static double subTotal (int qty, int hargaAwal, int diskon){
        int total = hargaAwal * qty;

        if (total > 100000) {
            return diskon(total, diskon);
        }else{
            return total;
        }
    }

    //total bayar parameter array prices
    public static double totalBayar (double[] prices){
        double sum = 0;
        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];
        } 
        return sum;
    }

    //product list
    public static void listProducts(String[] namaProducts, double[] harga){
        for (int i = 0; i < harga.length; i++) {
            System.out.printf("%d. %s Rp. %.2f%n", i+1, namaProducts[i], harga[i]);
            
        }
    }

    //method login
    public static void login (String userName, String password){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int batas = 3;
        while (batas > 0){
                System.out.println("Masukkan Username: ");
                String inputUserName = scanner.nextLine();
                System.out.println("Masukkan Password: ");
                String inputPassword = scanner.nextLine();
                if (inputUserName.equals(userName)&& inputPassword.equals(password)){
                    System.out.println("login berhasil");
                    break;
                } else{
                    System.out.println("Username atau Password salah, Silahkan coba lagi");
                    batas--;
                    System.out.println("Sisa percobaan: " + batas);
                    if (batas == 0){
                        System.out.println("Akun anda di blokir sementara harap hubungi CS ");
                        break;
                    }
                }   
            }
                 System.out.println("Menu Aplikasi");
         System.out.println("1. Cek Saldo");
         System.out.println("2. Deposit");
         System.out.println("3. Tarik Tunai");
         System.out.println("4. Transfer");
         System.out.println("5. Keluar");
         System.out.print("Pilih menu: ");
         java.util.Scanner input = new java.util.Scanner(System.in);
         int menu = input.nextInt();
         switch (menu) {
            case 1:
                 System.out.println("Cek Saldo");
                 break;
            case 2:
                 System.out.println("Deposit");
                 break;
            case 3:
                 System.out.println("Tarik Tunai");
                 break;
            case 4:
                 System.out.println("Transfer");
                 break;
            case 5:
                System.exit(0);
            default:
                 System.out.println("Menu tidak tersedia");
             }
    }
}


        


