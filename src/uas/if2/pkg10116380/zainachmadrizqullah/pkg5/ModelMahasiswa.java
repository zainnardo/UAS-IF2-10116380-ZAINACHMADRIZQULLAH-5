/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if2.pkg10116380.zainachmadrizqullah.pkg5;

/**
 *
 * @author lenovo -
 */
public class ModelMahasiswa {
    
    public String nim,nama;
    
    public ModelMahasiswa(String nim,String nama){
        this.nim = nim ;
        this.nama = nama;
    }
    
    public String getNim(){
        return nim;
    }
    
    public String getNama(){
        return nama;
    }
    
}
