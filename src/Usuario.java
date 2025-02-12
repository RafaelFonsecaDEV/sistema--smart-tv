public class Usuario {
    public static void main(String[] args) throws Exception {
        

         SmartTv tSmartTv = new SmartTv();

        tSmartTv.dminuirVolume();
        tSmartTv.dminuirVolume();
        tSmartTv.dminuirVolume();
        tSmartTv.aumentarVolume();
        System.out.println("VOLUME ATUAL?" +tSmartTv.volume);
        
        
        
        
         System.out.println("TV LIGADA ?" +tSmartTv.ligada);
         
         System.out.println("CANAL ATUAL?" +tSmartTv.canal);
  
         System.out.println("VOLUME ATUAL?" +tSmartTv.volume);


         tSmartTv.ligar();
         System.out.println("novo status ->" + "TV LIGADA ?" +tSmartTv.ligada);



    }
}
