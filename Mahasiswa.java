package UTS13492;

import java.util.Scanner;

public class Mahasiswa 
{
    Scanner input = new Scanner(System.in);
    Scanner inputKRS = new Scanner(System.in);
    String nama,nim;
    int semester,usia;
    String[] krs;
    private static final int MaksimalKrs = 20;
    float rata,totalIPK;
    int looping;

    public float hitungRataNilai() 
    {
        this.totalIPK = 0;
        int[] nilai = new int [this.looping+1];
        for(int i = 0; i <= this.looping; i++) 
        {
            System.out.print("Tambahkan nilai mata kuliah " + krs[i] + " : ");
            nilai[i] = input.nextInt();
        }
        int total = 0;
        for (int i = 0; i <= this.looping; i++)  
        {
            total += nilai[i];
        }
        for(int i = 0; i <= this.looping; i++) 
        {
            if(nilai[i]>=80 && nilai [i] <= 100)
            {
                float nilaiIPK = 4.0f;
                totalIPK += nilaiIPK;
            }else if (nilai[i]>=70 && nilai[i]<80) 
            {
                float nilaiIPK = 3.0f;
                totalIPK += nilaiIPK;
            }else if (nilai[i]>=60 && nilai[i]<69) 
            {
                float nilaiIPK = 2.0f;
                totalIPK += nilaiIPK;
            }else if (nilai[i]>=50 && nilai[i]<59) 
            {
                float nilaiIPK = 1.0f;
                totalIPK += nilaiIPK;
            }else if (nilai[i]>=0 && nilai[i]<49) 
            {
                float nilaiIPK = 0.0f;
                totalIPK += nilaiIPK;
            }else
            {
                return totalIPK;
            }
        }
        this.rata = (float) total / (this.looping+1);
        return rata;
    }

    public void infoMahasiswa() 
    {
        System.out.println("========================================");
        System.out.println("Nama " + this.nama);
        System.out.println("NIM " + this.nim);
        System.out.println("Semester "+ this.semester);
        System.out.println("Usia " + this.usia);
        System.out.println("Rata-Rata " + this.rata);
        if (this instanceof MahasiswaTransfer) 
        {
            System.out.println(((MahasiswaTransfer)this).ikutOspek());
        } else if (this instanceof MahasiswaBaru) 
        {
            System.out.println(((MahasiswaBaru)this).ikutOspek());
        }
    }

    public void inputKrs() 
    {
        System.out.println("========================================");
        System.out.println("PENGISIAN KRS");
        this.krs = new String[MaksimalKrs];    //maksimal 20 matkul
        for(int i = 0; i < MaksimalKrs; i++) //looping
        {
            System.out.print("Mata Kuliah ke- " + (i+1) + " : " );
            this.krs[i] = inputKRS.nextLine();
            if ( i >= 4) 
            {
                System.out.print("Apakah Sudah ( Y/N ) : ");
                String sudah = inputKRS.nextLine();
                if (sudah.equalsIgnoreCase("Y"))
                {
                    this.looping = i;
                    break;
                }
            }
            this.looping = i;
        }
    }

    public void infoKrsMahasiswa()
    {
        System.out.println("========================================");
        System.out.println("KRS Mahasiswa dengan NIM " + this.nim + ": ");
        for (int i = 0; i <= this.looping; i++) //looping
        {
            if(krs[i] == null)
            {
                break;
            }
            System.out.println("- " + this.krs[i]);
        }
        System.out.println("========================================");
    }
}
