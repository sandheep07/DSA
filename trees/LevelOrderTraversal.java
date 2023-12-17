package trees;

import java.util.TreeMap;
import java.util.Vector;
import java.util.Map.Entry;

class Max_level {
 
    int max_level;
}
 

class BinaryTree {

    Node root;
    static int max_level = 0;
 

    public BinaryTree() {
        root = null;
    }

    void printLevelOrder() {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++)
            printCurrentLevel(root, i);
    }

    int height(Node root) {
        if (root == null)
            return 0;
        else {

            int lheight = height(root.left);
            int rheight = height(root.right);

            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }

    
    void printCurrentLevel(Node root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1) {
            printCurrentLevel(root.left, level - 1);
            printCurrentLevel(root.right, level - 1);
        }
    }

    void printBottomViewUtil(Node root, int curr, int hd,TreeMap<Integer, int[]> m) {

        // Base case
        if (root == null)
            return;

        // If node for a particular
        // horizontal distance is not
        // present, add to the map.
        if (!m.containsKey(hd)) {
            m.put(hd, new int[] { root.data, curr });
        }

        
        else {
            int[] p = m.get(hd);
            if (p[1] <= curr) {
                p[1] = curr;
                p[0] = root.data;
            }
            m.put(hd, p);
        }

        // Recur for left subtree
        printBottomViewUtil(root.left, curr + 1,hd - 1, m);

        // Recur for right subtree
        printBottomViewUtil(root.right, curr + 1,hd + 1, m);
    }

    void printBottomView(Node root) {

        // Map to store Horizontal Distance,
        // Height and Data.
        TreeMap<Integer, int[]> m = new TreeMap<>();

        printBottomViewUtil(root, 0, 0, m);

        // Prints the values stored by printBottomViewUtil()
        for (int val[] : m.values()) {
            System.out.print(val[0] + " ");
        }
    }

    void leftViewUtil(Node node, int level) {
        // Base Case
        if (node == null)
            return;

        // If this is the first node of its level
        if (max_level < level) {
            System.out.print(" " + node.data);
            max_level = level;
        }

        // Recur for left and right subtrees
        leftViewUtil(node.left, level + 1);
        leftViewUtil(node.right, level + 1);
    }

    // A wrapper over leftViewUtil()
    void leftView() {
        leftViewUtil(root, 1);
    }

    Max_level max = new Max_level();
 
    // Recursive function to print right view of a binary tree.
    void rightViewUtil(Node node, int level, Max_level max_level) {
 
        // Base Case
        if (node == null)
            return;
 
        // If this is the last Node of its level
        if (max_level.max_level < level) {
            System.out.print(node.data + " ");
            max_level.max_level = level;
        }
 
        rightViewUtil(node.right, level + 1, max_level);
        rightViewUtil(node.left, level + 1, max_level);
    }
 
 
    // A wrapper over rightViewUtil()
    void rightView(Node node) {
 
        rightViewUtil(node, 1, max);
    }



    static void getVerticalOrder(Node root, int hd,TreeMap<Integer, Vector<Integer>> m) {
		// Base case
		if (root == null)
			return;

		// get the vector list at 'hd'
		Vector<Integer> get = m.get(hd);

		// Store current node in map 'm'
		if (get == null) {
			get = new Vector<>();
			get.add(root.data);
		} else
			get.add(root.data);

		m.put(hd, get);

		// Store nodes in left subtree
		getVerticalOrder(root.left, hd - 1, m);

		// Store nodes in right subtree
		getVerticalOrder(root.right, hd + 1, m);
	}

	// The main function to print vertical order of a binary tree
	// with the given root
	static void printVerticalOrder(Node root) {
		// Create a map and store vertical order in map using
		// function getVerticalOrder()
		TreeMap<Integer, Vector<Integer>> m = new TreeMap<>();
		int hd = 0;
		getVerticalOrder(root, hd, m);

		// Traverse the map and print nodes at every horizontal
		// distance (hd)
		for (Entry<Integer, Vector<Integer>> entry : m.entrySet()) {
			System.out.println(entry.getValue());
		}
	}

    /* Driver program to test above functions */
    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(8);
        tree.root.left = new Node(5);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.left.right = new Node(5);

        System.out.println("Level order traversal of binary tree is ");
        tree.printLevelOrder();
        System.out.println();
        System.out.println("Bottom view of a tree: ");
        tree.printBottomView(tree.root);
        System.out.println();
        System.out.println("Left view of a tree: ");
        tree.leftView();
        System.out.println();
        System.out.println("Right view of a tree: ");
        tree.rightView(tree.root);
        System.out.println("Vertical order traversal: ");
        BinaryTree.printVerticalOrder(tree.root);
        
    }
}
