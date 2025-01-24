package binaryTree;

public class Binarytree {
    static class  Node {
    int data;
    Node left;
    Node right;
        

    Node(int data){
        this.data = data;
        left = right = null;
    }
    }
    public static void main(String[] args) {
        Node newNode = new Node(32);
    }
}
