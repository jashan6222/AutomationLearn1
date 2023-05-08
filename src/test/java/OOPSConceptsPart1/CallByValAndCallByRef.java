package OOPSConceptsPart1;

public class CallByValAndCallByRef {

    int p,q;

    public static void main(String[] args) {
        CallByValAndCallByRef obj = new CallByValAndCallByRef();
        int x =10;
        int y = 20;
        obj.testSum(x,y);
        obj.p=50;
        obj.q=60;
        obj.swapFunction(obj);

        System.out.println(obj.p);
        System.out.println(obj.q);
    }
    // Call by Value or Pass by Value --> We're calling this method by Value
    public int testSum(int a, int b)
    {
        int c = a+b;
        return c;
    }

    // Call by Reference --> We're passing the value of object reference
    public void swapFunction(CallByValAndCallByRef t)
    {
            int temp;

            temp=t.p;
            t.p=t.q;
            t.q=temp;
    }


}
