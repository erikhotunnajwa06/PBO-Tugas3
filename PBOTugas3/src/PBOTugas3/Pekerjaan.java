/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBOTugas3;

/**
 *
 * @author ASUS
 */
public abstract class Pekerjaan extends Identitas {
    protected String pekerjaan;
    
    public Pekerjaan(String nama, String pekerjaan) {
        super(nama);
        this.pekerjaan = pekerjaan;
    }    
    public abstract void bekerja();
}
