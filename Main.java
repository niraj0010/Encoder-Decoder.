import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
     Encoder e1 = new Encoder ();
     e1.encode ("Hello Love");
     int num [] = e1.encode("Hello Love");
     Decoder d1 = new Decoder ();
     String answer = d1.decode (num);
     System.out.println(Arrays.toString(num));
     System.out.println (answer);


    }
}