package uts_A11202113721;

public class MahasiswaLulus extends Mahasiswa{
    int tahunWisuda;
    float ipk;

    //construktor
    public MahasiswaLulus(String nim, String nama, int semester, int usia, String[] krs, int tahunWisuda, float ipk) {
        super(nim, nama, semester, usia, krs);
        this.tahunWisuda = tahunWisuda;
        this.ipk = ipk;
    }

    //method
    public boolean ikutWisuda(){
        if (ipk >= 2.75) {
            return true;
        } else {
            return false;
        }
    }
    
    public void infoMahasiswa(){
        super.infoMahasiswa();
        System.out.println("Tahun Wisuda : " + tahunWisuda);
        System.out.println("IPK : " + ipk);
    }

    public static void main(String[] args) {
        String [] krs = {"Pemrograman Berorientasi Objek", "Algoritma dan Struktur Data", "Pemrograman Web"};
        int nilai[] = {80, 90, 85};
        MahasiswaLulus mhs = new MahasiswaLulus("A11.2021.13721","Selviana Dwi", 3, 19, krs, 2025, 3.5f);
        mhs.infoMahasiswa();
        System.out.println("Ikut Wisuda : " + mhs.ikutWisuda());
        System.out.println("Rata-rata Nilai : " + mhs.hitungRataNilai(nilai));
    }



}

