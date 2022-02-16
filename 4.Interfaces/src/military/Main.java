package military;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();


        Map<Integer, PrivateImpl> privatesMap = new LinkedHashMap<>();
        List<Soldier> soldierList = new LinkedList<>();

        while (!line.equals("End")) {
            String[] arg = line.split("\\s+");
            String typeOfSoldier = arg[0];
            int id = Integer.parseInt(arg[1]);
            String firstName = arg[2];
            String lastName = arg[3];
            double salary = Double.parseDouble(arg[4]);
            if (typeOfSoldier.equals("Private")) {
                PrivateImpl soldier = new PrivateImpl(id, firstName, lastName, salary);
                privatesMap.put(id, soldier);
                soldierList.add(soldier);
                System.out.println(soldier.getInformation());
            }
            if (typeOfSoldier.equals("LieutenantGeneral")) {
                LieutenantGeneralImpl lieutenantGeneral = new LieutenantGeneralImpl(id, firstName, lastName, salary);
                soldierList.add(lieutenantGeneral);
                for (int i = 5; i < arg.length; i++) {
                    int idNum = Integer.parseInt(arg[i]);
                    PrivateImpl soldier = privatesMap.get(idNum);
                    lieutenantGeneral.addPrivate(soldier);
                }
                System.out.println(lieutenantGeneral.getInformation());
            }
            line = scanner.nextLine();
        }


    }
}
