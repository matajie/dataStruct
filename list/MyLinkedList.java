/**
 * Author:年仅18岁的天才少年程序员
 * *******java猛男丶Mata杰
 * *******我的程序才没有BUG！！！
 */
/*public class MyLinkedList {
    *//*
    链表中的一个节点
    链表:逻辑上有线性关系,物理存储不保证连续
     *//*
        public class Node{
        public int value;//保存的是有效数据
        public Node next;//下一个节点的线索(引用)

        Node(int v){
            this.value = v;
            this.next = null;
        }
    }

    //如果一个节点都没有,head == null;
    private Node head;//保存链表中的第一个节点的引用
    MyLinkedList(){
        this.head = null;
    }
    void pushFront(int item){
       Node node = new Node(item);
        node.next = this.head;
        this.head = node;
    }


    void popFront(int item){
        if(this.head == null){
            throw new Error();
        }
        this.head = this.head.next;
    }

    //找最后一个结点? Node cur = this.head;
    private Node getLast(){
        Node cur = this.head;
        while (cur.next != null){
            cur =cur.next;
        }
        return cur;
    }
 public void pushBack(int item){
        Node node  = new Node(item);
        if(this.head == null){
            this.head = node;
        }else {
       Node last = getLast();
            last.next = node;
    }

}

//尾删 那么倒数第二个节点的next.next =null;
    private Node getLastLast(){
        Node cur = this.head;
        while (cur.next.next != null){
            cur = cur.next;
        }
        return cur;
    }
public void popBack(){
       if(this.head == null){
           throw new Error();
       }
       if(this.head.next == null){
           this.head = null;
       }
       else {
      Node lastLast = getLastLast();
        lastLast.next = null;
       }
}
}*/













