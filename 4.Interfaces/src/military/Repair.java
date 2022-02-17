package military;

public class Repair {
   private String partName;
   private int hoursOfRepair;

    public Repair(String partName, int hoursOfRepair) {
        this.partName = partName;
        this.hoursOfRepair = hoursOfRepair;
    }

    public String getPartName() {
        return partName;
    }

    public int getHoursOfRepair() {
        return hoursOfRepair;
    }
}
