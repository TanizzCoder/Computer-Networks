//implementation of ring topology
import java.util.*;

public class ringTopology 
{
    boolean a[][] = new boolean[10][10]; // to accept the edges from the user
    int b[][] = new int[10][10]; // the matrix which represents the graph
    static Scanner in = new Scanner(System.in);

    void acceptEdge(int i, int j) // accept the edges of the graph
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

    void isringtopology(int n) // check whether the given graph is a ring topology or not
    {
        int i, j, arr[] = new int[n + 1], f = 0;
        for (i = 1; i <= n; i++) // initialising all the counter array to 0
            arr[i] = 0;

        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= n; j++)
            {
                if (b[i][j] == 1)
                {
                    arr[i]++;
                    // arr[j]++;
                }
            }

        }
        for (i = 1; i <= n; i++)
        {
            if (arr[i] == 2)
                f = 1;
            else
            {
                f = 0;
                break;
            }
        }
        if (f == 1)
        {
            System.out.println("The given graph is a Ring topology");
        }
        else
            System.out.println("The given graph is not a Ring Topology");
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the number of vertices:");
        int n = in.nextInt();
        ringTopology o = new ringTopology();
        o.acceptEdge(1, 2);
        o.acceptEdge(1, 3);
        o.acceptEdge(3, 4);
        o.acceptEdge(4, 5);
        o.acceptEdge(5, 2);
        o.initialise(n);
        o.printMatrix(n);
        o.isringtopology(n);
    }
}
