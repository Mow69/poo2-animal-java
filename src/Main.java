import animal.Animal;
import diet.Diet;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Animal girafe = new Animal();

        // set animal name
        girafe.setName("*Girafe*");

        // set species attributes
        girafe.setReproduction("*ovovivipare*");
        girafe.setCoat("*poilu*");
        girafe.setLocomotion("*quadrupède*");


        // output results
        System.out.println("Mon animal par défaut est une " + girafe.getName());
        System.out.println("Le mode de reproduction par défaut de mon animal est " + girafe.getReproduction());
        System.out.println("Le pelage de mon animal est de type " + girafe.getCoat());
        System.out.println("Le mode de locomotion de mon animal est " + girafe.getLocomotion());

        // set new diet with defaut attributes
        girafe.setDiet(new Diet());
        System.out.println("Mon animal a le régime alimentaire par défaut " + girafe.getDietName());
        System.out.println("Mon animal par défaut est un  " + girafe.getDietQuantity());

        // override diet with new attributes
        girafe.setDiet(new Diet("*Végétarien*", "*petit mangeur*"));
        System.out.println("Mon animal a le régime alimentaire " + girafe.getDietName());
        System.out.println("Mon animal par est un  " + girafe.getDietQuantity());

    }
}