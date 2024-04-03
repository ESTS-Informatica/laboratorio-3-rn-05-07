
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
    
    public AirTransportation(String name, int numberOfContainers){
        super.setFees(4.0);
        this.name = name;
        this.numberOfContainers = numberOfContainers;
    }
    
    public String getName() { return name; }
    public int getNumberOfContainers() { return numberOfContainers; }

    public void setName(String name) { this.name = name; }
    public void setNumberOfContainers(int numberOfContainers) { this.numberOfContainers = numberOfContainers; }
}
