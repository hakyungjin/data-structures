package Structures;

public class Stack{
    
    int[ ] stack;
    int top;
    int max_len;

    public Stack(int max_len){
        // FILL HERE
        stack = new int[max_len];
        top = -1;
        this.max_len = max_len;
    }

    public void clear(){
        top=-1;

    }

    public boolean isempty(){
        return (top==-1)? true : false;    

    }

    public int length(){

        return top+1;
    }
   
    public void push(int var1) {
        if (top + 1 == max_len) {
            throw new IllegalStateException("Stack is full");
        }
        stack[++top] = var1;
    }
    

    public int pop(){
        if(isempty()) {
        throw new IllegalStateException("Stack is empty");
            
        }
        int value=stack[top--];
        return value;
    }
}
