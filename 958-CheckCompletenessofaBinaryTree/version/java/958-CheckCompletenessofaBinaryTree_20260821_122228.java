// Last updated: 8/21/2026, 12:22:28 PM
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
17    public boolean isCompleteTree(TreeNode root) {
18        Queue<TreeNode> q = new LinkedList<>();
19        q.add(root);
20        boolean nullFound=false;
21        while(!q.isEmpty()){
22            TreeNode node=q.remove();
23            if(node==null){
24                nullFound=true;
25            }
26            else{
27                if(nullFound){
28                    return false;
29                }
30                q.add(node.left);
31                q.add(node.right);
32            }
33        }
34        return true;
35    }
36}