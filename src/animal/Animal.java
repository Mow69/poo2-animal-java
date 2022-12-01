package animal;
import species.Species;
import diet.Diet;

public class Animal extends Species {
    // proprieties
    private String name;
    private Diet diet;    

    // getters / setters
    // animal name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // diet
    public Diet getDiet() {
        return this.getDiet();
    }

    public void setDiet(Diet diet) {
        this.diet = diet;
    }

    // dietName
    public String getDietName() {
        return diet.getDietName();
    }

    public void setDietName(String dietName) {
        this.diet.setDietName(dietName);
    }

    // dietQuantity
    public String getDietQuantity() {
        return diet.getDietQuantity();
    }

    public void setDietQuantity(String dietQuantify) {
        this.diet.setDietQuantity(dietQuantify);
    }

}
