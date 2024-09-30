import java.util.LinkedList;

public class Node<E> {
    private E value;
    private LinkedList<Node<E>> children;

    public Node(LinkedList<Node<E>> children, E value) {
        this.children = children;
        this.value = value;
    }

    public LinkedList<Node<E>> getChildren() {
        return children;
    }

    public void setChildren(LinkedList<Node<E>> children) {
        this.children = children;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public E getValue() {
        return value;
    }

    public void addChild(Node<E> node) {
        children.add(node);
    }
}