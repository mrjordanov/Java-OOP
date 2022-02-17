package military;

import java.util.LinkedHashMap;
import java.util.Map;

public class LieutenantGeneralImpl extends PrivateImpl {

    private final Map<Integer, PrivateImpl> setOfPrivatesId;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.setOfPrivatesId = new LinkedHashMap<>();
    }

  /*  public Map<Integer, PrivateImpl> getSetOfPrivates() {
        return setOfPrivatesId;
    }*/

    public void addPrivate(PrivateImpl soldier) {
        int id = soldier.getId();
        this.setOfPrivatesId.put(id, soldier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        setOfPrivatesId.values().stream().sorted((s1, s2) -> Integer.compare(s2.getId(), s1.getId()))
                .forEach(s -> sb.append(s).append("\n"));
        if(sb.length()==0){
            return super.toString() + "\nPrivates:";
        }else {
            return super.toString() + "\nPrivates:\n" + sb.toString().trim();
        }
    }

    @Override
    public String getInformation(){
        return toString();
    }
}
