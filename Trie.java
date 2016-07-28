public class Trie
{
    private int SIZE=26;
    private TrieNode root;//�ֵ����ĸ�
 
    Trie() //��ʼ���ֵ���
    {
        root=new TrieNode();
    }
 
    private class TrieNode //�ֵ����ڵ�
    {
        private int num;//�ж��ٵ���ͨ������ڵ�,���ɸ����ýڵ���ɵ��ַ���ģʽ���ֵĴ���
        private TrieNode[]  son;//���еĶ��ӽڵ�
        private boolean isEnd;//�ǲ������һ���ڵ�
        private char val;//�ڵ��ֵ
 
        TrieNode()
        {
            num=1;
            son=new TrieNode[SIZE];
            isEnd=false;
        }
    }
 
//�����ֵ���
    public void insert(String str) //���ֵ����в���һ������
    {
        if(str==null||str.length()==0)
        {
            return;
        }
        TrieNode node=root;
        char[]letters=str.toCharArray();
        for(inti=0,len=str.length(); i<len; i++)
        {
            int pos=letters[i]-'a';
            if(node.son[pos]==null)
            {
                node.son[pos]=newTrieNode();
                node.son[pos].val=letters[i];
            }
            else
            {
                node.son[pos].num++;
            }
            node=node.son[pos];
        }
        node.isEnd=true;
    }
 
//���㵥��ǰ׺������
    public int countPrefix(Stringprefix)
    {
        if(prefix==null||prefix.length()==0)
        {
            return-1;
        }
        TrieNode node=root;
        char[]letters=prefix.toCharArray();
        for(inti=0,len=prefix.length(); i<len; i++)
        {
            int pos=letters[i]-'a';
            if(node.son[pos]==null)
            {
                return 0;
            }
            else
            {
                node=node.son[pos];
            }
        }
        return node.num;
    }
//��ӡָ��ǰ׺�ĵ���
    public String hasPrefix(String prefix)
    {
        if (prefix == null || prefix.length() == 0)
        {
            return null;
        }
        TrieNode node = root;
        char[] letters = prefix.toCharArray();
        for (int i = 0, len = prefix.length(); i < len; i++)
        {
            int pos = letters[i] - 'a';
            if (node.son[pos] == null)
            {
                return null;
            }
            else
            {
                node = node.son[pos];
            }
        }
        preTraverse(node, prefix);
        return null;
    }
// ���������˽ڵ�ĵ���.
    public void preTraverse(TrieNode node, String prefix)
    {
        if (!node.isEnd)
        {
for (TrieNode child : node.son)
            {
                if (child!=null)
                {
                    preTraverse(child, prefix+child.val);
                }
            }
            return;
        }
        System.out.println(prefix);
    }
 
 
//���ֵ����в���һ����ȫƥ��ĵ���.
    public boolean has(Stringstr)
    {
        if(str==null||str.length()==0)
        {
            return false;
        }
        TrieNode node=root;
        char[]letters=str.toCharArray();
        for(inti=0,len=str.length(); i<len; i++)
        {
            intpos=letters[i]-'a';
            if(node.son[pos]!=null)
            {
                node=node.son[pos];
            }
            else
            {
                return false;
            }
        }
        return node.isEnd;
    }
 
//ǰ������ֵ���.
    public void preTraverse(TrieNodenode)
    {
        if(node!=null)
        {
            System.out.print(node.val+"-");
for(TrieNodechild:node.son)
            {
                preTraverse(child);
            }
        }
    }
 
    public TrieNode getRoot()
    {
        return this.root;
    }
 
    public static void main(String[]args)
    {
        Trietree=newTrie();
        String[]strs= {"banana","band","bee","absolute","acm",};
        String[]prefix= {"ba","b","band","abc",};
for(Stringstr:strs)
        {
            tree.insert(str);
        }
        System.out.println(tree.has("abc"));
        tree.preTraverse(tree.getRoot());
        System.out.println();
//tree.printAllWords();
for(Stringpre:prefix)
        {
            int num=tree.countPrefix(pre);
            System.out.println(pre+""+num);
        }
    }
}