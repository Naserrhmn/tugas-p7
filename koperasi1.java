package javaapplication2;

import static java.time.Clock.system;
import static java.time.InstantSource.system;

class con_construktor {
    String Nama,NIK,Jabatan ;
    int gaji, pinjaman;
    
    con_construktor(String Nama, String NIK, String Jabatan, int gaji, int pinjaman){
        this.Nama = Nama;
        this.NIK = NIK;
        this.Jabatan = Jabatan;
        this.gaji = gaji;
        this.pinjaman = pinjaman;
    }
        
    void tampil(){
         System.out.println("nama = "  + Nama);
         System.out.println("NIK = "+ NIK);
         System.out.println("Jabatan = "+ Jabatan);
         System.out.println("gaji = "+ gaji);
         System.out.println("pinjaman = "+ pinjaman);
}    
    public static void main(String[]args){
        con_construktor tes = new con_construktor("Naser","202043500932","STAFF",1000000,500000);
                tes.tampil();
    }
}
