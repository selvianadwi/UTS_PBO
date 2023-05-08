package uts_A11202113721;

public class Mahasiswa {
    //atribut
    String nim;
    String nama;
    int semester;
    int usia; 
    String[] krs;
 
    //construktor
    public Mahasiswa(String nim, String nama, int semester, int usia, String[] krs){
        this.nim = nim;
        this.nama = nama;
        this.semester = semester;
        this.usia = usia;
        this.krs = krs;
    }

    //method
    public float hitungRataNilai(int[] nilai){
        float total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        return total/nilai.length;
    } 

    public void infoMahasiswa(){
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Semester : " + semester);
        System.out.println("Usia : " + usia);
    }

    public void infoKrsMahasiswa(){
        for (int i = 0; i < krs.length; i++) {
            System.out.print("KRS Mahasiswa " + (i+1) + " : " + krs[i] + "\n");
           
        }
    }

}
