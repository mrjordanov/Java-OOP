package military;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();


        Map<Integer, PrivateImpl> privatesMap = new LinkedHashMap<>();

        List<Soldier> soldierList = new ArrayList<>();

        while (!line.equals("End")) {
            String[] arg = line.split("\\s+");
            String typeOfSoldier = arg[0];
            int id = Integer.parseInt(arg[1]);
            String firstName = arg[2];
            String lastName = arg[3];
            double salary = Double.parseDouble(arg[4]);
            if (typeOfSoldier.equals("Private")) {
                Soldier soldier = new PrivateImpl(id, firstName, lastName, salary);
                privatesMap.put(id, new PrivateImpl(id, firstName, lastName, salary));
                soldierList.add(soldier);
               // System.out.println(soldier.getInformation());
            }
            if (typeOfSoldier.equals("LieutenantGeneral")) {
                LieutenantGeneralImpl lieutenantGeneral = new LieutenantGeneralImpl(id, firstName, lastName, salary);
                for (int i = 5; i < arg.length; i++) {
                    int idNum = Integer.parseInt(arg[i]);
                    PrivateImpl soldier = privatesMap.get(idNum);
                    lieutenantGeneral.addPrivate(soldier);
                }
                soldierList.add(lieutenantGeneral);
              //  System.out.println(((Soldier) lieutenantGeneral).getInformation());
            }
            if (typeOfSoldier.equals("Spy")) {
                String codeNumber = arg[4];
                Soldier spy = new Spy(id, firstName, lastName, codeNumber);
              //  System.out.println(spy.getInformation());
                soldierList.add(spy);
            }
            if (typeOfSoldier.equals("Engineer")) {
                String corp = arg[5];
                if (corp.equals("Airforces") | corp.equals("Marines")) {
                    SpecialisedSoldierImpl rank = SpecialisedSoldierImpl.valueOf(corp);
                    Engineer engineer = new Engineer(id, firstName, lastName, salary, rank.name());
                    for (int i = 6; i < arg.length - 1; i = i + 2) {
                        engineer.getRepairs().put(arg[i], Integer.parseInt(arg[i + 1]));
                    }
                  //  System.out.println(((Soldier) engineer).getInformation());
                    soldierList.add(engineer);
                } else {
                    continue;
                }

            }
            if (typeOfSoldier.equals("Commando")) {
                String corp = arg[5];
                if (corp.equals("Airforces") | corp.equals("Marines")) {
                    SpecialisedSoldierImpl rank = SpecialisedSoldierImpl.valueOf(corp);
                    Commando commando = new Commando(id, firstName, lastName, salary, rank.name());
                    for (int i = 6; i < arg.length - 1; i = i + 2) {
                        if (arg[i + 1].equals("inProgress") | arg[i + 1].equals("finished")) {
                            Mission mission = new Mission(arg[i], String.valueOf(arg[i + 1]));
                            commando.getMissions().add(mission);
                        } else {
                            break;
                        }
                    }
                   // System.out.println(((Soldier) commando).getInformation());
                    soldierList.add(commando);
                } else {
                    continue;
                }
            }

            line = scanner.nextLine();
        }

        for (Soldier soldier : soldierList) {
            System.out.println(soldier.getInformation());
        }

    }
}
