class LL{
    Node head;

   class Node{
        int data;
        Node next;
    
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addList(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printList(){

        Node currNode = head;
        if(head == null){
            System.out.println("List is empty..!!");
            return;
        }

        while(currNode != null){
                System.out.print(currNode.data +" -> ");
                currNode = currNode.next;
            
        }
        System.out.println("null");
    }
    public void filter(){
        Node currNode = head;
        Node last = null;
        while(currNode != null){
            if(currNode.data > 20){
                if(currNode.next == null)
                {
                    head = null;
                    return;
                }
                last.next = currNode.next;
            }
            last = currNode;
            currNode = currNode.next;
        }

    }
}

public class filterLinkedList {
    public static void main(String[] args) {
        LL list = new LL();

        list.addList(5);
        list.addList(7);
        list.addList(21);
        list.addList(8);
        list.addList(15);
        
        list.printList();
        list.filter();
        list.printList();
    }    
}
