package UTS13492;

public class MahasiswaTransfer extends MahasiswaBaru
{
    String asalUniversitas;

    @Override
    public boolean ikutOspek() 
    {
        return super.ikutOspek();
    }

    @Override
    public void infoMahasiswa() 
    {
        System.out.println("Asal Universitas : " + this.asalUniversitas);
        super.infoMahasiswa();
    }
}
