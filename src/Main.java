import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Tree<Character> tree = new Tree<>();
        tree.addRoot(new LinkedList<>(), 'a');
        Node<Character> rootNode = tree.getRoot();

        Node<Character> nK = tree.addNode(new LinkedList<>(), 'k');
        Node<Character> nJ = tree.addNode(new LinkedList<>(), 'j');
        Node<Character> nI = tree.addNode(new LinkedList<>(), 'i');
        Node<Character> nH = tree.addNode(new LinkedList<>(), 'h');
        Node<Character> nG = tree.addNode(new LinkedList<>(), 'g');
        Node<Character> nF = tree.addNode(new LinkedList<>(), 'f');
        Node<Character> nE = tree.addNode(new LinkedList<>(), 'e');
        Node<Character> nD = tree.addNode(new LinkedList<>(), 'd');
        Node<Character> nC = tree.addNode(new LinkedList<>(), 'c');
        Node<Character> nB = tree.addNode(new LinkedList<>(), 'b');

        nB.addChild(nD);
        nB.addChild(nE);

        nC.addChild(nF);

        nD.addChild(nG);
        nD.addChild(nH);

        nE.addChild(nI);
        nE.addChild(nJ);

        nG.addChild(nK);

        rootNode.addChild(nB);
        rootNode.addChild(nC);
        System.out.println("PreOrder: ");
        Traversal.preOrder(rootNode);
        System.out.println("PostOrder: ");
        Traversal.postOrder(rootNode);
        System.out.println("LevelOrder: ");
        Traversal.levelOrder(rootNode);
        System.out.println("GetHeight: \n" + Traversal.getHeight(rootNode));
    }
}