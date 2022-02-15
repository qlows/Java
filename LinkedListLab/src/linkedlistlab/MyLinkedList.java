package linkedlistlab;


public class MyLinkedList {
    private Node head;
    
    public MyLinkedList(){
        head = null;
    }
    
    public void AddFront(int studNum, double gpa){
        Node newNode = new Node (studNum, gpa);
        newNode.next = head;
        head = newNode;
    }
    
    public void addLast(int studNum, double gpa){
        Node newNode = new Node (studNum, gpa);
        if(head == null){
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }
    
    public void printItems(){
        Node pres = head;
        while(pres != null){
            System.out.print(pres.studentNum + " ");
            pres = pres.next;
        }
    }
     public boolean search(int id){
         Node curr = head;
         while(curr != null && curr.studentNum != id){
             curr = curr.next;
         }
         if(curr != null){
             return true;
         }
         return false;
     }
      
     public void addInOrder(int studNum, double gpa) {
        Node newNode = new Node (studNum, gpa);
        if(head == null){       // Case 1
            head = newNode;
            return;
        }
        
        if(studNum < head.studentNum){      // Case 2
            newNode.next = head;
            head = newNode;
            return;
        }
        Node prev, curr;
        prev = curr = head;
        while(curr != null && curr.studentNum < studNum){
            prev = curr;
            curr = curr.next;
        }
        newNode.next = prev.next;
        prev.next = newNode;
    }
}

