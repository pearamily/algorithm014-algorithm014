package Week_02;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;


/*
二叉树的前序遍历
 */
public class preorderTraversal {

    ArrayList<Integer> list = new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {

        if(root ==null){
            return list;
        }
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);

        return list;



    }
}
