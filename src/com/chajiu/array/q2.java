package com.chajiu.array;

import java.util.List;

//  Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


/**
 * @link https://leetcode-cn.com/problems/add-two-numbers/
 * 最后的进位很容易忘
 */
public class q2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode point = l3;
        int ci = 0;
        while (l1 != null || l2 != null) {

            int val;
            //新建两个变量存不同情况的数字
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;

            val = n1 + n2 + ci;

            //取余很妙
            point.next = new ListNode(val%10);
            point = point.next;

            //进位可以从整除中得来
            ci=val/10;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }


        }

        if (ci == 1) {
            point.next = new ListNode(1);
        }
        return l3.next;
    }

    public static void main(String[] args) {

    }
}
