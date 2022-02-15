package linkedlistlab;

public class LinkedListLab {

    
    public static void main(String[] args) {
//        Node stu1 = new Node(2092817, 4.0);
//        Node stu2 = new Node(1452364, 3.8);
//        Node stu3 = new Node(5487956, 3.4);
//        stu1.next = stu2;
//        stu2.next = stu3;
//        
//        Node presentNode = stu1;
//        while (presentNode != null){
//            System.out.println(presentNode.studentNum + " ");
//            presentNode = presentNode.next;
            MyLinkedList ml = new MyLinkedList();
//            ml.AddFront(254589, 3.5);
//            ml.AddFront(6874156, 4.5);
//            ml.AddFront(354589, 4.3);
//            ml.AddFront(785471, 3.7);
               ml.addInOrder(254589, 3.5);
               ml.addInOrder(6874156, 4.5);
               ml.addInOrder(354589, 4.3);
               ml.addInOrder(785471, 3.7);
            ml.printItems();
            System.out.println("\n" + ml.search(78));
            System.out.println(ml.search(785471));
        }
    }