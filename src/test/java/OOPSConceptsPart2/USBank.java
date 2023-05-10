package OOPSConceptsPart2;

public interface USBank {

    static int min_Balance = 100;

    public void credit();
    public void debit();
    public void transferMoney();

    // PROPERTIES OF INTERFACE
    //1. Only Method declaration
    //2. we can declare the variables, which are by default "static" and "final"
    //3. Variable value cannot be changed
    //4. No static method in interface
    //5. No main method in interface
    //6. We cannot create object of interface --> Abstract in nature
}
