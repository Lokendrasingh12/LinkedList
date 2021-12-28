class LL{
    Node head;

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

        if(head == null){
            head = newNode;
            //System.out.println(data +" is added in the LinkedList..!!");
            return;
        }
        newNode.next = head;
        head = newNode;
        //System.out.println(data+" is added in the LinkedList..!!");
        return;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
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

    public void printList(){
        Node currNode = head;

        while(currNode != null){
            System.out.print(currNode.data+" ");
            currNode = currNode.next;
        }
        //System.out.println("null");
    }
}

public class addFirstLinkedList {
    public static void main(String[] args) {
        
        LL list = new LL();
        list.addLast("Myself");
        list.addFirst("Love");
        list.addFirst("I");

        list.printList();
    }    
}
