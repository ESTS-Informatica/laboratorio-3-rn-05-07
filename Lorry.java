
/**
 * Escreva uma descrição da classe Lorry aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Lorry extends GroundTransportation
{
    private int numberOfPallets;
    private int trailers;
    public Lorry(String licensePlate, int numberOfPallets, int trailers)
    {
        super(licensePlate);
        this.numberOfPallets = numberOfPallets;
        this.trailers = trailers;
    }
    public int getNumberOfPallets (){
        return this.numberOfPallets;
    }
   public int getTrailers(){
       return trailers;
   }
   public String getLicensePlate(){
       return super.getLicensePlate();
   }
   public void setnumberOfPallets(int numberOfPallets){
       this.numberOfPallets= numberOfPallets;
   }
   public void setTrailers(int trailers){
       this.trailers = trailers;
   }
   public void setLicensePlate(String licensePlate){
       super.setLicensePlate(licensePlate);
   }
   public String toString(){
       final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("%15s: %d\n", "Numero de Paletes", getNumberOfPallets()));
        sb.append(String.format("%15s: %d\n", "Numero de Trailers: ", getTrailers()));
        return sb.toString();
   }
}
