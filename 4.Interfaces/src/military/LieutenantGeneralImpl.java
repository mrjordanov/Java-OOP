package military;


import java.util.LinkedList;
import java.util.List;


public class LieutenantGeneralImpl extends SoldierImpl {

    private final List<Private> listOfPrivates;
    private double salary;
    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary=salary;
        this.listOfPrivates = new LinkedList<>();
    }


    public void addPrivate(Private soldier) {
        this.listOfPrivates.add(soldier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
       listOfPrivates.forEach(p->sb.append("  ").append(p.toString()).append("\n"));
       // listOfPrivates.values().stream().sorted((s1, s2) -> Integer.compare(s2.getId(), s1.getId()))
        //        .forEach(s -> sb.append(s).append("\n"));
        if(sb.length()==0){
            return super.toString() + "\nPrivates:";
        }else {
            return super.toString() + "\nPrivates:\n  " + sb.toString().trim();
        }
    }

    @Override
    public String getInformation(){
        return toString();
    }
}
