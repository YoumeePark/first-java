package collection.link;

public class Node {
    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

    /*
    //IDE 생성 toString()
    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }*/

    //[A->B->C]
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); //루프에서 문자를 더할 때
        Node x = this;
        sb.append("[");
        while (x != null) {
            sb.append(x.item);
            if (x.next != null) {
                sb.append("->");
            }
            x = x.next;
        }
        sb.append("]");
        return sb.toString();
        /*String string = sb.toString();
        return string;*/
    }
}