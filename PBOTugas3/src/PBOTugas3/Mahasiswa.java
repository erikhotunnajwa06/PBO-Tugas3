/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBOTugas3;

/**
 *
 * @author ASUS
 */
public class Mahasiswa implements IdentitasMhs, Akademik, Aktivitas {

    public void berIdentitas() {
        System.out.println("Nama: Andi");
        System.out.println("NIM: 123456789");
    }
 
    public void berJurusan() {
        System.out.println("Jurusan: Teknik Informatika");
    }

    public void berKegiatanEkstrakurikuler() {
        System.out.println("Kegiatan Ekstrakurikuler: Klub Robotik");
    }

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.berIdentitas();           
        mhs.berJurusan();             
        mhs.berKegiatanEkstrakurikuler(); 
    }
}
