import java.awt.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
public class BinarySearchST<Key extends Comparable<Key>,Value> {
    private Key[] keys;
    private int N;
    private Value[] vals;


    public int rank(Key, key) {
        int lo = 0, int hi = N - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            int cmp = key.compareTo(key[mid]);
            if (cmp < 0) hi = mid - 1;
            else if (cmp > 0) lo = mid + 1;
            else return mid;
        }
        return lo;
    }
    public class Node{
        Key key;
        Value val;
        Node left,right;

    }
    public Val get(Key key){
        Node x=root;
        while(x!=null){
            int cmp=key.compareTo(x.key);
            if (cmp<0) x=x.left;
            else if (cmp>0) x=x.right;
            else if (cmp>0) return x.val;
        }
    }
}