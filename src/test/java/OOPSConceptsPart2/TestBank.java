package OOPSConceptsPart2;

public class TestBank {
    public static void main(String[] args) {

        System.out.println(USBank.min_Balance);
      //  USBank.min_Balance=200
        HSBCBank hs = new HSBCBank();
        hs.debit();hs.carLoan();hs.educationLoan();hs.credit();hs.transferMoney();hs.mutualFund();


        //Dynamic Polymorphism --> Child class object can be referred by Parent interface reference variable

        USBank usBank = new HSBCBank();
        usBank.credit();usBank.debit();usBank.transferMoney();


        // Only child class reference variable can access native methods
        // Parent interface's reference variable can access only interface's overridden methods

    }
}
