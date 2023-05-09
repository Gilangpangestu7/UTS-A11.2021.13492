package UTS13492;

import java.util.*;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        int pilihan;
        System.out.print("Jumlah Mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        while (true) 
        {
            System.out.println("Pilihan");
            System.out.println("1. Mahasiswa Aktif");
            System.out.println("2. Mahasiswa Baru");
            System.out.println("3. Mahasiswa Lulus");
            System.out.print("Input Pilihan : ");
            pilihan = input.nextInt();
            if (pilihan == 2) 
            {
                System.out.println("Pilih Baru atau Transfer");
                System.out.println("1. Mahasiswa Baru");
                System.out.println("2. Mahasiswa Transfer");
                pilihan = input.nextInt();
                if (pilihan == 1) 
                {
                    pilihan = 2;
                } else if (pilihan == 2) 
                {
                    pilihan = 4;
                }
            }
            switch (pilihan) 
            {
                case 1:
                    for (int i = 0; i < jumlahMahasiswa; i++) 
                    {
                        System.out.println("========================================");
                        Mahasiswa M = new Mahasiswa();
                        System.out.println("Data Mahasiswa ke-" + (i + 1) );
                        System.out.print("Nama Mhs : ");
                        M.nama = input.next();
                        System.out.print("NIM Mhs : ");
                        M.nim = input.next();
                        System.out.print("Semester : ");
                        M.semester = input.nextInt();
                        System.out.print("Usia Mhs : ");
                        M.usia = input.nextInt();
                        M.inputKrs();
                        M.hitungRataNilai();
                        daftarMahasiswa.add(M);
                        System.out.println("========================================");
                    }
                    break;
                case 2:
                    for (int i = 0; i < jumlahMahasiswa; i++)
                    {
                        MahasiswaBaru MABA = new MahasiswaBaru();
                        System.out.println("Data Mahasiswa ke-" + (i + 1));
                        System.out.print("Nama Mhs : ");
                        MABA.nama = input.next();
                        System.out.print("NIM Mhs : ");
                        MABA.nim = input.next();
                        System.out.print("Semester : ");
                        MABA.semester = input.nextInt();
                        System.out.print("Usia Mhs : ");
                        MABA.usia = input.nextInt();
                        System.out.print("Asal Sekolah : ");
                        MABA.asalSekolah = input.next();
                        MABA.inputKrs();
                        MABA.hitungRataNilai();
                        daftarMahasiswa.add(MABA);
                    }
                    break;
                case 3:
                    for (int i = 0; i < jumlahMahasiswa; i++) 
                    {
                        System.out.println("========================================");
                        MahasiswaLulus LULUS = new MahasiswaLulus();
                        System.out.println("Data mahasiswa ke-" + (i + 1));
                        System.out.print("Nama Mhs : ");
                        LULUS.nama = input.next();
                        System.out.print("NIM Mhs : ");
                        LULUS.nim = input.next();
                        System.out.print("Semester : ");
                        LULUS.semester = input.nextInt();
                        System.out.print("Usia Mhs : ");
                        LULUS.usia = input.nextInt();
                        System.out.print("Tahun Masuk : ");
                        System.out.println("========================================");
                        LULUS.tahunMasuk = input.nextInt();
                        LULUS.inputKrs();
                        LULUS.hitungRataNilai();
                        daftarMahasiswa.add(LULUS);
                    }
                    break;
                case 4:
                    for (int i = 0; i < jumlahMahasiswa; i++) 
                    {
                        System.out.println("========================================");
                        MahasiswaTransfer T = new MahasiswaTransfer();
                        System.out.println("Data mahasiswa ke-" + (i + 1));
                        System.out.print("Nama Mhs : ");
                        T.nama = input.next();
                        System.out.print("NIM Mhs : ");
                        T.nim = input.next();
                        System.out.print("Semester : ");
                        T.semester = input.nextInt();
                        System.out.print("Usia Mhs : ");
                        T.usia = input.nextInt();
                        System.out.print("Asal Universitas : ");
                        T.asalUniversitas = input.next();
                        T.inputKrs();
                        T.hitungRataNilai();
                        daftarMahasiswa.add(T);
                        System.out.println("========================================");
                    }
                    break;
            }
            // untuk tampilan 
            for (int i = 0; i < daftarMahasiswa.size(); i++) 
            {
                System.out.println("========================================");
                System.out.println("\nData mahasiswa ke- " + (i + 1));
                daftarMahasiswa.get(i).infoMahasiswa();
                daftarMahasiswa.get(i).infoKrsMahasiswa();
            }
            break;
        }
        input.close();
    }
}

