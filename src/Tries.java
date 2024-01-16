//class Node{      //
//    char data;
//    boolean isTerminal;
//    HashMap<Character,Node> hm;
//
//    Node(char ch){
//        data=ch;
//        hm=new HashMap<>();
//        isTerminal=false;
//    }
//
//}
////Trie logic
//class Trie{
//    static Node root;
//
//    Trie(){
//        root= new Node('\0'); //character with 0 ascii values
//    }
//    public static void insert(String word){
//        Node tmp=root;
//        //create node if it doesn't exist
//        for (char s:word.toCharArray()) {
//            if (!tmp.hm.containsKey(s)){
//                Node n=new Node(s);
//                tmp.hm.put(s,n);
//            }
//            tmp=tmp.hm.get(s);
//        }
//        tmp.isTerminal=true;
//    }
//
//    public static boolean search(String qword){
//        Node temp= root;
//        for (char s: qword.toCharArray()){
//            if (temp.hm.containsKey(s)){
//                temp=temp.hm.get(s);
//            }
//            else{
//                return false;
//            }
//        }
//        return temp.isTerminal;
//    }
//}


//Given an array of integers A, find and return the maximum result of A[i] XOR A[j],
// where i, j are the indexes of the array.
//class TrieNode{
//    TrieNode zero;
//    TrieNode one;
//}
//
//public class Tries {
//    TrieNode root= new TrieNode();
//    public int solve(int[] A) {
//        int max=0;
//        insert(A[0]);
//        for(int i=1;i<A.length;i++){
//            max=Math.max(max,max_XOR(A[i]));
//
//            insert(A[i]);
//        }
//        return max;
//    }
//
//    public void insert(int n){
//        TrieNode curr= root;
//        for(int i=31;i>=0;i--){
//            int b= (n>>i)&1;
//            if(b==0){
//                if(curr.zero==null){
//                    curr.zero=new TrieNode();
//                }
//                curr=curr.zero;
//            }else{
//                if(curr.one==null){
//                    curr.one=new TrieNode();
//                }
//                curr=curr.one;
//            }
//        }
//    }
//
//    public int max_XOR(int n){
//        TrieNode curr=root;
//        int cur_max=0;
//
//        for(int i=31;i>=0;i--){
//            int b= (n>>i)&1;
//
//            if(b==0){
//                if(curr.one!=null){
//                    cur_max=cur_max+(1<<i);
//                    curr=curr.one;
//                }else{
//                    curr=curr.zero;
//                }
//            }else{
//                if(curr.zero!=null){
//                    cur_max=cur_max+(1<<i);
//                    curr=curr.zero;
//                }else{
//                    curr=curr.one;
//                }
//            }
//        }
//
//        return cur_max;
//    }
//}
//}

//Given a phone directory in the form of string array A containing N numeric strings.
//
//        If any phone number is prefix of another phone number then phone directory is invalid else it is valid.
//
//        You need to check whether the given phone directory is valid or not if it is valid then return 1 else return 0.
public class Tries {

//    public int solve(String[] A) {
//
//
//    }

}

