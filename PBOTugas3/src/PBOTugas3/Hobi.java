/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBOTugas3;

/**
 *
 * @author ASUS
 */
 public abstract class Hobi extends Pekerjaan {
    protected String hobi;
    
    public Hobi(String nama, String pekerjaan, String hobi) {
        super(nama, pekerjaan);
        this.hobi = hobi;
    }    
    public abstract void melakukanHobi();
}
