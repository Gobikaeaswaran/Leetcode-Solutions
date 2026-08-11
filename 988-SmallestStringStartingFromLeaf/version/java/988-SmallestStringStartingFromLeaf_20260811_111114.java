// Last updated: 8/11/2026, 11:11:14 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    String ans=null;
18    public String smallestFromLeaf(TreeNode root) {
19        find(root,"");
20        return ans;
21    }
22    public void find(TreeNode root,String s){
23        if(root==null){
24            return;
25        }
26        char ch=(char)('a'+root.val);
27        s=ch+s;
28        if(root.left==null&&root.right==null){
29            if(ans==null||s.compareTo(ans)<0){
30                ans=s;
31            }
32            return;
33        }
34        find(root.left,s);
35        find(root.right,s);
36    }
37}