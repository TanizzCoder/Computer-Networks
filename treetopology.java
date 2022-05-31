import java.util.*;

public class treetopology
{
    boolean a[][] = new boolean[10][10];// to accept the edges from the user
    int b[][] = new int[10][10];// the matrix which represents the graph
    static Scanner in = new Scanner(System.in);

    void accept(int i, int j)
    {
        a[i][j] = true;
        a[j][i] = true;
    }

    void initialise(int n)
    {
        // initialise the matrix
        int i, j;
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= n; j++)
            {
                if (a[i][j] == true)
                    b[i][j] = 1;
                else
                    b[i][j] = 0;
            }
        }
    }

    void printMatrix(int n)
    {
        // print the matrix
        System.out.println("The matrix is :");
        int i, j;
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= n; j++)
            {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }

    void istreetopology(int n, int r)// check whether the given graph is a tree topology or not.
    {
        int i, j, c[] = new int[n + 1], f = 0;
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= n; j++)
            {
                if (b[i][j] == 1)
                {
                    c[i]++;
                }
            }
            // System.out.println(" counter = " + c[i]);
            if (i != r)
                c[i]--;
        }
        for (i = 1; i <= n; i++)
        {
            // System.out.println(i + "= " + c[i]);
            if (c[i] == 2 || c[i] == 0)
                f = 1;
            else
            {
                f = 0;
                break;
            }
        }
        if (f == 1)
            System.out.println("The given graph is a Tree Topology");
        else
            System.out.println("The given graph is not a tree topology");
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the number of nodes : ");
        int n = in.nextInt();
        treetopology o = new treetopology();
        o.accept(1, 5);
        o.accept(1, 2);
        o.accept(2, 3);
        o.accept(2, 4);
        System.out.println("Enter the root node of the graph :");
        int r = in.nextInt();
        o.initialise(n);
        o.printMatrix(n);
        o.istreetopology(n, r);

    }

}
