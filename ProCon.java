class Shared{
boolean flag=false;
int n;

synchronized int get(){
while(!flag){
try{
wait();
}
catch(InterruptedException e){}
}
flag=false;
System.out.println("GOT:"+n);
notify();
return n;
}

synchronized void put(int n){
while(flag){
try{
wait();
}
catch(InterruptedException e){}
}
this.n=n;
flag=true;
System.out.println("PUT:"+n);
notify();
}
}

class Producer implements Runnable{
int n;
Shared s;
Producer(Shared s){
this.s=s;
Thread t=new Thread(this,"Producer");
t.start();
}
public void run(){
while(true){
n++;
s.put(n);
}
}
}

class Consumer implements Runnable{
Shared s;
Consumer(Shared s){
this.s=s;
Thread t=new Thread(this,"Consumer");
t.start();
}
public void run(){
while(true){
s.get();
}
}
}

class ProCon{
public static void main(String args[]){
Shared s=new Shared();
new Producer(s);
new Consumer(s);
}
}