#include<stdio.h>
#include<stdlib.h>
struct node{
int value;
struct node *prv,*nxt;
};
struct node *head=NULL;

void insertleft(int ele){
struct node *pnew,*p;
pnew=(struct node*)malloc(sizeof(struct node));

pnew->prv=NULL;
pnew->value=ele;
pnew->nxt=NULL;

if(head==NULL){
head=pnew;
p=pnew;
}
else{
pnew->nxt=head;
pnew->prv=NULL;
head->prv=pnew;
head=pnew;
}
}

void insertright(int ele){
struct node *pnew;
struct node *p;
pnew=(struct node*)malloc(sizeof(struct node));
pnew->nxt=NULL;
pnew->prv=NULL;
pnew->value=ele;
if(head==NULL){
head=pnew;
p=pnew;
}
else{
for(p=head;p->nxt!=NULL;p=p->nxt);
pnew->nxt=p->nxt;
p->nxt=pnew;
pnew->prv=p;
}
}

int deleteleft(){
struct node *p;
p=head;
head=head->nxt;
head->prv=NULL;
return p->value;
free(p);
}

int deleteright(){
struct node *p;
for(p=head;p->nxt!=NULL;p=p->nxt);

p->prv->nxt=NULL;
return p->value;
free(p);

}

void display(){
struct node *p;
for(p=head;p!=NULL;p=p->nxt){
printf("%d\t",p->value);
}
}

void main(){
int n;int p;
while(n!=6){
printf("Enter:\n1.Insert Left\t2.Insert Right\t3.Delete Left\t4.Delete Right\t5.Display\n6.Exit\n");
scanf("%d",&n);
switch(n){
case 1:
printf("Enter the element to be added:");
scanf("%d",&p);
insertleft(p);
break;
case 2:
printf("Enter the element to be added:");
scanf("%d",&p);
insertright(p);
break;
case 3:
printf("%d deleted\n",deleteleft());
break;
case 4:
printf("%d deleted\n",deleteright());
break;
case 5:
display();
break;
case 6:
break;
}
}
}


