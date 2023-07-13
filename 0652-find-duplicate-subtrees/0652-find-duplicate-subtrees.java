class Solution {
    List<TreeNode> res;
    HashMap<String, Integer> serialCount;
    String pos(TreeNode root)
    {
	    if(root == null) return "#";
	    String serial = root.val + "," + pos(root.left) + pos(root.right);
	    int freq = serialCount.getOrDefault(serial, 0);
	    serialCount.put(serial, ++freq);
	    if (freq == 2) res.add(root);
	    return serial;
    }
    public List<TreeNode> findDuplicateSubtrees (TreeNode root){
	    res = new LinkedList<>();
	    serialCount = new HashMap<>();
	    pos(root);
	    return res;
    }   
}