/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if2.pkg10116380.zainachmadrizqullah.pkg5;

/**
* Nama : Zain Achmad Rizqullah
* NIM : 10116380
* Kelas : IF 2
* Tanggal : 20 Feb 2021
* Nomor Soal: 5
*
 */
public class UASIF210116380ZAINACHMADRIZQULLAH5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          ModelMahasiswa model = new ModelMahasiswa("10110269","Rizki Adam Kurniawan");
        
        System.out.println("Nim Mahasiswa : " + model.getNim());
        System.out.println("Nama Mahasiswa : " + model.getNama());
    }
    
    
}
