package Solver;

import Structures.Stack;
import Structures.Queue;

public class Palindrome {
    Stack stack;
    Queue queue;
    int max_len;
    int length;

    public Palindrome(int max_len){
        stack=new Stack(max_len);
        queue=new Queue(max_len);
        this.max_len=max_len;
        length=0;
}

    public void newInt(int i){
        stack.push(i);
        queue.enqueue(i);
        length++;
    }

    public void clear(){
        stack.clear();
        queue.clear();
        length=0;
    }

    public int length(){
        return length;

    }

    public boolean palindromeCheck(){
        int currentLength = length();
        int k = currentLength/2;
        for(int i=0; i<k; i++) {
            if(stack.pop() != queue.dequeue()) {
                return false;
            }
        }
        return true;
    }
}
