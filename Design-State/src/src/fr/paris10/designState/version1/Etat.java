package src.fr.paris10.designState.version1;

/**
 * Created by wilpiron on 14/11/2016.
 */
public interface Etat{
    Etat give(int n) throws CoffeeMachineException;
    Etat askCoffee() throws CoffeeMachineException;
    Etat askTea() throws CoffeeMachineException;
}
