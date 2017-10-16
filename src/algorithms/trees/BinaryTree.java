package algorithms.trees;

public class BinaryTree {
    private class Node {
        public Node left;
        public Node right;
        public Node parent;
        public int value;

        public Node(int key) {
            this.value  = key;
            this.left   = null;
            this.right  = null;
            this.parent = null;
        }
    }

    private Node _root = null;

    public Node getRoot() {
        return _root;
    }

    public void setRoot(Node root) {
        this._root = root;
    }

    public void printTree(Node node) {
        if (node != null) {
            printTree(node.left);
            System.out.print(node.value + " ");
            printTree(node.right);
        }
    }

    public Node find(Node root, int key) {
        if (root == null || root.value == key) {
            return root;
        }

        if (key < root.value) {
            return find(root.left, key);
        } else {
            return find(root.right, key);
        }
    }

    public int findKey(int key) {
        Node found = this.find(this._root, key);

        return found != null ? found.value : -1;
    }

    public Node findMinimum(Node root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    public Node findMaximum(Node root) {
        while (root.right != null) {
            root = root.right;
        }

        return root;
    }

    public Node findNext(Node root) {
        if (root.right != null) {
            return findMinimum(root.right);
        }

        Node parent = root.parent;
        while (parent != null && root == parent.right) {
            root = parent;
            parent = parent.parent;
        }
        return parent;
    }

    public void insertValue(int value) {
        Node node   = new Node(value);
        Node parent = null;
        Node root   = this._root;

        while (root != null) {
            parent = root;
            if (node.value < root.value) {
                root = root.left;
            } else {
                root = root.right;
            }
        }

        node.parent = parent;
        if (parent == null) {
            this._root = node;
        } else {
            if (node.value < parent.value) {
                parent.left = node;
            } else {
                parent.right = node;
            }
        }
    }

    public void deleteNode(Node node) {
        Node x, y;

        if (node.left == null || node.right == null) {
            y = node;
        } else {
            y = this.findNext(node);
        }

        if (y.left != null) {
            x = y.left;
        } else {
            x = y.right;
        }

        if (x != null) {
            x.parent = y.parent;
        }

        if (y.parent == null) {
            this._root = x;
        } else {
            if (y == y.parent.left) {
                y.parent.left = x;
            } else {
                y.parent.right = x;
            }
        }

        if (y != node) {
            node.value = y.value;
        }
    }
}
