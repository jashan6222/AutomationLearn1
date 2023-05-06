package JavaLearning;

public class TwoDArray {
    public static void main(String[] args) {

        int[][] a =new int[10][15];
        //System.out.println(a.length);
        //System.out.println(a[0].length);
        int k=0;

    for (int i=0;i<a.length;i++)
    {
        for(int j=0;j<a[0].length;j++)
        {
            a[i][j]=k;
            k++;
        }
    }

        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[0].length;j++)
            {
                System.out.println(a[i][j]);
            }

        }

        for (int row =0;row<a.length;row++)
        {
            for (int col=0;col<a[0].length;col++)
            {
                System.out.print(a[row][col]+"  ");
            }
            System.out.println(
            );
        }


    }
}
