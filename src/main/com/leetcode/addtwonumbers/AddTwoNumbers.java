package com.leetcode.addtwonumbers;


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode toReturnResult = result;

        int addedValue=0;
        Integer carryOver=null;

        ListNode li=l1;
        ListNode lj=l2;
        while(li!=null && lj!=null) {
//            System.out.println("li.val=" + li.val );
//            System.out.println("lj.val=" + lj.val );

            if(carryOver!=null) {
                addedValue = li.val + lj.val + carryOver.intValue();
            }
            else {
                addedValue = li.val + lj.val;
            }

            if(addedValue >= 10) {
                carryOver = addedValue / 10;
                addedValue = addedValue - 10;
            }
            else {
                carryOver = null;
            }

            if(result==null) {
                result = new ListNode(addedValue);
                if(toReturnResult==null) {
                    toReturnResult = result;
                }
            }
            else {
                result.next = new ListNode(addedValue);
            }
            li = li.next;
            lj = lj.next;

            if(result.next!=null) {
                result = result.next;
            }
        }

        while(li!=null) {
            if(carryOver!=null) {
                addedValue = li.val + carryOver.intValue();
            }
            else {
                addedValue = li.val;
            }

            if(addedValue >= 10) {
                carryOver = addedValue / 10;
                addedValue = addedValue - 10;
            }
            else {
                carryOver = null;
            }

            result.next = new ListNode(addedValue);
            li = li.next;
            if(result.next!=null) {
                result = result.next;
            }
        }

        while(lj!=null) {
            if(carryOver!=null) {
                addedValue = lj.val + carryOver.intValue();
            }
            else {
                addedValue = lj.val;
            }

            if(addedValue >= 10) {
                carryOver = addedValue / 10;
                addedValue = addedValue - 10;
            }
            else {
                carryOver = null;
            }

            result.next = new ListNode(addedValue);
            lj = lj.next;
            if(result.next!=null) {
                result = result.next;
            }
        }

        if(carryOver!=null) {
            result.next = new ListNode(carryOver.intValue());
        }

        return toReturnResult;
    }
}
