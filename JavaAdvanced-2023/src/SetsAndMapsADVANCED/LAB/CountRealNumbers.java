package SetsAndMapsADVANCED.LAB;
import java.util.*;
public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] input= Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        LinkedHashMap<Double,Integer> numbers=new LinkedHashMap<>();
        for (double v : input) {
            if(numbers.containsKey(v)){
                int counter= numbers.get(v)+1;
                numbers.put(v,counter);
            }else{
                numbers.put(v,1);
            }
        }
        for (Map.Entry<Double, Integer> entry : numbers.entrySet()) {
            System.out.printf("%.1f -> %d%n",entry.getKey(),entry.getValue());
        }
    }
}
