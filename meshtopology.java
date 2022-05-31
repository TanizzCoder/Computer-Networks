import java.util.*;
public class meshtopology
{
    boolean a[][] = new boolean[10][10]; // to accept the edges from the user
    int b[][] = new int[10][10]; // the matrix which represents the graph
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

    void ismeshtopology(int n)
    {
        int i, j, c[] = new int[n + 1];
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= n; j++)
            {
                if (b[i][j] == 1)
                    c[i]++;
            }
        }
        for (i = 1; i <= n; i++)
        {
            if (c[i] == n - 1)
                continue;
            else
            {
                System.out.println("The given graph is not a Mesh Topology");
                return;
            }
        }
        System.out.println("The given graph is a Mesh Topology");

    }

    public static void main(String[] args)
    {
        System.out.println("Enter the number of nodes :");
        int n = in.nextInt();
        meshtopology o = new meshtopology();
        o.accept(1, 2);
        o.accept(1, 3);
        o.accept(1, 4);
        o.accept(2, 3);
        o.accept(2, 4);
        o.accept(3, 4);
        o.initialise(n);
        o.printMatrix(n);
        o.ismeshtopology(n);
    }
}
