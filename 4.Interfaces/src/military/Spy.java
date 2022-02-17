package military;

public class Spy extends SoldierImpl {

    private String codeNumber;

    protected Spy(int id, String firstName, String lastName, String codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }


    @Override
    public String getInformation() {
        return super.toString() + "\nCode Number: " + codeNumber;
    }
}
