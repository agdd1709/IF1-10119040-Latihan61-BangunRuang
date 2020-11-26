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
public class Bola implements BangunRuang{
    private int jari;
    private double phi;
    
    public int getJari(){
        return jari;
    }
    public void setJari(int jari){
        this.jari = jari;
        
    }
    public double getPhi(){
        return phi;  
    }
    public void setPhi(double phi){
        this.phi = phi;
        
    }
    @Override
    public double hitungVolume(){
        return 1.33 * phi * jari * jari * jari;
    }
    
}
