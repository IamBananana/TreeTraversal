import java.util.LinkedList;

public interface TreeADT<E> {

    void addRoot(LinkedList<Node <E>> children, E value);

    Node<E> addNode(LinkedList<Node <E>> child, E value);

    public Node<E> getRoot();
}
