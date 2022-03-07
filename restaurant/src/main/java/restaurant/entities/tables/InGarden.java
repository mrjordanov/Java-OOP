package restaurant.entities.tables;

public class InGarden extends BaseTable {

    private final double PRICE_PER_PERSON = 4.50;

    protected InGarden(int number, int size, double pricePerPerson) {
        super(number, size, pricePerPerson);
    }


    @Override
    public void setPricePerPerson(double pricePerPerson) {
        super.setPricePerPerson(PRICE_PER_PERSON);
    }


    @Override
    public int getTableNumber() {
        return getNumber();
    }

    @Override
    public int numberOfPeople() {
        return getNumberOfPeople();
    }

    @Override
    public double pricePerPerson() {
        return getPricePerPerson();
    }

    @Override
    public boolean isReservedTable() {
        return super.isReservedTable();
    }

    @Override
    public double allPeople() {
        return ;
    }
}
