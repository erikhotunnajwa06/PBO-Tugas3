/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBOTugas3;

/**
 *
 * @author ASUS
 */
public class MahasiswaRide extends Orang {
    // Method overriding
    @Override
    public void belajar() {
        System.out.println("Mahasiswa belajar sabar.");
    }

    //Method Tambahan
    public void berbicara() {
        System.out.println("Mahasiswa sedang presentasi");
    }


    public static void main(String[] args) {
        Orang orang = new Orang();
        orang.belajar();  // Memanggil method info() dari kelas Orang

        MahasiswaRide mhs = new MahasiswaRide();
        mhs.belajar();    // Memanggil method info() yang di-override 
        mhs.berbicara(); 
    }
}
