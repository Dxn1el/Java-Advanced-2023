package SetsAndMapsADVANCED.EXERCISE;

import java.util.*;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        TreeMap<String, LinkedHashMap<String, Integer>> userMap = new TreeMap<>();
        while (!input.equals("end")) {
//"IP={IP.Address} message={A&sample&message} user={username}"
            String[] infoArr = input.split(" ");
            String ip = infoArr[0].split("=")[1];
            String message = infoArr[1].split("=")[1];
            String username = infoArr[2].split("=")[1];
            if (!userMap.containsKey(username)) {
                userMap.put(username, new LinkedHashMap<>() {{
                    put(ip, 1);
                }});

            } else {
                Map<String, Integer> currentIps = userMap.get(username);
                if (!currentIps.containsKey(ip)) {
                    userMap.get(username).put(ip, 1);
                } else {
                    int currentVisits = currentIps.get(ip) + 1;
                    userMap.get(username).put(ip, currentVisits);
                }
            }
            input = scanner.nextLine();
        }
        userMap.keySet().forEach(e -> {
            System.out.println(e + ":");
            Map<String, Integer> ips = userMap.get(e);
            ips.entrySet().forEach(ip -> {
                System.out.println(ip.getKey()+" => "+ip.getValue()+", ");
            });
        });
    }
}
