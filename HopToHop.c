#include<stdio.h>
#include<string.h>
#i-nclude<stdlib.h>
struct node
{
    char data[100];
    struct node *next;
    struct node *prev;
}
struct sender
{
    char send_msg[100];
};
struct receiver
{
   char receive_msg[100];
};
int main()
{
    struct sender s;
    struct receiver r;
    struct node *first=(struct node *)malloc(sizeof(struct node));
    struct node *second=(struct node *)malloc(sizeof(struct node));
    struct node *third =(struct node *)malloc(sizeof(struct node));
    first->next=second;
    second->next=third;
    third->next=NULL;
    first->prev=NULL;
    second->prev=first;
    third->prev=second;
    printf(“\nEnter a string in sender side: “);
   gets(s.send_msg);
   int j=0;
   while(s.send_msg[i]1=’\0’)
   {
        first->data[i]=s.send_msg[i];
        j++;
    }
struct node *p=first,*q;
q=p->next;
while(p->next!=NULL)
{
    j=0;
    while(p->data[j]!=’0’)
    {
        q->data[j]=p->data[j];
         j++;
    }
    p=p->next;
    q=q->next;
  }
}
j=0;
while(p->data[j]1=’\0’)
{
    r.receive_msg[i]=p->data[j];
    j++;
}
r.receive_msg[j]=’\0’;
printf(“\nReceiver: %s”,r.receive_msg);
return 0;
    }
