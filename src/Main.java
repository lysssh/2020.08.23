import java.util.*;

//class Consume {
//    public int b;
//    public int c;
//    public Consume(int b,int c) {
//        this.b=b;
//        this.c=c;
//    }
//}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int w=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            LinkedList<Integer> linkedList=new LinkedList<>();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<n;i++) {
                while (!linkedList.isEmpty()&&arr[linkedList.peekLast()]<=arr[i]) {
                    linkedList.pollLast();
                }
                linkedList.offerLast(i);
                while (linkedList.peekFirst()<=i-w) {
                    linkedList.pollFirst();
                }
                if (i-w>=-1) {
                    list.add(arr[linkedList.peekFirst()]);
                }
            }
            for (int a : list) {
                System.out.print(a+" ");
            }
        }
    }
    public static int maxPathSum (TreeNode root) {
        // write code here
        if(root==null) {
            return 0;
        }
        int left=maxPathSum(root.left);
        int right=maxPathSum(root.right);
        return Math.max(left,right)+root.val;
    }
    public int maxProfit (int[] prices) {
        // write code here
        if(prices.length<=1) {
            return 0;
        }
        int[] db=new int[prices.length];
        int sum=prices[0];
        for(int i=1;i<db.length;i++) {
            db[i]=prices[i]-sum;
            sum=Math.min(sum,prices[i]);
        }
        Arrays.sort(db);
        return Math.max(db[db.length-1],0);
    }
    public static ArrayList<ArrayList<Integer>> arrayLists=new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> pathSum (TreeNode root, int sum) {
       if(root==null) {
           return arrayLists;
       }
       ArrayList<Integer> arrayList=new ArrayList<>();
       pathSum(root,sum,arrayList);
       return arrayLists;
    }
    public static void pathSum(TreeNode root, int sum,ArrayList<Integer> arrayList) {
        arrayList.add(root.val);
        if(sum-root.val==0&&root.left==null&&root.right==null) {
            arrayLists.add(new ArrayList<>(arrayList));
            return;
        }

        if(root.left!=null) {
            pathSum(root.left,sum-root.val,arrayList);
        }
        if(root.right!=null) {
            pathSum(root.right,sum-root.val,arrayList);
        }
    }
}

//    public static int LastRemaining_Solution(int n, int m) {
//        int[] arr=new int[n];
//        int siz1=n;
//        m--;
//        for(int i=0;i<n;i++) {
//            arr[i]=1;
//        }
//        while (siz1!=1) {
//            int temp=m%siz1;
//            for(int i=0;i<n;i++) {
//                if(arr[i]==1) {
//                    temp--;
//                }
//                if(temp==0) {
//                    arr[i]=0;
//                    break;
//                }
//            }
//            siz1--;
//        }
//        for(int i=0;i<n;i++) {
//            if(arr[i]==1) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}
//import java.util.Scanner;
//
///**
// * @author liye
// * @create 2020-06-26-18:59
// */
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while (sc.hasNext()) {
//            String string=sc.nextLine();
//            StringBuilder str=new StringBuilder("");
//            int length=0;
//            for(int i=0;i<string.length();i++) {
//                while (i<string.length()&&string.charAt(i)>='0'&&string.charAt(i)<='9') {
//                    str.append(string.charAt(i));
//                    i++;
//                }
//                if(str.length()>(2*length)) {
//                    str.delete(0,length);
//                    length=str.length();
//                }else {
//                    str.delete(length,str.length());
//                }
//            }
//            System.out.println(str.toString());
//        }
//    }
//}
//class TreeNode {
//    int val = 0;
//    TreeNode left = null;
//    TreeNode right = null;
//
//    public TreeNode(int val) {
//        this.val = val;
//
//    }
//
//}
//public class Main {
//    private static List<TreeNode> list=new ArrayList<>();
//    public static void main(String[] args) {
//
//    }
//    public static TreeNode KthNode(TreeNode pRoot, int k) {
//        if(pRoot==null||k<=0||list.size()<k) {
//            return null;
//        }
//        func(pRoot);
//        return list.get(k-1);
//    }
//    public static void func(TreeNode root) {
//        if(root==null) {
//            return;
//        }
//        func(root.left);
//        list.add(root);
//        func(root.right);
//    }
//    public class Solution {
//        ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
//            ArrayList<ArrayList<Integer>> arrayLists=new ArrayList<>();
//            ArrayList<Integer> arrayList=new ArrayList<Integer>();
//            LinkedList<TreeNode> linkedList=new LinkedList<TreeNode>();
//            if(pRoot==null) {
//                return arrayLists;
//            }
//            linkedList.add(pRoot);
//            int now=1;
//            int next=0;
//            while (!linkedList.isEmpty()) {
//                TreeNode root=linkedList.remove();
//                arrayList.add(root.val);
//                now--;
//                if(root.left!=null) {
//                    linkedList.add(root.left);
//                    next++;
//                }
//                if(root.right!=null) {
//                    linkedList.add(root.right);
//                    next++;
//                }
//                if(now==0) {
//                    arrayLists.add(new ArrayList<Integer>(arrayList));
//                    arrayList.clear();
//                    now=next;
//                    next=0;
//                }
//            }
//            return arrayLists;
//        }
//    }
//}
