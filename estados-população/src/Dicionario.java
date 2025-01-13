import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    public static void main(String[] args){

        System.out.println("Os estados brasileiros e suas populações:\n");
       
        Map<String, Double> estadosBrasileiros = new HashMap<String, Double>(){{

        put("PE", (double) 9616621);
        put("AL", (double) 3351543);
        put("CE", (double) 9187103);
        put("RN", (double) 3534265);

        }};
        System.out.println(estadosBrasileiros);

        System.out.println("\nSubstitua o valor do RN\n");

        estadosBrasileiros.put("RN", (double) 3534165);

        System.out.println(estadosBrasileiros);

        System.out.println("\nTem PB no dicionario? "+estadosBrasileiros.containsKey("PB"));

        estadosBrasileiros.put("PB", (double) 4039277);

        System.out.println("\nTem PB no dicionario? "+estadosBrasileiros.containsKey("PB"));

        System.out.println(estadosBrasileiros);

    }
}
