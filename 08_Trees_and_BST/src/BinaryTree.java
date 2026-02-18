package src;

public class BinaryTree {
 static class Node {
  int key;
  Node left, right;

  public Node(int item) {
   key = item;
   left = right = null;
  }
 }

 Node root;

 public BinaryTree(int key) {
  root = new Node(key);
 }

 public BinaryTree() {
  root = null;
 }

 public static void main(String[] args) {
  BinaryTree tree = new BinaryTree();
  tree.root = new Node(1);
  tree.root.left = new Node(2);
  tree.root.right = new Node(3);

  System.out.println("Binary Tree created with root: " + tree.root.key);
 }
}
