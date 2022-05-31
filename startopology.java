import java.util.*;

public class startopology
{
    boolean a[][] = new boolean[10][10]; // to accept the edges from the user
    int b[][] = new int[10][10]; // the matrix which represents the graph
    static Scanner in = new Scanner(System.in);

    void accept(int i, int j)  {
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

    void isstartopology(int n)// check whether the given graph is a star topology or not
    {
        int i, j, c = 0, k = 0, a[] = new int[n + 1];
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= n; j++)
            {
                if (b[i][j] == 1)
                    c++;
            }
            a[i] = c;
            c = 0;
        }
        for (i = 1; i <= n; i++)
        {
            if (k == 0)
            {
                if (a[i] == n - 1)
                {
                    System.out.println("Hub : " + i);
                    k = i;
                }
            }
            else
            {
                if (a[i] == 1)
                    c = 1;
                else
                {
                    System.out.println("The given graph is not Star Topology");
                    break;
                }
            }

        }
        if (k != 0)
        {
            if (c == 1)
                System.out.println("The given graph is a Star Topology");
        } else
            System.out.println("The given graph is not a Star Topology");
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the number of nodes:");
        int n = in.nextInt();
        startopology o = new startopology();
        o.accept(2, 1);
        o.accept(2, 3);
        o.accept(2, 4);
        o.accept(2, 5);
        // o.accept(5, 2);
        o.initialise(n);
        o.printMatrix(n);
        o.isstartopology(n);
    }
}
