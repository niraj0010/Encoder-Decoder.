public class Decoder {
    private String SecretMessage;
    private int offset;
     public String decode (int [] receiver){
         SecretMessage = "";
         for (int values : receiver) {
             SecretMessage= SecretMessage +(char) values;
         }
         return SecretMessage;
     }
     public String decode (int[] receiver, int offset) {
         this.offset = offset;
         SecretMessage = "";
         for (int values : receiver) {
             SecretMessage = SecretMessage + (char)(values-offset);
         }
         return SecretMessage;

     }
}