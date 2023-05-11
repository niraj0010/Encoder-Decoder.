public class Encoder {

    private String message;
    private int offset;

    public int[] encode(String message) {
       this.message=message;
       int[] receiver= new int[message.length()];
       for (int i =0; i<message.length(); i++) {
           receiver [i] =message.charAt(i);
       }
       return receiver;

    }
         public int[] encode(String message,int offset) {

         this.message = message;
         this.offset = offset;
         int[] converter = new int [message.length()];
         for (int i=0; i<message.length(); i++){

             converter [i] = message.charAt(i) +offset;
         }
          return converter;
         }



}