


public class Node {
    int id;
    String data;
    Node leftChild;
    Node rightChild;
    
    public Node(int id, String data) {
        this.id = id;
        this.data = data;
    }
    
    public int getKey() {
        return id;
    }
    
    public void display() {
        System.out.println("[" + id + ", " + data + "]");
    }
}