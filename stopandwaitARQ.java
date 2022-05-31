import java.util.*;
public class stopandwaitARQ {
    node head;
    int size;
    stopandwaitARQ()
    {
        size=0;
    }
    public class node{
        int data;
        node next;
        node(int data)

        {
            this.data=data;

            this.next=null;
        }

    }

    void add(int data)
    {
        node newnode=new node(data);
        if(head==null)
        {
            head=newnode;
            return;
        }
        node currentnode=head;
        while(currentnode.next!=null)
        {
            currentnode=currentnode.next;
        }
        currentnode.next=newnode;
    }
    void print()
    {
        node currentnode=head;
        while(currentnode!=null)
        {
            System.out.print(currentnode.data+"->");
            currentnode=currentnode.next;
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=0,frame;
        stopandwaitARQ o=new stopandwaitARQ();
        while(n!=2)
        {
            System.out.println("\nEnter 1 for sender to send a frame\n2 to exit ");
            n=in.nextInt();
            if(n==1)
            {
                System.out.println("Enter the frame to be send by the sender");
                frame=in.nextInt();
                o.add(frame);
                o.add(frame+1);
                System.out.println("Acknowledgement "+(frame+1));
            }



        }
        o.print();
        System.out.println("null");
        in.close();
    }
}
