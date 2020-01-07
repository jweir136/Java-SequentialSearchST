public class SequentialSearchST<Key extends Comparable, Value> {
  private Node root;
  
  public SequentialSearchST() {
    this.root = null;
  }

  public void put(Key key, Value val) {
    Node temp = this.root;

    this.root = new Node(key, val, temp);
  }

  public Value get(Key key) {
    for (Node node = this.root; node != null; node = node.next)
      if (node.key.compareTo(key) == 0)
        return node.value;

    return null;
  }

  @Override
  public String toString() {
    String result = "";

    for (Node node = this.root; node != null; node = node.next)
      result += node + " ";

    return result;
  }

  private class Node {
    public Node next;
    public Key key;
    public Value value;

    public Node(Key key, Value val) {
      this.next = null;
      this.key = key;
      this.value = val;
    }

    public Node(Key key, Value val, Node next) {
      this.next = next;
      this.key = key;
      this.value = val;
    }

    @Override
    public String toString() {
      return "{ " + this.key + " : " + this.value + " }";
    }
  }
}
