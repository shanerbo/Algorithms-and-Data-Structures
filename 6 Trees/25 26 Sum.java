public class MyClass {
    public int size(TreeNode root, int val){
        if(root==null) return 0;
        int sum = 0;
            Queue<TreeNode> q = new LinkedList();
            q.offer(root);
            while(!q.isEmpty()){
                int level = q.size();
                for(int i=0;i<level;i++){
                    temp = q.poll();
                    sum+=temp.val;
                    if(temp.left!=null)  q.offer(temp.left);  
                    if(temp.right!=null) q.offer(temp.right);
                }
            }
            return sum;
    }
}
