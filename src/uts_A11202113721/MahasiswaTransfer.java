package uts_A11202113721;

public class MahasiswaTransfer extends MahasiswaBaru {
    String asalUniversitas;

    public MahasiswaTransfer(String nama, String nim, int semester, int usia, String[] krs, String asalSekolah, String asalUniversitas) {
        super(nama, nim, semester, usia, krs, asalSekolah);
        this.asalUniversitas = asalUniversitas;
    }

    @Override
    public void infoMahasiswa(){
        super.infoMahasiswa();
        System.out.println("Asal Universitas : " + asalUniversitas);
    }
    
    public boolean ikutOspek(){
        return super.ikutOspek();
    }

    public static void main(String[] args) {
        String[] krs = {"Pemrograman Berorientasi Objek", "Algoritma dan Struktur Data", "Pemrograman Web"};
        MahasiswaTransfer mhs = new MahasiswaTransfer("Achmad Solichin", "A11.2021.13721", 3, 19, krs, "SMAN 1 Kediri", "Universitas Brawijaya");
        mhs.infoMahasiswa();
        System.out.println("Ikut OSPEK : " + mhs.ikutOspek());
    }
}
