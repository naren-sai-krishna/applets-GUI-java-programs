#include<stdio.h>
#include<stdlib.h>
void insert(int);
void delete();
void display();
struct node
{
 int value;
 struct node *next;
};
struct node *top=NULL,*ptr,*p,*pnew;
void main()
{
 int x,n;
  while(1)
 {
  printf("\nEnter your choice:\n1.insert\n2.delete\n3.display\n4.exit\n");
  scanf("%d",&n);
  switch(n)
  {
    case 1: printf("\nEnter the value to be inserted:");
               scanf("%d",&x);
               insert(x);
               break;
    case 2: delete();
               break;
    case 3:
		display();
break;
    case 4:exit(0);                    
  }
 }
}                      
void insert(int x)
{
  pnew=(struct node*)malloc(sizeof(struct node));
  pnew->value=x;
  pnew->next=NULL;
  printf("\n%d inserted",pnew->value);
  if(top==NULL)
 {
   top=pnew;
   ptr=pnew;
  }
  else
  {
   pnew->next=top;
   top=pnew;
  }
 }
 void delete()
 {
 struct node*q=NULL;
q=top;
top=top->next;
//q->next=NULL;
   free(q);
   }

void display(){
struct node *p;
printf("The Top Element in Link list is:\n");
p=top;
printf("%d\t",p->value);
}




