/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBOTugas3;

/**
 *
 * @author ASUS
 */
public class MahasiswaLoad {

    // Method informasi tanpa parameter
    public void informasi() {
        System.out.println("Mahasiswa: Tidak diketahui");
    }

    // Method informasi dengan 1 parameter (nama)
    public void informasi(String nama) {
        System.out.println("Mahasiswa: " + nama);
    }

    // Method informasi dengan 2 parameter (nama dan jurusan)
    public void informasi(String nama, String jurusan) {
        System.out.println("Mahasiswa: " + nama + ", Jurusan: " + jurusan);
    }

    public static void main(String[] args) {
        MahasiswaLoad mhs = new MahasiswaLoad();
        mhs.informasi();                          // Memanggil method tanpa parameter
        mhs.informasi("Andi");                    // Memanggil method dengan 1 parameter
        mhs.informasi("Budi", "Sistem Informasi"); // Memanggil method dengan 2 parameter
    }
}