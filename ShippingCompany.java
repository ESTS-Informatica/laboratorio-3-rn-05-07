import java.util.HashSet; 
import java.util.ArrayList;
/**
 * Escreva uma descrição da classe ShippingCompany aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ShippingCompany extends HashSet<Transport>
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String name;
    private ArrayList<Transport> inService;
    /**
     * Construtor para objetos da classe ShippingCompany
     */
    public ShippingCompany(String name)
    {
        this.name = name;
        inService = new ArrayList<Transport>();
    }
    public String getName(){
        return name;
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for(Transport tp: inService){
            sb.append(tp.toString());
        }
        return sb.toString();
    }
}
