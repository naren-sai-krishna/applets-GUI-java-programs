#include<stdio.h>
#include<stdlib.h>
void addnode();
void display();
struct node{
int value;
struct node *nxt;
};
struct node *head=NULL;
void main()
{
int k,ele;
printf("Enter 1.To Add node\n2.To display\n3.To Exit");
while(k!=3){
scanf("%d",&k);
switch(k){
case 1:
printf("Enter the number to be added");
scanf("%d",&ele);
addnode(ele);
break;
case 2:
display();
break;

default:
printf("Invalid Choice");
break;
}
}
}
void addnode(int x){
struct node *pnew;
struct node *p;
struct node *q;
struct node *t;int k=0;
pnew=(struct node*)malloc(sizeof(struct node));
pnew->value=x;
pnew->nxt=NULL;
if(head==NULL){
head=pnew;
p=pnew;
}
else if(pnew->value<head->value){
pnew->nxt=head;
head=pnew;}
else{
for(p=head;p->nxt!=NULL;q=p,p=p->nxt){
if(pnew->value<p->value){
pnew->nxt=q->nxt;
q->nxt=pnew;

k=1;
break;
}
}
if(k==0){
pnew->nxt=p->nxt;
p->nxt=pnew;
}
}
}

void display(){
struct node *z;
printf("The Elements in Link list are:\n");
for(z=head;z!=NULL;z=z->nxt)
printf("%d\t",z->value);
}
