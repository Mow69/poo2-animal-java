package diet;

public class Diet {
      // proprieties
      private String dietName = "*Carnivore*";
      private String dietQuantity = "*gros mangeur*";
  
      // constructors
      public Diet() {};
      public Diet(String dietName, String dietQuantity) {
        this.dietName = dietName;
        this.dietQuantity = dietQuantity;
      }
        // getters / setters
        // dietName
        public String getDietName() {
            return dietName;
        }

        public void setDietName(String dietName) {
            this.dietName = dietName;
        }

        // dietQuantity
        public String getDietQuantity() {
            return dietQuantity;
        }

        public void setDietQuantity(String dietQuantity) {
            this.dietQuantity = dietQuantity;
        }
}
