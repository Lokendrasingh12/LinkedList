class LL{
    Node head;
    private int size;

    LL(){
        size = 0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);

        size++;
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next =  head;
        head = newNode;
    }
    
    public void addLast(String data){
        Node newNode = new Node(data);

        size++;
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
           currNode = currNode.next; 
        }
        currNode.next = newNode;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty..!!");
            return;
        }
        size--;
        head = head.next;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
        }
        Node lastNode = head.next;
        Node secondLastNode = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }
    public void getSize(){
        System.out.println("\nSize is : "+ size);
    }

    public void printList(){

        if(head == null){
            System.out.println("List is empty...!!");
            return;
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+ " -> ");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }

}

public class basicLinkedlist {
    public static void main(String[] args) {
        LL list = new LL();

        list.addFirst("This");
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printList();
        list.getSize();
System.out.println();
         list.deleteLast();
       //list.deleteFirst();
        list.printList();
        list.getSize();

    }
}
