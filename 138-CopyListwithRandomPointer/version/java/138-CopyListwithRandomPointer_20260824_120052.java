// Last updated: 8/24/2026, 12:00:52 PM
1/*
2// Definition for a Node.
3class Node {
4    int val;
5    Node next;
6    Node random;
7
8    public Node(int val) {
9        this.val = val;
10        this.next = null;
11        this.random = null;
12    }
13}
14*/
15
16class Solution {
17    public Node copyRandomList(Node head) {
18        if(head==null){
19            return null;
20        }
21        HashMap<Node,Node>map=new HashMap<>();
22        Node temp=head;
23        while(temp!=null){
24            map.put(temp,new Node(temp.val));
25            temp=temp.next;
26        }
27        temp=head;
28        while(temp!=null){
29            map.get(temp).next=map.get(temp.next);
30            map.get(temp).random=map.get(temp.random);
31            temp=temp.next;
32        }
33        return map.get(head);
34    }
35}