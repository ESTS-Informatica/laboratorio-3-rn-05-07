
/**
 * Escreva uma descrição da classe AppStart aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AppStart
{
    private static ShippingCompany company1;
    public AppStart(){
        company1 = new ShippingCompany("RELIABLE-MOVING");
        
    }
    public static final void main(){
        
        company1.add(new GroundTransportation("AA-12-27"));
        company1.add(new AirTransportation("POO-Flights", 76));
        company1.add(new AirTransportation("C-More", 2));
        company1.add(new Lorry("AR-99-00", 300, 3));
        company1.add(new Van("BB-KL-12", 50));
        company1.toString();
    }
    private Transport getTransportation(String id){
        for(Transport transportInList: company1){
            if(id.equals(transportInList.getId())){
                return transportInList;
            }
        }
        return null;
    }
    
    
}
