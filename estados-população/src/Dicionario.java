import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    public static void main(String[] args){

        System.out.println("Os estados brasileiros e suas populações:");
       
        Map<String, Double> estadosBrasileiros = new HashMap<String, Double>(){{

        put("PE", (double) 9616621);
        put("AL", (double) 3351543);
        put("CE", (double) 9187103);
        put("RN", (double) 3534265);

        }};
        System.out.println(estadosBrasileiros);

    }
}
