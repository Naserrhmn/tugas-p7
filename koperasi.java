
import java.text.DecimalFormat;
import java.util.Scanner;

public class koperasi {
    String nik, nama, bagian, pinjaman;
    int pinjaman;
    double gaji;
    
    double getGajiPokok(){
        if(bagian == "keuangan"){
            gaji = 1500000;
        }else if(bagian =="staff"){
            gaji = 2000000;
        }else{
            gaji = 1000000;
        }
        
        return gaji;
                          
        }
    
    void cetak(){
        DecimalFormat df = new DecimalFormat("##0,000");
        
        System.out.println("------ Detil Pinjaman Koperasi------");
        System.out.println("NIK : " +this.nik);
        System.out.println("Nama : " +this.nama);
        System.out.println("Bagian : " +this.bagian);
        System.out.println("Pinjaman" + (this.gaji - this.pinjaman));
        System.out.println("Gaji Bersih : " + df.format(getGajiPokok()));
    }
         
}

class Mainkoperasi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        koperasi k = new koperasi();
        
        System.out.print("Nomer Karyawan : ");
        k.nik = sc.next();
        
        System.out.print("nama Karyawan : ");
        k.nama = sc.next();
        
        System.out.print("Bagian Karyawan : ");
        k.bagian = sc.next();
        
        System.out.print("Total Pinjaman : ");
        k.pinjaman = sc.next();
        
        k.cetak();
    }
}