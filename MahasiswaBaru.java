package UTS13492;

public class MahasiswaBaru extends Mahasiswa{
    String asalSekolah;

    public boolean ikutOspek()
    {
        if(semester == 1) {
            System.out.println("Maba mengikuti ospek");
            return true;
        } else {
            System.out.println("Maba tida boleh mengikuti ospek");
            return false;
        }
    }

    @Override
    public void infoMahasiswa() {
        System.out.println("Asal sekolah  : " + this.asalSekolah);
        super.infoMahasiswa();
    }
    
}
