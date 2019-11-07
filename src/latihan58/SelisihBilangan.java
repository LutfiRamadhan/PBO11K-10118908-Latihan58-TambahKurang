/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan58;

/**
 *
 * @author lutfi
 * NAMA : LUTFI RAMADHAN
 * NIM  : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class SelisihBilangan extends Bilangan{

    public void tampilSelisih(){
        System.out.println("Hasil Selisih "+super.getX()+" - "+super.getY()+" = "+(super.getX()-super.getY()));
    }
}
