import java.util.LinkedList;

public class Tree<E> implements TreeADT<E>{
    private Node<E> root = null;

    @Override
    public void addRoot(LinkedList<Node<E>> children, E value) {
        if (root == null) {
            root = addNode(new LinkedList<>(), value);
        } else {
            throw new IllegalStateException("Root already exists");
        }
    }

    @Override
    public Node<E> addNode(LinkedList<Node<E>> children, E value) {
        if (value == null) {
            throw new NullPointerException("Value is null");
        }
        return new Node<>(children, value);
    }

    @Override
    public Node<E> getRoot() {
        return root;
    }

    public void setRoot(Node<E> root) {
        this.root = root;
    }
}
