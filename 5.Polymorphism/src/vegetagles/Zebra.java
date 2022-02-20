package vegetagles;

public class Zebra extends Mammal {

    public Zebra(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
   public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eatFood(Food food) {
        if (food instanceof Meat){
            throw new IllegalArgumentException("Zebras are not eating that type of food!");
        }
        super.eatFood(food);
    }
}
