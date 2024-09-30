import java.util.LinkedList;

public class Traversal {
    public static <E> void postOrder(Node<E> node) {
        if (node == null) return;
        for (Node<E> child : node.getChildren()) {
            postOrder(child);
        }
        System.out.println(node.getValue());
    }

    public static <E> void preOrder(Node<E> node) {
        if (node == null) return;
        System.out.println(node.getValue());
        for (Node<E> child : node.getChildren()) {
            preOrder(child);
        }
    }

    public static <E> void levelOrder(Node<E> node) {
        if (node == null) return;
        LinkedList<Node<E>> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node<E> head = queue.removeFirst();
            System.out.println(head.getValue());
            for (Node<E> child : head.getChildren()) {
                queue.add(child);
            }
        }
    }

    //    public static <E> int getHeight(Node<E> node) {
//        int height = 0;
//        if (node != null) {
//            int maxHeight = 0;
//            for (Node<E> child : node.getChildren()) {
//                int childHeight = getHeight(child);
//                if (childHeight > maxHeight) {
//                    maxHeight = childHeight;
//                }
//                height = 1 + maxHeight;
//            }
//        }
//        return height;
//    }
    public static <E> int getHeight(Node<E> node) {
        if (node == null) {
            return 0;
        }

        int maxHeight = 0;

        for (Node<E> child : node.getChildren()) {
            int childHeight = getHeight(child);

            if (childHeight > maxHeight) {
                maxHeight = childHeight;
            }
        }

        return 1 + maxHeight;
    }

}