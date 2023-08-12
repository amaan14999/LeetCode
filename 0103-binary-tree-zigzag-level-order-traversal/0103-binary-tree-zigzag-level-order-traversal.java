/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root == null)
        return ans;

        q.offer(root);
        boolean flag = true;

        while(!q.isEmpty()){

                int levelNum = q.size();
                ArrayList<Integer> sublist = new ArrayList<>();

                for(int i = 0; i < levelNum; i++){

                    if(q.peek().left != null)
                    q.offer(q.peek().left);

                    if(q.peek().right != null)
                    q.offer(q.peek().right);

                    if(flag == true)
                    sublist.add(q.poll().val);
                    else
                    sublist.add(0, q.poll().val); //to add the element in the front of the list.
                }
                flag = !flag;
                ans.add(sublist);
        }
        return ans;
    }
}