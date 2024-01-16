package Trees;

import java.util.Scanner;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int d){
        val=d;
        left=right=null;
    }
}

public class BinaryTree {
   //using recursion
    TreeNode root;

    BinaryTree(){
        Scanner sc= new Scanner(System.in);
        root= buildTree(sc);

    }
    TreeNode buildTree(Scanner sc){
        int data= sc.nextInt();
        if (data==-1){
            return null;
        }
        TreeNode n= new TreeNode(data);
        n.left= buildTree(sc);
        n.right= buildTree(sc);
        return n;
    }

    void print(){
       // preOrderPrint(root);
        //inOrderPrint(root);
        postOrderPrint(root);
    }

    void preOrderPrint(TreeNode root){
        if (root==null){
            return;
        }
        System.out.print(root.val + " ");
        preOrderPrint(root.left);
        preOrderPrint(root.right);
    }
//    void inOrderPrint(TreeNode root){
//        if (root==null){
//            return;
//        }
//        inOrderPrint(root.left);
//        System.out.print(root.val + " ");
//        inOrderPrint(root.right);
//    }
    void postOrderPrint(TreeNode root){
        if (root==null){
            return;
        }
        postOrderPrint(root.left);
        postOrderPrint(root.right);
        System.out.print(root.val + " ");
    }

    int height(){
        return heightHelper(root);
    }

    int heightHelper(TreeNode root){
        if (root==null){
            return 0;
        }

        return Math.max(heightHelper(root.left), heightHelper(root.right))+1;
    }
}
