class LL{
    Node head;
    private int idx;
    
    LL(){
        idx = 0;
    }

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void print(){
        Node currNode = head;

        while(currNode != null){
            System.out.print(currNode.data +" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public int findIndex(int x){

        Node currNode = head;
        while(currNode.data != x){
            currNode = currNode.next;
            idx++;
        }
        return idx;
    }
}


public class findIndexInLinkedList {
    public static void main(String[] args) {
        LL list = new LL();

        list.add(3);
        list.add(2);
        list.add(8);
        list.add(3);
        list.add(7);
        list.add(5);
        list.add(1);

        list.print();

        int temp = list.findIndex(2);
        System.out.println("Index value is : "+ temp);
    }    
}
