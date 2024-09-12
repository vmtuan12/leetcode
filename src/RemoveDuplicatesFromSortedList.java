// https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

public class RemoveDuplicatesFromSortedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode result = head;
        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);


    }
}
