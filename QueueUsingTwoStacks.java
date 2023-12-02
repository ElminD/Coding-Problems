import java.io.*;
import java.util.*;

public class QueueUsingTwoStacks {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int total = scn.nextInt();
        MyQueue<Integer> queue = new MyQueue<Integer>();
        
        for(int i = 0; i < total; i++){
            int type = scn.nextInt();
            switch(type){
                case 1:
                    int in = scn.nextInt();
                    queue.enqueue(in);
                break;
                case 2:
                    queue.dequeue();
                break;
                case 3:
                    System.out.println(queue.peek());
                break;
                default:
                    System.out.println("Error");
            }
        }
        
    }
    
    public static class MyQueue<T> {
        private Stack<T> stacknew = new Stack<T>();
        private Stack<T> stackold = new Stack<T>();
        
        public void enqueue(T value){
            stacknew.push(value);
        }
        
         public T peek(){
            shiftStacks();
            return stackold.peek();
        }
        
         public void shiftStacks(){
             if(stackold.isEmpty()){
                 while(!stacknew.isEmpty()){
                     stackold.push(stacknew.pop());
                 }
             }
            
        }
        
         public T dequeue(){
            shiftStacks();
            return stackold.pop();
        }
    }
}
