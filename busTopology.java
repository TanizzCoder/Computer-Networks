import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//implementation of bus topology
import java.util.*;

public class busTopology
{

    static Scanner in = new Scanner(System.in);
    static String s1[] = new String[10];

    void write() throws IOException
    {
        BufferedWriter bf = new BufferedWriter(new FileWriter("D:/VSC programs/java programming/server.txt", true));
        System.out.println("Enter the client name :");
        String s = in.next();
        bf.write(s);
        bf.newLine();
        bf.close();
    }

    String read() throws IOException
    {
        BufferedReader bf = new BufferedReader(new FileReader("D:/VSC programs/java programming/server.txt"));
        String s = "";
        while ((s = bf.readLine()) != null)
        s = bf.readLine();
        new FileOutputStream("server.txt").close();
        bf.close();
        System.out.println("The read data :" + s);
        return s;
    }

    public static void main(String[] args) throws IOException
    {
        String s1[] = new String[10];
        int i;
        busTopology o = new busTopology();
        System.out.println("Enter the number of clients :");
        int n = in.nextInt();
        System.out.println("Enter the names of the clients");
        for (i = 0; i < n; i++)
        {
            s1[i] = in.next();
        }
        int f;
        while (true)
        {
            System.out.println("Enter :-");
            for (i = 0; i < n; i++)
            {
                System.out.println(i + 1 + " for " + s1[i]);
            }
            System.out.println("0 for exit");
            f = in.nextInt();
            if (f == 0)
                break;
            o.write();
            String s2 = o.read();
            System.out.println("The s1[f] :" + s1[f]);
            for (i = 0; i < n; i++)
            {

                if (i == f)
                    continue;
                if (s2.equals(s1[i]))
                    System.out.println("The data packet is for " + s1[i] + " from " + s1[--f]);
                else
                    System.err.println("The data packet is not for " + s1[i]);
            }

        }

    }
}
