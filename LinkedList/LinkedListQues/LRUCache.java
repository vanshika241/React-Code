class LRUCache {
    class Node{
        int key;
        int val;
        Node next;
        Node prev;

        Node(int k, int v){
            this.key = k;
            this.val = v;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1);
    HashMap<Integer,Node> mp;
    int limit;


    
    public LRUCache(int capacity) {
        limit = capacity;
        mp = new HashMap<>();
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!mp.containsKey(key)){
            return -1;
        }
        Node curr = mp.get(key);
        delNode(curr);
        addNode(curr);
        return curr.val;
    }

    public void delNode(Node oldNode){
        Node oldprev = oldNode.prev;
        Node oldNext = oldNode.next;
        oldprev.next = oldNext;
        oldNext.prev = oldprev;

    }

    public void addNode(Node newNode){
       Node oldNext = head.next;
        head.next = newNode;
        newNode.next = oldNext;
        newNode.prev = head;
        oldNext.prev = newNode;
    }
    
    public void put(int key, int value) {
        if(mp.containsKey(key)){
           Node oldNode = mp.get(key);
           delNode(oldNode);
           mp.remove(key);
        }
        if(mp.size() == limit){
            Node oldNode = tail.prev;
            delNode(oldNode);
            mp.remove(oldNode.key);
        }

        Node newNode = new Node(key,value);
        addNode(newNode);
        mp.put(key,newNode);

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
