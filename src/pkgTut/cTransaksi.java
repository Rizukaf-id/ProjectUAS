package pkgTut;

public class cTransaksi {
    String kode;
    String pembeli;
    cbarang barang;
    int jumlah ;
    int status;
    cTransaksi next;
    
    cTransaksi(String k, String p, cbarang b, int j, int s){
        kode=k; pembeli=p; barang=b; jumlah= j; status=s;
        next = null;
    }
    public void setStatus(int s){
        status=s;
    }
    public String getKode(){
        return kode;
    }
    public String getPembeli(){
        
    return pembeli;
    }
     
    
    public cbarang getBarang(){
        return barang;
    }
    public void show(){
        String nam = barang.getNama();
        System.out.print(nam);
    }
    
    public int getJumlah(){
        return jumlah;
    }
    public int getStatus(){
        return status;
    }
        
}
