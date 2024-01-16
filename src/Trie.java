public class Trie {
    private static final int ALPHABET_SIZE = 26;

    static class TrieNode {

        TrieNode[] children = new TrieNode[ALPHABET_SIZE];

    // isEndOfWord is true if the node represents
    // end of a word
    boolean isEndOfWord;

    TrieNode() {
        isEndOfWord = false;
        for (int i = 0; i < ALPHABET_SIZE; i++) children[i] = null;
    }
}

    static void insert(TrieNode root, String key)
    {
        TrieNode curNode= root;
        for (int i=0; i<key.length(); i++){
            char curr= key.charAt(i);
            if(curNode.children[curr-'a']==null){
                TrieNode newNode= new TrieNode();
                curNode.children[curr-'a']=newNode;
            }
            curNode=curNode.children[curr-'a'];
        }
        curNode.isEndOfWord=true;
    }

    static boolean search(TrieNode root, String key)
    {
        TrieNode curNode=root;
        for (int i=0; i<key.length(); i++){
            char cur= key.charAt(i);
            if (curNode.children[cur-'a']==null){
                return false;
            }
            curNode=curNode.children[cur-'a'];
        }
        return curNode.isEndOfWord;
    }

}
