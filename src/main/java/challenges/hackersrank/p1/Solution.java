package challenges.hackersrank.p1;

import java.util.*;
import java.util.stream.Collectors;

/**
 * User: rgordeev
 * Date: 03.03.16
 * Time: 13:17
 */
public class Solution {

    /*public void moveZeroes(int[] nums) {

        if (nums == null || nums.length <= 1)
            return;

        for (int i = 0; i < nums.length - 1; i++)
        {
            if (nums[i] == 0)
            {
                for (int j = i + 1; j < nums.length; j++)
                {
                    if (nums[j] != 0)
                    {
                        int tmp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = tmp;
                        break;
                    }
                }
            }
        }
    }*/

    public class ListNode
    {
             int val;
             ListNode next;
             ListNode(int x) { val = x; }
    }

    public ListNode oddEvenList(ListNode head)
    {
        if (head == null) return null;

        ListNode oddh = head;
        ListNode evenh = head.next;
        ListNode tmp = evenh;

        if (evenh == null) return head;

        if (evenh.next == null) return head;

        while (oddh.next != null && evenh.next != null)
        {
            oddh.next = evenh.next;
            oddh = oddh.next;
            evenh.next = oddh.next;
            evenh = evenh.next;
        }

        oddh.next = tmp;
        return head;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        if (l1 != null && l2 == null) return l1;
        if (l1 == null && l2 != null) return l2;

        ListNode result = l1.val <= l2.val ? l1 : l2;
        ListNode head = result;

        if (l1.val <= l2.val)
            l1 = l1.next;
        else
            l2 = l2.next;

        while (l1 != null && l2 != null)
        {
            if (l1.val <= l2.val) {
                result.next = l1;
                l1 = l1.next;
            }
            else
            {
                result.next = l2;
                l2 = l2.next;
            }
            result = result.next;
        }

        if (l1 == null)
            result.next = l2;
        else
            result.next = l1;

        return head;
    }

    public static void main(String[] args)
    {
        //moveZeroes(new int[]{0, 1, 0, 3, 12});
    }

     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }


    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        if (root != null)
        {
            String value = String.format("%d", root.val);
            List<String> left = binaryTreePaths(root.left).stream().map(v -> String.format("%s->%s", value, v)).collect(Collectors.toList());
            List<String> right = binaryTreePaths(root.right).stream().map(v -> String.format("%s->%s", value, v)).collect(Collectors.toList());
            if (left.isEmpty() && right.isEmpty())
                result.add(value);
            result.addAll(left);
            result.addAll(right);
        }
        return result;
    }
}
