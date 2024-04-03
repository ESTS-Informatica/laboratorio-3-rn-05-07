
/**
 * Escreva uma descrição da classe AirTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AirTransportation extends Transport
{
    private String name;
    private int numberOfContainers;
    private final static double AIR_FEES = 4.0; 
    
    public AirTransportation(String name, int numberOfContainers){
        setFees(AIR_FEES);
        this.name = name;
        this.numberOfContainers = numberOfContainers;
    }
    
    public String getName() { return name; }
    public int getNumberOfContainers() { return numberOfContainers; }

    public void setName(String name) { this.name = name; }
    public void setNumberOfContainers(int numberOfContainers) { this.numberOfContainers = numberOfContainers; }

    public double getPriceWithFees() { return super.getPriceWithFees(); }

    @Override
    public String getTransportType() { return "Transporte Aéreo"; }

    public String toString() { 
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("%15s: %s\n", "Nome", getName()));
        sb.append(String.format("%15s: %d\n", "NºContentores", getNumberOfContainers()));
        return sb.toString(); 
    }

}
    