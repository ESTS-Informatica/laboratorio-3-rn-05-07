
/**
 * Escreva uma descrição da classe Van aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Van extends GroundTransportation
{
    private int packages;
    
    public Van(String licensePlate, int packages){
        super(licensePlate);
        this.packages = packages;
    }
    
    public int getPackages() { return packages; }
    public String getLicensePlate() { return super.getLicensePlate(); }
    
    public void setPackages(int packages) { this.packages = packages; }
    public void setLicensePlate(String licensePlate) { super.setLicensePlate(licensePlate); }

    public String toString() { 
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("%15s: %d\n", "NºPacotes", getPackages()));
        sb.append(String.format("%15s: %s\n", "Matrícula", super.getLicensePlate()));
        return sb.toString(); 
    }
}
