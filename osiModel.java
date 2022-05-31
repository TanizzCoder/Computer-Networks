import java.util.*;
public class osiModel {

    static String sender(String n)
    {
        System.out.println("\nSender side: ");
        String s=n;
        System.out.println("\nApplication Layer");
        s="!"+s;
        System.out.println(s);
        System.out.println("\nPresentation Layer");
        s="@"+s;
        System.out.println(s);
        System.out.println("\nSession Layer");
        s="#"+s;
        System.out.println(s);
        System.out.println("\nTransport Layer");
        s="$"+s;
        System.out.println(s);
        System.out.println("\nNetwork Layer");
        s="%"+s;
        System.out.println(s);
        System.out.println("\nDatalink Layer");
        s="^"+s;
        System.out.println(s);
        System.out.println("\nPhysical layer");
        s="&"+s;
        System.out.println(s);
        return s;
    }
    static String receiver(String n)
    {
        int i=0;
        System.out.println("\nReceiver side");
        String s=n;

        System.out.println("\nPhysical layer");
        i++;
        s=s.substring(i);

        System.out.println(s);
        System.out.println("\nDatalink Layer");

        s=s.substring(i);
        System.out.println(s);
        System.out.println("\nNetwork Layer");

        s=s.substring(i);
        System.out.println(s);
        System.out.println("\nTransport Layer");

        s=s.substring(i);
        System.out.println(s);
        System.out.println("\nSession Layer");

        s=s.substring(i);
        System.out.println(s);
        System.out.println("\nPresentation Layer");

        s=s.substring(i);
        System.out.println(s);
        System.out.println("\nApplication Layer");

        s=s.substring(i);
        System.out.println(s);
        return s;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the message to be send");
        String n=in.nextLine();
        String s=sender(n);
        System.out.println("The entire sender side = "+s);
        //System.out.println("Length of the sender side ="+sender(n).length());

        if(n.equals(receiver(s))==true)
        {
            System.out.println("Message received");
        }
        else
        System.out.println("Message not received");

        in.close();
    }
}
