package src.fr.paris10.designState.version1;

/**
 * Created by wilpiron on 14/11/2016.
 */
public class MachineACafe {
    private Etat state;

    //Constructeur
    public MachineACafe() {
        this.state = new EtatAlimentation();
    }


    //Méthodes
    public void give(int n) throws CoffeeMachineException{
        this.state = this.state.give(n);
    }

    public void askCoffee() throws CoffeeMachineException{
        this.state = this.state.askCoffee();
    }

    public void askTea() throws CoffeeMachineException{
        this.state = this.state.askTea();
    }
}
