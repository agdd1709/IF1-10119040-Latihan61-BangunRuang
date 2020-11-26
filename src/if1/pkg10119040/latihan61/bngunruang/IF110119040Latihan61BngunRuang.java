/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan61.bngunruang;

/**
 *
 * @author User
 * Nama : Agus Deri Dermawan
 * NIM  : 10119040
 * Kelas: IF1
 * program ini membuat sebuah program bangun ruang
 * dengan metode Inheritance
 */
public class IF110119040Latihan61BngunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bola bola = new Bola();
        bola.setJari(7);
        bola.setPhi(3.14);
        
        Tabung tabung = new Tabung();
        tabung.setJari(10);
        tabung.setTinggi(21);
        tabung.setPhi(3.14);     
        
        Kerucut kerucut = new Kerucut();
        kerucut.setJari(14);
        kerucut.setTinggi(9);
        kerucut.setPhi(3.14);
        
        System.out.println("Volume Bola : "+ Math.ceil(bola.hitungVolume()) + " cm3");
        System.out.println("Volume Tabung : "+ Math.ceil(tabung.hitungVolume()) + " cm3");
        System.out.println("Volume Kerucut : "+ Math.ceil(kerucut.hitungVolume()) + "cm3");
    }
    
}
