package creationalPatterns.builderPattern.exampleOne;

public class Pizza {


    private String name;
    private String topping;
    private int weight;
    private int diameter;
    private boolean isHot;
    private boolean hasMeat;
    private boolean containsTomatoes;


    public Pizza() {
    }


    public Pizza withWeight(int weight) {
        this.weight = weight;
        return this;
    }


    public Pizza withName(String name) {
        this.name = name;
        return this;
    }

    public Pizza withTopping(String topping) {
        this.topping = topping;
        return this;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public boolean isHot() {
        return isHot;
    }

    public void setHot(boolean hot) {
        isHot = hot;
    }

    public boolean isHasMeat() {
        return hasMeat;
    }

    public void setHasMeat(boolean hasMeat) {
        this.hasMeat = hasMeat;
    }

    public boolean isContainsTomatoes() {
        return containsTomatoes;
    }

    public void setContainsTomatoes(boolean containsTomatoes) {
        this.containsTomatoes = containsTomatoes;
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", topping='" + topping + '\'' +
                ", weight=" + weight +
                ", diameter=" + diameter +
                ", isHot=" + isHot +
                ", hasMeat=" + hasMeat +
                ", containsTomatoes=" + containsTomatoes +
                '}';
    }
}
