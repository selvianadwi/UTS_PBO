package uts_A11202113721;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        //input data mahasiswa
        System.out.print("Jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        input.nextLine(); // consume new line
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i+1));
            System.out.print("NIM: ");
            String nim = input.nextLine();
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Semester: ");
            int semester = input.nextInt();
            System.out.println("Usia: ");
            int usia = input.nextInt();
    
            System.out.print("Jumlah mata kuliah: ");
            int jumlahMataKuliah = input.nextInt();
            input.nextLine(); // 

            String[] krs = new String[jumlahMataKuliah];
            int nilai[] = new int[jumlahMataKuliah];

            for (int j = 0; j < jumlahMataKuliah; j++) {
                System.out.println("masukkan nama mata kuliah: ");
                krs[j] = input.nextLine();
                System.out.println("masukkan nilai mata kuliah: ");
                nilai[j] = input.nextInt();
                input.nextLine();
            }
            
            Mahasiswa mhs = new Mahasiswa(nim, nama, semester, usia, krs);

            ArrayList<Mahasiswa> listmahasiswa = new ArrayList<Mahasiswa>();
            listmahasiswa.add(mhs);

            for(Mahasiswa mahasiswa : listmahasiswa){
                mahasiswa.infoMahasiswa();
                mahasiswa.infoKrsMahasiswa();
                System.out.println("Rata-rata Nilai: "+ mahasiswa.hitungRataNilai(nilai));
                System.out.println("======================================");

                
            }
        }
        
        input.close();
    }
}