public class GroundTransportation extends Transport
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String licensePlate;
    public GroundTransportation(String licensePlate)
    {
        this.licensePlate = licensePlate;
        super.setFees(3.0);
    }
    public String getLicensePlate(){
        return licensePlate;
    }
    public void setLicensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }
}


