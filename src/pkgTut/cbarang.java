package pkgTut;

public class cbarang {
    String nama;
    int harga;
    
    cbarang (String n, int h){
        nama=n; harga=h;
    }
    public String getNama(){
        return nama;
    }
    public int getHarga(){
        return harga;
    }
    public String disp(){
        return nama+" "+harga;
    }
}
