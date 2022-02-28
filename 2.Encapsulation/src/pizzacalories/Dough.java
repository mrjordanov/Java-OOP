package pizzacalories;

public class Dough {

    private final int INITIAL_CALORIES_PER_GRAM = 2;
    private double FLOUR_MODIFIER;
    private double BAKING_TECHNIQUE_MODIFIER;

    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    public String getFlourType() {
        return flourType;
    }

    private void setFlourType(String flourType) {
        isValidFlourType(flourType);
        this.flourType = flourType;
    }

    private void isValidFlourType(String flourType) {
        if (flourType.equals("White")) {
            FLOUR_MODIFIER = 1.5;
        } else if (flourType.equals("Wholegrain")) {
            FLOUR_MODIFIER = 1.0;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }


    public String getBakingTechnique() {
        return bakingTechnique;
    }

    private void setBakingTechnique(String bakingTechnique) {
        isValidBakingTechnique(bakingTechnique);
        this.bakingTechnique = bakingTechnique;
    }

    private void isValidBakingTechnique(String bakingTechnique) {
        if (bakingTechnique.equals("Crispy")) {
            BAKING_TECHNIQUE_MODIFIER = 0.9;
        } else if (bakingTechnique.equals("Chewy")) {
            BAKING_TECHNIQUE_MODIFIER = 1.1;
        } else if (bakingTechnique.equals("Homemade")) {
            BAKING_TECHNIQUE_MODIFIER = 1.0;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    public double getWeight() {
        return weight;
    }

    private void setWeight(double weight) {
        if (weight < 1 | weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        return INITIAL_CALORIES_PER_GRAM * weight * FLOUR_MODIFIER * BAKING_TECHNIQUE_MODIFIER;
    }
}
