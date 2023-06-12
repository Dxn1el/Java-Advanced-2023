package SetsAndMapsADVANCED.EXERCISE;
import java.util.*;
public class FixEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> emailsMap=new LinkedHashMap<>();
        String name=scanner.nextLine();
        while(!name.equals("stop")){
            String mail=scanner.nextLine();
            if(mail.endsWith("uk") || mail.endsWith("us")||mail.endsWith("com") ){

            }else{
                emailsMap.put(name,mail);
            }
            //uk us com- NO

            name=scanner.nextLine();
        }
        emailsMap.entrySet().forEach(k-> System.out.println(k.getKey()+" -> "+k.getValue()));
    }
}
