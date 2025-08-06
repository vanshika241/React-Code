public class Implementation{

    public static class Node {
      int val;
      int startInterval;
      int endInterval;
      Node left;
      Node right;

      Node(int start, int end){
        this.startInterval = start;
        this.endInterval = end;
      }
        
    }

    public static Node root;
    public Implementation(int arr[]){
        //create a tree using this array  - O(n)
        root = constructTree(arr,0,arr.length-1);
    }

    public  static Node constructTree(int arr[], int start, int end){
     
        if (start == end) {
            Node leaf =  new Node(start, end);
            leaf.val = arr[start];
            return leaf;
        }

        //create new node with index you are at
        Node node = new Node(start, end);
        int mid = start+(end-start)/2;
        node.left = constructTree(arr, start, mid);
        node.right = constructTree(arr, mid+1, end);
        node.val = node.left.val + node.right.val;
        return node;
    }

    public static int querySum(int qsi , int qei){
        return query(root, qsi, qei);
    }

    public static int query(Node node , int qsi , int qei ){
        if (node.startInterval >=qsi && node.endInterval <=qei) {
            return node.val;
        }
        else if (node.startInterval>qei || node.endInterval<qsi) {
            //complete outside 
            return 0;
        }
        else{
            //overlapping - inside - call left and right
            return query(node.left, qsi, qei)+query(node.right, qsi, qei);
        }

    }

    //update 
    public static int update(int idx , int value){
        return update(idx,value,root);
    }
    public static int update(int idx , int value,Node node){
        if (idx >= node.startInterval && idx <= node.endInterval) {
            if (idx == node.startInterval && idx == node.endInterval) {
                node.val = value;
                return node.val;
            }
            else{
                return node.val = update(idx, value, node.left)+update(idx, value, node.right);
            }
        }
        return node.val;

    }

    public static void main(String[] args) {
        int arr[] = {3,8,6,7,-2,-8,4,9};
        Implementation tree = new Implementation(arr);
        System.out.println(querySum(2, 6));
        System.out.println(update(6, 14));
    }
}
