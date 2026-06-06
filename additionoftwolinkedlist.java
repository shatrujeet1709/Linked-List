class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public class addingLinkedList {

    public void addL1(Node head1, Node head2) {
    
    Node pre1 = null;
    Node current1 = head1;

    while(current1!=null){
        Node nextNode = current1.next;
        current1.next = pre1;
        pre1 = current1;
        current1 = nextNode;
    }
    head1 = pre1;


    Node pre2 = null;
    Node current2 = head2;
    while(current2!=null){
        Node nextNode = current2.next;
        current2.next=pre2;
        pre2 = current2;
        current2 = nextNode;

    }

head2= pre2;

Node dummyHead = new Node(0);
Node current = dummyHead;
int carry = 0;


while((head1!=null) || (head2!=null) || carry!=0){
    int val1 = (head1!=null) ? head1.data : 0;
    int val2 = (head2!=null) ? head2.data : 0;
    int sum = val1 + val2 +carry ;
    carry = sum / 10;
    int d = sum%10;

    current.next = new Node(d);
    current = current.next;

    if(head1!=null) {head1 = head1.next;}
    if(head2!=null) {head2 = head2.next;}

Node prev3 = null;
Node current3 = current;
while(current3!=null){
    Node next3 = current3.next;
    current3.next = prev3;
    prev3 = current3;
    current3 = next3;

}

current = prev3;

Node temp = current;
while(temp!=null){
    System.out.print(temp.data + " --> ");
    temp = temp.next;
}



        
    public static void main(String[] args) {
        class LinkedList{
    LinkedList ll = new LinkedList();
    Node a = new Node(1);
    Node b = new Node(2); 
    Node c = new Node(5);   
    Node d = new Node(6);   

    Node head = a;
    head.next = b;
    b.next = c;
    c.next = d;

    Node x = new Node(5);
    Node head2 = x;

    addL1(head, head2);

}

    
    }
}