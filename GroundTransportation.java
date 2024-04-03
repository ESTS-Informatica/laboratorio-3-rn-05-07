public class GroundTransportation extends Transport
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String licensePlate;
    private final static double GROUND_FEES = 3;
    public GroundTransportation(String licensePlate)
    {
        this.licensePlate = licensePlate;
        setFees(GROUND_FEES);
    }
    public String getLicensePlate(){
        return licensePlate;
    }
    public void setLicensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }
    public double getPriceWithFees(){
        return super.getPriceWithFees();
    }
    @Override
    public String getTransportType(){
        return "Transporte Terrestre";
    }
    
    public String toString(){
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("%15s: %s\n", "Matricula", getLicensePlate()));
        return sb.toString();
    }
}


