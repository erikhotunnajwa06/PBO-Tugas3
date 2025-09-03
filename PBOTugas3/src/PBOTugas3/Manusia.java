/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBOTugas3;

/**
 *
 * @author ASUS
 */
public class Manusia extends Hobi {

    public Manusia(String nama, String pekerjaan, String hobi) {
        super(nama, pekerjaan, hobi);
    }

    public void memilikiIdentitas() {
        System.out.println("Nama     : " + nama);
    }

    public void bekerja() {
        System.out.println("Pekerjaan: " + pekerjaan);
    }

    public void melakukanHobi() {
        System.out.println("Hobi     : " + hobi);
    }

    public static void main(String[] args) {
        Manusia manusia = new Manusia("Budi", "Software Engineer", "Membaca");
        System.out.println("  ==Biodata==");
        manusia.memilikiIdentitas();   
        manusia.bekerja();   
        manusia.melakukanHobi();        
    }
}
