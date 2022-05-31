import java.util.*;
public class go_back_n_arq {
    node head;
    int size;
    go_back_n_arq()
    {
        size=0;
    }
    public class node{
        node next;
        String data;
        node(String data)
        {
            this.next=null;
            this.data=data;
            size++;
        }

    }
    void add(String data)// adding the data to the linked list
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
        System.out.println("null");
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        go_back_n_arq o=new go_back_n_arq();
        System.out.println("Enter the window size :");
        int windowsize=in.nextInt();
        System.out.println("Enter the total no. of frames to be send by the sender");
        int totalframes=in.nextInt();
        int c=1;
        String s[]=new String[totalframes+1];
        System.out.println("Enter the data for the first "+windowsize+" frames");
        for(int i=1;i<=windowsize;i++)
        {
             s[i]=in.next();
            o.add(s[i]);
        }
        for(int i=windowsize+1;i<=totalframes;i++)
        {
            System.out.println("Acknowledgement sent by the receiver : "+s[c]);
            o.add("Acknowledgement "+s[c]);
            c++;
            System.out.println("Enter the data for the "+i+"th frame");
            s[i]=in.next();
            o.add(s[i]);
        }

        o.print();
        in.close();
    }

}
