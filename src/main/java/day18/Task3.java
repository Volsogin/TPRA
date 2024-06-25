package day18;

public class Task3 {
    public static void main(String[] args) {

        Node root = new Node(20);


        insert(14, root);
        insert(23, root);
        insert(11, root);
        insert(22, root);
        insert(27, root);
        insert(24, root);
        insert(150, root);
        insert(16, root);
        insert(15, root);
        insert(18, root);
        insert(5, root);
        insert(8, root);







        dfs(root);


    }
    public static void insert(int value, Node node) {
        if (value < node.value) {
            if (node.left != null) {
                insert(value, node.left);
            } else {
                node.left = new Node(value);
            }
        } else {
            if (node.right != null) {
                insert(value, node.right);
            } else {
                node.right = new Node(value);
            }
        }
    }
    public static void dfs(Node node) {
        if (node != null) {
            dfs(node.left);
            System.out.print(node.value + " ");
            dfs(node.right);
        }
    }


}



