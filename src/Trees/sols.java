package Trees;

public class sols {
//    ArrayList<Integer> answer= new ArrayList<>();
//    public ArrayList<Integer> inorderTraversal(TreeNode A) {
//        if (A==null){
//            return null;
//        }
//        inorderTraversal(A.left);
//        answer.add(A.val);
//        inorderTraversal(A.right);
//
//        return answer;
//    }

//     Binary Tree From Inorder And Postorder.....\/
//     private static int Index;
//    public TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {
//        if (A==null || B==null || A.size() != B.size()){
//            return null;
//        }
//
//        Index= A.size()-1;
//
//        return treeBuild(A,B,0,Index);
//    }
//
//    private static TreeNode treeBuild(ArrayList<Integer> In, ArrayList<Integer> Post, int left, int right){
//        if (Index<0 || left>right){
//            return null;
//        }
//
//        TreeNode root= new TreeNode(Post.get(Index));
//
//        for (int i=left; i<=right;i++){
//            if (Objects.equals(Post.get(Index), In.get(i))){
//                Index--;
//                root.right=treeBuild(In,Post,i+1,right);
//                root.left=treeBuild(In,Post,left,i-1);
//                break;
//            }
//        }
//        return root;
//    }

//    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
//        ArrayList<ArrayList<Integer>> answer= new ArrayList<>();
//        if (A==null){
//            return answer;
//        }
//        Queue<TreeNode> q= new LinkedList<>();
//        q.add(A);
//
//        while (!q.isEmpty()){
//            ArrayList<Integer> temp= new ArrayList<>();
//            int size= q.size();
//            for (int i=0; i<size; i++){
//                TreeNode n= q.remove();
//                temp.add(n.val);
//                if (n.left!=null){
//                    q.add(n.left);
//                }
//                if (n.right!=null){
//                    q.add(n.right);
//                }
//            }
//           answer.add(temp);
//        }
//        return answer;
//    }

//    public TreeNode solve(ArrayList<Integer> A) {
//        Queue<TreeNode> q= new LinkedList<>();
//        TreeNode root= new TreeNode(A.get(0));
//        q.add(root);
//
//        for (int i=1; i<A.size(); i++){
//            TreeNode parent= q.remove();
//            if (A.get(i) != -1){
//                TreeNode left= new TreeNode(A.get(i));
//                parent.left=left;
//                q.add(left);
//            }
//
//            i++;
//
//            if (A.get(i) != -1){
//                TreeNode right= new TreeNode(A.get(i));
//                parent.right=right;
//                q.add(right);
//            }
//        }
//        return root;
//    }


//    public ArrayList<Integer> preorderTraversal(TreeNode A) {
//        ArrayList<Integer> answer= new ArrayList<>();
//        if (A==null){
//            return answer;
//        }
//
//        Stack<TreeNode> stacks= new Stack<>();
//        stacks.push(A);
//
//        while (stacks.empty()==false){
//            TreeNode node= stacks.peek();
//            answer.add(node.val);
//            stacks.pop();
//
//            if (node.right!=null){
//                stacks.push(node.right);
//            }
//            if (node.left!=null){
//                stacks.push(node.left);
//            }
//        }
//        return answer;
//    }

//    public ArrayList<Integer> postorderTraversal(TreeNode A) {
//        ArrayList<Integer> answer= new ArrayList<>();
//        if (A==null){
//            return answer;
//        }
//
//        Stack<TreeNode> stacks= new Stack<>();
//        stacks.push(A);
//
//        while (stacks.empty()==false){
//            TreeNode node= stacks.pop();
//            answer.add(node.val);
//
//            if (node.left!=null){
//                stacks.push(node.left);
//            }
//
//            if (node.right!=null){
//                stacks.push(node.right);
//            }
//        }
//        Collections.reverse(answer);
//        return answer;
//    }



   // Binary Tree From Inorder And Preorder.....\/
//    private static int Index;
//    public TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {
//        if (A==null || B==null || A.size() != B.size()){
//            return null;
//        }
//
//        Index= 0;
//
//
//        return treeBuild(A,B,0,A.size()-1);
//    }
//
//    private static TreeNode treeBuild(ArrayList<Integer> In, ArrayList<Integer> Post, int left, int right){
//        if (Index<0 || left>right){
//            return null;
//        }
//
//        TreeNode root= new TreeNode(Post.get(Index));
//
//        for (int i=left; i<=right;i++){
//            if (Objects.equals(Post.get(Index), In.get(i))){
//                Index--;
//                root.right=treeBuild(In,Post,i+1,right);
//                root.left=treeBuild(In,Post,left,i-1);
//                break;
//            }
//        }
//        return root;
//    }


//    public ArrayList<Integer> leftView(TreeNode A) {
//        ArrayList<Integer> answer= new ArrayList<>();
//        if (A==null){
//            return answer;
//        }
//
//        Queue<TreeNode> que= new LinkedList<>();
//        que.add(A);
//
//        while (!que.isEmpty()) {
//            int n= que.size();
//            for(int i=1; i<=n; i++){
//                TreeNode temp= que.poll();
//
//                if (i==1){
//                    answer.add(temp.val);
//                }
//                if (temp.left!=null){
//                    que.add(temp.left);
//                }
//                if (temp.right!=null){
//                    que.add(temp.right);
//                }
//            }
//        }
//        return answer;
//    }

//    public ArrayList<Integer> rightView(TreeNode A) {
//        ArrayList<Integer> answer= new ArrayList<>();
//        if (A==null){
//            return answer;
//        }
//
//        Queue<TreeNode> que= new LinkedList<>();
//        que.add(A);
//
//        while (!que.isEmpty()) {
//            int n= que.size();
//            for(int i=0; i<n; i++){
//                TreeNode temp= que.peek();
//                que.remove();
//
//                if (i==n-1){
//                    answer.add(temp.val);
//                }
//                if (temp.left!=null){
//                    que.add(temp.left);
//                }
//                if (temp.right!=null){
//                    que.add(temp.right);
//                }
//            }
//        }
//        return answer;
//    }

//    static HashMap<Integer,ArrayList<Integer>> hm;
//    public static void buildVOTMap(TreeNode A, int d){
//        if (A==null){
//            return;
//        }
//        hm.getOrDefault(d, new ArrayList<>().add(A.val))
//    }
//
//    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
//
//
//    }

//    public static TreeNode sortedArrayToBST(final int[] A) {
//        int s=0;
//        int e= A.length-1;
//
//        return sortedArray(A, s,e);
//    }
//    public static TreeNode sortedArray(final int[] A, int s, int e) {
//        if (s > e) {
//            return null;
//        }
//
//        int mid= (s+e)/2;
//        TreeNode root= new TreeNode(A[mid]);
//        root.left= sortedArray(A,s,mid-1);
//        root.right= sortedArray(A,mid+1,e);
//        return root;
//    }


//    public int isValidBST(TreeNode A) {
//        boolean value= isBST(A, Long.MIN_VALUE, Long.MAX_VALUE);
//        if (value){
//            return 1;
//        }
//        return 0;
//
//    }
//
//    public static boolean isBST(TreeNode A, long s, long e){
//        if (A==null){
//            return true;
//        }
//
//        if (A.val>=s && A.val<=e){
//            boolean left= isBST(A.left,s,A.val-1);
//            boolean right= isBST(A.right,A.val+1,e);
//
//            return left&&right;
//        }
//        return false;
//    }

//    public static int maxSize=0;
//    public int solve(TreeNode A) {
//        if (A==null){
//            return 0;
//        }
//
//        if (isBST(A,Integer.MIN_VALUE, Integer.MAX_VALUE )){
//            int size= size(A);
//            maxSize= Math.max(maxSize,size);
//        }
//        else {
//            int l= solve(A.left);
//            int r= solve(A.right);
//        }
//
//        return maxSize;
//    }
//
//    public static int size(TreeNode A){
//        if(A== null){
//            return 0;
//        }
//
//        return size(A.left) + size(A.right) +1;
//    }

//    public static boolean isBST(TreeNode A, int s, int e){
//        if (A==null){
//            return true;
//        }
//
//        if (A.val>=s && A.val<=e){
//            boolean left= isBST(A.left,s,A.val-1);
//            boolean right= isBST(A.right,A.val+1,e);
//
//            return left&&right;
//        }
//        return false;
//    }


//    static TreeNode LCAnode;
//    static boolean isBpresent, isCpresent;
//    public int lca(TreeNode A, int B, int C) {
//        checkNodePresent(A,B,C);
//        if (isBpresent && isCpresent){
//            LCAnode=getLCANode(A,B,C);
//            return LCAnode.val;
//        }
//        return -1;
//    }
//
//    public static void checkNodePresent(TreeNode A, int B, int C){
//        if (A==null){
//            return ;
//        }
//        checkNodePresent(A.left, B,C);
//        checkNodePresent(A.right, B,C);
//        if (A.val==B){
//            isBpresent=true;
//        }
//        if (A.val==C){
//            isCpresent=true;
//        }
//    }
//
//    public static TreeNode getLCANode(TreeNode A, int B, int C){
//        if (A==null){
//            return A;
//        }
//        if (A.val==B || A.val==C){
//            return A;
//        }
//        TreeNode left= getLCANode(A.left,B,C);
//        TreeNode right= getLCANode(A.right,B,C);
//        if (left != null && right!=null){
//            return A;
//        }
//        return (left!=null) ? left:right;
//    }

//    public int[] recoverTree(TreeNode A) {
//
//
//    }


}
