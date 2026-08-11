// Last updated: 8/11/2026, 12:18:13 PM
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
17    public String tree2str(TreeNode root) {
18        if(root==null){
19            return "";
20        }
21        String ans=""+root.val;
22        if(root.left!=null){
23          ans+="("+tree2str(root.left)+")";
24        }
25        if(root.right!=null){
26            if(root.left==null){
27                ans+="()";
28            }
29            ans+="("+tree2str(root.right)+")";
30        }
31        return ans;
32    }
33}