public class doubleLinkedList {

class Node{
    private int data;
    private Node next;
    private Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

    private Node head = null;
    private Node last = null;

    public void addFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            last = head;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
    }

    public void addLast(int data){
        Node node = new Node(data);
        if(this.last == null){
            this.last = node;
            this.head = node;
        }else {
            this.last.next = node;
            node.prev = this.last;
            this.last = node;
        }
    }

    public int getLength(){
        Node cur = this.head;
        int len = 0;
        while(cur != null){
            len++;
            cur = cur.next;
        }
        return len;
    }

    public boolean addIndex(int index, int data){
        if(index < 0 || index > this.getLength()){
            System.out.println("插入位置非法！");
            return false;
        }
        if(index == 0){
            addFirst(data);
            return true;
        }
        if(index == this.getLength()) {
            addLast(data);
            return true;
        }
        Node node = new Node(data);
        Node cur = this.head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.prev.next = node;
        node.next = cur;
        node.prev = cur.prev;
        cur.prev = node;
        return true;
    }

    public boolean contains(int key){
        Node cur = this.head;
        while(cur != null){
            if(cur.data == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public boolean remove(int key) {
        if (this.head == null) {
            return false;
        }
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                if (cur == this.head) {
                    if (cur.next == null) {
                        this.head = this.last = null;
                    } else {
                        cur.next.prev = null;
                        this.head = cur.next;
                    }
                    return true;
                } else {
                    cur.prev.next = cur.next;
                    if (cur.next == null) {
                        this.last = cur.prev;
                    } else {
                        cur.next.prev = cur.prev;
                        return true;
                    }
                }
                return true;
            }
            cur = cur.next;

        }
        return false;
    }
    public void removeAllKey(int key){
        if(this.head == null){
            return ;
        }
        Node cur = this.head;
        while (cur != null){
            if(cur.data == key){
                if(cur == this.head){
                    if(cur.next == null){
                        this.head = this.last = null;
                        return ;
                    }else {
                        cur.next.prev = null;
                        this.head = cur.next;
                    }
                }else {
                    cur.prev.next = cur.next;
                    if(cur.next == null){
                        this.last = cur.prev;
                    }else {
                        cur.next.prev = cur.prev;
                    }
                }
            }
            cur = cur.next;
        }
    }

    public void clear(){
        while(this.head != null){
            Node cur = this.head.next;
            this.head.next = null;
            this.head.prev = null;
            this.head = cur;
        }
        this.last = null;
    }

    public void display(){
        if(this.head == null){
            System.out.println("链表为空！");
        }else {
            Node cur = this.head;
            while(cur != null){
                System.out.print(cur.data);
                System.out.print("->");
                cur = cur.next;
            }
            System.out.println();
        }
    }

//    public static void main(String[] args) {
//        doubleLinkedList linkedList = new doubleLinkedList();
//
//        linkedList.addFirst(1);
//        linkedList.addFirst(2);
//        linkedList.addFirst(3);
//        linkedList.addFirst(3);
//        linkedList.addFirst(4);
//        linkedList.addFirst(5);
//        linkedList.addFirst(5);
//        linkedList.addFirst(6);
//        linkedList.display();
//        linkedList.clear();
//    }
}