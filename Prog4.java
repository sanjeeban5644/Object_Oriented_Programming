public class Prog4 {
    public static void main(String[] args) {
        Stack s1 = new Stack(1);
        Stack s2 = new Stack(2);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.pop();
        s1.display();
        s2.push(50);
        s2.push(60);
        s2.push(70);
        s2.pop();
        s2.display();

    }
}


class Stack{


    Node head;
    Node tail;
    int number;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Stack(int number){
        this.number = number;
    }

    int length(){
        int size=0;
        Node temp = head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        return size;
    }

    void push(int data){
        int len = length();
        if(len>10){
            System.out.println("Stack Overflow");
            return ;
        }
        Node newnode = new Node(data);

        if(head == null){
            head = newnode;
        }else{
            newnode.next = head;
            head = newnode;
        }
        
    }

    void pop(){
        if(head==null){
            System.out.println("Stack Underflow");
        }else{
            head = head.next;
        }
    }

    void display(){
        System.out.println("Displaying Stack - "+this.number);
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data + "");
            temp=temp.next;
        }
    }
}


/*
 * OUTPUT
 * 
 * Displaying Stack - 1
20
10
Displaying Stack - 2
60
50

 */