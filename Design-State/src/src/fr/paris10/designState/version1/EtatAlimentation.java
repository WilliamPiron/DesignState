package src.fr.paris10.designState.version1;

/**
 * Created by wilpiron on 14/11/2016.
 */
public class EtatAlimentation implements Etat {
    private int c;

    public EtatAlimentation() {
        this.c = 0;
    }

    @Override
    public Etat give(int n) throws CoffeeMachineException{
        this.c += n;
        if ( this.c < 10){
            System.out.println(String.format("Not enough money ! You need at least %1$d more !",10-this.c));
            return this;
        }
        else {
            return new EtatCommande();
        }
    }

    @Override
    public Etat askCoffee() throws CoffeeMachineException{
        throw new CoffeeMachineException("Can't ask a free drink ! Pay, then retry !");
    }

    @Override
    public Etat askTea() throws CoffeeMachineException{
        throw new CoffeeMachineException("Can't ask a free drink ! Pay, then retry !");
    }
}
