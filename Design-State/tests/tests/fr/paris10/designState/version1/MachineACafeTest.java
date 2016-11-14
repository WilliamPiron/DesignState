package tests.fr.paris10.designState.version1;


import src.fr.paris10.designState.version1.CoffeeMachineException;
import src.fr.paris10.designState.version1.MachineACafe;

import static org.testng.Assert.*;

/**
 * Created by wilpiron on 14/11/2016.
 */
public class MachineACafeTest {

    @org.testng.annotations.Test
    //On donne trop peu, puis suffisament pour le Coffee
    public void TestAppointCoffe(){
        MachineACafe mac = new MachineACafe();

        try{
            mac.give(5);
            try{
                mac.give(25);
                try{
                    mac.askCoffee();
                }catch (CoffeeMachineException cme){
                    fail();
                }
            }catch (CoffeeMachineException cme){
                fail();
            }
        }catch (CoffeeMachineException cme){
            fail();
        }
    }

    @org.testng.annotations.Test
    //On donne trop peu, puis suffisament pour le Tea
    public void TestAppointTea(){
        MachineACafe mac = new MachineACafe();

        try{
            mac.give(5);
            try{
                mac.give(25);
                try{
                    mac.askTea();
                }catch (CoffeeMachineException cme){
                    fail();
                }
            }catch (CoffeeMachineException cme){
                fail();
            }
        }catch (CoffeeMachineException cme){
            fail();
        }
    }

    //NOTE :
    //LES DEUX TESTS SUIVANT ECHOUENT
    //
    //CECI EST NORMAL, TEL EST LEUR BUT

    @org.testng.annotations.Test
    //On demande sans payer une des deux boissons
    //Doit échouer !
    public void TestSansPayer(){
        MachineACafe mac = new MachineACafe();

        try{
            if (Math.random()%2 == 0){
                mac.askCoffee();}
            else{
                mac.askTea();
            }
        }catch (CoffeeMachineException cme){
            fail();
        }
    }

    @org.testng.annotations.Test
    //On tente de payer lors de la commande
    //Doit échouer !
    public void TestPaiementLorsDuChoix(){
        MachineACafe mac = new MachineACafe();

        try{
            mac.give(50);
            try{
                mac.give(5);
            }catch (CoffeeMachineException cme){
                fail();
            }
        }catch (CoffeeMachineException cme){
            fail();
        }
    }

}