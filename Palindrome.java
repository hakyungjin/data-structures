package Solver;

import Structures.Stack;
import Structures.Queue;

public class Palindrome {
    Stack stack;
    Queue queue;
    int max_len;

    public Palindrome(int max_len){
        stack=new Stack(max_len);
        queue=new Queue(max_len);
        this.max_len=max_len;
}

    public void newInt(int i){
        stack.push(i);
        queue.enqueue(i);

    }

    public void clear(){
        stack.clear();
        queue.clear();

    }

    public int length(){
        return stack.length();

    }

    public boolean palindromeCheck(){
        int k=max_len/2;
        for(int i=0; i<k; i++) {
        if(stack.pop()!= queue.dequeue()) {return false;}
        }

        
        return true;
    }
}
