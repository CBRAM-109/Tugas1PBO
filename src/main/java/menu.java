import static java.lang.System.exit;
import java.util.Scanner;

public class menu {

    public static void main(String[]args) {
       Scanner bangunruang = new Scanner(System.in); //memanggil library
       rumus hitung = new rumus(); //Memanggil class "hitung"
        
        do {
            System.out.print("Menu \n1. Kubus \n2. Bola \n3. Tabung \n4. Keluar \n\nPilih Menu : "); //Menu 
            int menu = bangunruang.nextInt(); //input menu
            System.out.println();
            switch (menu) {
                case 1: { //pilihan menu 1 
                    System.out.println("1. Volume Kubus");
                    System.out.println("2. Luas PermukaanKubus");
                    System.out.print("Pilih Menu  : ");  
                    int pilih = bangunruang.nextInt(); //input pilih
                    System.out.println();
                    
                        if (pilih == 1) { //pilihan pilih 1 dalam menu 1
                            System.out.println("= = = = = Volume Kubus = = = = =");
                            System.out.print("Masukkan Rusuk  : "); 
                            double rusuk = bangunruang.nextDouble(); //input nilai rusuk kubus
                            System.out.print(hitung.VolumeKubus(rusuk)); //pemanggilan proses rumus yang telah di declare di class rumus
                            System.out.println("Cm3");
                            System.out.println();
                    } 
                        else if (pilih == 2) { //pilihan pilih 2 dalam menu 1
                            System.out.println("= = = = = Luas Permukaan Kubus = = = = =");
                            System.out.print("Masukkan Rusuk  : ");
                            double rusuk = bangunruang.nextDouble(); //input nilai rusuk kubus
                            System.out.print(hitung.LuasPermKubus(rusuk)); //pemanggilan proses rumus yang telah di declare di class rumus
                            System.out.println("Cm2");
                            System.out.println();
                    }
                    break;
                }
                case 2: {
                    System.out.println("1. Volume Bola");
                    System.out.println("2. Luas Permukaan Bola");
                    System.out.print("Pilih Menu  : ");                    
                    int pilih = bangunruang.nextInt(); //input pilih
                    System.out.println();
                    
                        if (pilih == 1) { //pilihan pilih 1 dalam menu 2
                            System.out.println("= = = = = Volume Bola = = = = =");
                            System.out.print("Masukkan Jari-Jari  : ");
                            double jari = bangunruang.nextDouble(); //input nilai jari jari bola
                            System.out.print(hitung.VolumeBola(jari)); //pemanggilan proses rumus yang telah di declare di class rumus
                            System.out.println("Cm3");
                            System.out.println();
                    } 
                        else if (pilih == 2) { //pilihan pilih 2 dalam menu 2
                            System.out.println("= = = = = Luas Permukaan Bola = = = = =");
                            System.out.print("Masukkan Jari-Jari  : ");
                            double jari = bangunruang.nextDouble(); //input nilai jari jari bola
                            System.out.print(hitung.LuasPermBola(jari)); //pemanggilan proses rumus yang telah di declare di class rumus
                            System.out.println("Cm2");
                            System.out.println();
                    }
                    break;
                }
                case 3: {
                    System.out.println("1. Volume Tabung");
                    System.out.println("2. Luas Permukaan Tabung");
                    System.out.print("Pilih Menu  : ");
                    int pilih = bangunruang.nextInt(); //input pilih
                    System.out.println();
                    
                        if (pilih == 1) { //pilihan pilih 1 dalam menu 3
                            System.out.println("= = = = = Volume Tabung = = = = =");
                            System.out.print("Masukkan Jari-Jari  : ");
                            double jari1 = bangunruang.nextDouble(); //input nilai jari-jari tabung
                            System.out.print("Masukkan Tinggi Tabung  : ");
                            double tinggi1 = bangunruang.nextDouble(); //input nilai tinggi tabung
                            System.out.print(hitung.VolumeBola(jari1)); //pemanggilan proses rumus yang telah di declare di class rumus
                            System.out.println("Cm3");
                            System.out.println();
                    } 
                        else if (pilih == 2) { //pilihan pilih 2 dalam menu 3
                            System.out.println("= = = = = Luas Permukaan Tabung = = = = =");
                            System.out.print("Masukkan Jari-Jari  : ");
                            double jari1 = bangunruang.nextDouble(); //input nilai jari-jari tabung
                            System.out.print("Masukkan Tinggi Tabung  : ");
                            double tinggi1 = bangunruang.nextDouble(); //input nilai tinggi tabung
                            System.out.print(hitung.LuasPermBola(jari1)); //pemanggilan proses rumus yang telah di declare di class rumus
                            System.out.println("Cm2");
                            System.out.println();
                    }
                    break;
                }
                default:
                case 4: {
                    exit(0); //keluar dari program
                }
            }
        } while (true); //untuk kembali ke menu utama
    }
    
}