package uts_A11202113721;

public class MahasiswaBaru extends Mahasiswa{
    //atribut
    String asalSekolah;


    //construktor
    public MahasiswaBaru(String nim, String nama, int semester, int usia, String[] krs, String asalSekolah){
        super(nim, nama, semester, usia, krs);
        this.asalSekolah = asalSekolah;
    }

    //method
    @Override
    public void infoMahasiswa(){
        super.infoMahasiswa();
        System.out.println("Asal Sekolah : " + asalSekolah);
    }

    public boolean ikutOspek(){
        if (semester == 1) {
            return true;
        } else {
            return false;
        }
    }
    
}
