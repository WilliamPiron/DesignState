package src.fr.paris10.designState.version1;

/**
 * Created by wilpiron on 14/11/2016.
 */
public class EtatCommande implements Etat {

    public EtatCommande() {    }

    @Override
    public Etat give(int n) throws CoffeeMachineException{
        throw new CoffeeMachineException("Can't pay while choosing !");
    }

    @Override
    public Etat askCoffee() throws CoffeeMachineException{
        System.out.println("Here's your coffee, we'll be keeping the change !");
        return new EtatAlimentation();
    }

    @Override
    public Etat askTea() throws CoffeeMachineException{
        System.out.println("Here's your tea, we'll be keeping the change !");
        return new EtatAlimentation();
    }
}
