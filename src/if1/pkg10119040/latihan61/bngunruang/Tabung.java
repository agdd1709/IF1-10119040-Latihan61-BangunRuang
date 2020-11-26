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
public class Tabung implements BangunRuang{
    private int jari;
    private int tinggi;
    private double phi;
    
    public int getJari(){
        return jari;
    }
    public void setJari(int jari){
        this.jari = jari;
    }
    
    public int getTinggi(){
        return tinggi;
    }
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    
    public double getPhi(){
        return phi;       
    }
    public void setPhi(double phi){
        this.phi = phi;
    }
    
    public double hitungLuas(){
        return phi * jari * jari;
    }
    
    @Override
    public double hitungVolume(){
        return hitungLuas() * tinggi;
    }
}
