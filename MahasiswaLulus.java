package UTS13492;

public class MahasiswaLulus extends Mahasiswa
{
    int tahunMasuk;
    float ipk;

    public boolean ikutWisuda() 
    {
        if(tahunMasuk > 2018 && tahunMasuk <= 2022) 
        {
            System.out.println("Mahasiswa sudah lulus");
            return true;
        } else 
        {
            System.out.println("Mahasiswa belum lulus");
            return false;
        }
    }

    @Override
    public void infoMahasiswa() 
    {
        if(ikutWisuda() == true) 
        {
            int i = looping * 4;
            this.ipk = (super.totalIPK / i) + 2;
            System.out.println("Sudah lulus" + ipk);
            super.infoMahasiswa();
        }
    }
}
