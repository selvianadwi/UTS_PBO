package uts_A11202113721;

public class MahasiswaAktif extends Mahasiswa{
    //construktor
    public MahasiswaAktif(String nim, String nama, int semester, int usia, String[] krs){
        super(nim, nama, semester, usia, krs);
    }

    public static void main(String[] args) {
        String[] krs = {"Pemrograman Berorientasi Objek", "Algoritma dan Struktur Data", "Pemrograman Web"};
        int nilai[] = {80, 90, 85};
        MahasiswaLulus mhs = new MahasiswaLulus("A11.2021.13721","Selviana Dwi", 3, 19, krs, 2025, 3.5f);        
        mhs.infoMahasiswa();
        mhs.infoKrsMahasiswa();
        System.out.println("Rata-rata Nilai: "+ mhs.hitungRataNilai(nilai));    
    }
}
