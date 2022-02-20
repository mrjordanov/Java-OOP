package vegetagles;

public class Mouse extends Mammal{

    public Mouse(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
  public   void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eatFood(Food food) {
        if (food instanceof Meat){
            throw new IllegalArgumentException("Mice are not eating that type of food!");
        }
        super.eatFood(food);
    }
}
