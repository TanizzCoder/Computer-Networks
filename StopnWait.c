#include<stdio.h>
#include<stdlib.h>
#include<string.h>
struct node
{
	char data1[100];
	char data2[100];
	struct node *next;
	struct node *prev;
};
struct sender
{
	char send_msg[100];
};
struct receiver
{
	char receive_msg[100];
}
int main()
{
	struct sender s;
	struct receiver r;
struct node *first=(struct node *)malloc(sizeof(struct node));
struct node *second=(struct node *)malloc(sizeof(struct node));
struct node *third =(struct node *)malloc(sizeof(struct node));
	first->next=second;
	first->prev=null;
second->next=third;
second->prev=first;
third->next=NULL;
third->prev=second;
	struct node *p=first.
	for(int i=0;i<=3;i++)
{
	printf(“\nEnter a string in sender side: “);
	gets(s.send_msg);
int i=0;
while(s.send_msg[j]!=’\0’)
{
		p->data1[j]=s.send_msg[j];
		j++;
	}
printf(“Sender: %s”,p->data1);
printf(“\nReceiver: %s\n”,strcpy(r.receive_msg,s.send_msg));
printf(“\nEnter feedback to the sender: “);
gets(r.treceiver_msg);
j=0;
while(r.receiver_msg[j]!=’\0’)
{
	p->data2[j]=r.receive[j];
	j++
}
printf(“\nReceiver: %s”,p->dat2);
printf(“\nSender: %s,”strcpy(s.send_msg,p->data2));
p=p->next;
}
return 0;
}
