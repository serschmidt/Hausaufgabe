package l29_node.ex;

class Node {

    Node prev;
    String name;
    Node next;

    public Node(String name) {
        this.name = name;
        this.prev = null;
        this.next = null;
    }

    public void addNode(Node existNode, Node newNode, String name) {
        newNode.name = name;
        newNode.next = existNode.next;
        existNode.next = newNode;
        newNode.prev = existNode;
    }

    public void showNodeList(Node node) {
        while (!node.next.equals(null)) {

            Node prevNode = node.prev;
            Node nextNode = node.next;
            System.out.println(name);
            node = nextNode;
        }
    }

}


class Main {
    public static void main(String[] args) {
        Node N1 = new Node("Apple");
        Node N2 = new Node("Banana");
        Node N3 = new Node("Cherry");
        Node N4 = new Node("Pear");
        Node N5 = new Node("Strawberry");
        Node N6 = new Node("Strawberry");

        N1.next = N2;
        N2.next = N3; N2.prev = N1;
        N3.prev = N2; N3.next = N4;
        N4.prev = N3; N4.next = N5;
        N5.prev = N4; N5.next = N6;
        N6.prev = N5;

        N1.showNodeList(N1);

        //N1.addNode(N3, newN, "Rasperry");



    }
}

