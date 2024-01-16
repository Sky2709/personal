package StackTestingAkash;

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next= null;

    }
}
public class Stack {
        Node head;

        Stack(){
            head=null;
        }

        void push(int d){
            Node n= new Node(d);
            n.next= head;
            head=n;
        }

        void pop(){
            if (head!=null){
                head=head.next;
            }
        }

        int top(){
            return head.data;
        }

        boolean empty(){
            return head==null;
        }

    }
