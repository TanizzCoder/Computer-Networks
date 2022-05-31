#include<stdio.h>
#include<string.h>
#include<stdlib.h>
struct node
{
 	char data[100];
struct node *next;
};
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
third->next=null;
struct node *p=first;
for(int i=1;i<=3;i++)
{
	printf(“\nEnter the string in sender side: “);
	gets(s.send_msg);
int j=0;
while(s.send_msg[j]!=’\0’)
{
	p->data[j]=s.send.msg[j];
j++;
}
printf(“Sender: %s”);
printf(“\nReceiver: %s”,strcpy(r.receive_msg,s.send_msg));
p=p->next;
}
return 0;
}
