

public class Tree {
    Node root;


    
    //Todo: Implement Searh for a Node given the key
    public Node find(int key) {   
        Node current = root;
        
        while(current.id != key){
            if(key < current.id){
                current = current.leftChild;
            }
            else{
                current = current.rightChild;
            }
            if(current == null){
                return null; //returns false if not in tree
            }
        }
        return current;
       
    }

    public void insert(int id, String data) {

        Node newNode = new Node(id, data);
        insert1(newNode);


    }

    //Todo: Implement the Node insertion
    public void insert1(Node newNode) {
        if(root == null){
            root = newNode;
        }
        else{
            Node current = root;
            Node parent;
            while(true){
                parent = current;
                if(newNode.id < current.id){
                    current = current.leftChild;
                    if(current == null){
                        parent.leftChild = newNode;
                        return;
                    }
                }
                else{
                    current = current.rightChild;
                    if(current == null){
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
       
    }

    //Todo: Implement - delete a Node given a key
    public boolean delete(int key) {
        
        return false;
    }
      




    private String traversePreOrder(Node root) {
        if (root == null)
            return "";
        
        StringBuilder sb = new StringBuilder();
        sb.append(root.id);
        
        String pointerRight = "---";
        String pointerLeft = "|--";
        
        traverseNodes(sb, "", pointerLeft, root.leftChild, root.rightChild != null);
        traverseNodes(sb, "", pointerRight, root.rightChild, false);
        
        return sb.toString();
    }
    
    private void traverseNodes(StringBuilder sb, String padding, String pointer, 
            Node node, boolean hasRightSibling) {
    
        if (node == null)
            return;
        
        sb.append("\n");
        sb.append(padding);
        sb.append(pointer);
        sb.append(node.id);
        
        StringBuilder pb = new StringBuilder(padding);
        if (hasRightSibling) 
            pb.append("|  ");
        else
            pb.append("   ");
        
        String p = pb.toString();
        String pntr = "|--";
        traverseNodes(sb, p, pntr, node.leftChild, node.rightChild != null);
        traverseNodes(sb, p, pntr, node.rightChild, false);
    }
    
    public Node getMinimum() {
       if (root == null)
            return null;
        
        Node current = root;
        while(current.leftChild != null)
            current = current.leftChild;
        
        return current;
    }
    
    public Node getMaximum() {
        if (root == null)
            return null;
        
        Node current = root;
        while(current.rightChild != null)
            current = current.rightChild;
        
        return current;
    }
    
    public void print() {
        String s = traversePreOrder(root);
        System.out.println(s);
    }
}



 
