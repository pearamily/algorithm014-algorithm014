package Week_02;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;

public class MaxDepth {

/*
method 1
 */
    public int maxDepth1(TreeNode root) {
        if (root == null) return 0;
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        int res = 0;
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            while(size-- > 0){
                TreeNode node =  queue.poll();
                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }

            }
            res++;
        }
        return res;

    }
    /*
    method 2
     */

    public int maxDepth2(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));

    }
}
