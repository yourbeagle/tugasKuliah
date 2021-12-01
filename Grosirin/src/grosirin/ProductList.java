/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grosirin;

/**
 *
 * @author mainw
 */
public class ProductList {
    private String namabarang;
    private String jumlah;
    private String idBarang;
    private String total;
    private String tmpPhoto;
    
    public ProductList(String namabarang, String jumlah, String total, String idBarang)
    {
        this.namabarang = namabarang;
        this.jumlah = jumlah;
        this.total = total;
        this.idBarang = idBarang;
    }
    
    
    
//    public void settmpPhoto(String tmpPhoto)
//    {
//        this.tmpPhoto = tmpPhoto;
//    }
//    
//    public String gettmpPhoto()
//    {
//        return tmpPhoto;
//    }
    
    public void setIdBarang(String idBarang)
    {
        this.idBarang = idBarang;
    }
    
    public String getIdBarang()
    {
        return idBarang;
    }
    
    public String getNamaBarang()
    {
        return namabarang;
    }
    
    public void setNamaBarang(String namabarang)
    {
        this.namabarang = namabarang;
    }
    
    public String getJumlah()
    {
        return jumlah;
    }
    
    public void setJumlah(String jumlah)
    {
        this.jumlah = jumlah;
    }
    
    public String getTotal()
    {
        return total;
    }
    
    public void setTotal(String total)
    {
        this.total = total;
    }
}
