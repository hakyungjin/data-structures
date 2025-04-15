package Structures;

public class Queue {
    
    int[] queue;
    int front;
    int rear;
    int max_len;

    public Queue(int max_len){
        queue= new int[max_len];
        front=-1;
        rear=-1;
        this.max_len=max_len;
    }

    public void clear(){
        front=-1;
        rear=-1;
        return;
    }

    public boolean isempty(){
        return (front==-1);

    }

    public int length(){
        if(front==-1){
            return 0;
        }
        if(front>rear){
            return front-rear+1;
        }
        return rear-front+1;

    }

    public void enqueue(int val){

        if((front+1)%max_len==rear){
            throw new IllegalStateException("Queue is full");
        }

        if(front==-1){
            front=0;
            rear=0;
            queue[front]=val;
            return;
        }
        front=(front+1)%max_len;
        queue[front]=val;        
        return;


    }

    public int dequeue(){

        if(isempty()){
            throw new IllegalStateException("Queue is empty");
        }
        int value=queue[rear];
        if(front==rear){
            front=-1;
            rear=-1;
            return value;
        }
        rear=(rear+1)%max_len;
        return value;


    }
}
