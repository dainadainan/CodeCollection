package LeetCode;

/**
 * @Author: dainan
 * @Date: 2018/7/17 19:44
 * @Description:
 */
public class twoNumAdd {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode re = new ListNode((l1.val + l2.val) % 10);
        /**进位**/
        int value = (l1.val + l2.val) / 10;
        ListNode pre = re;

        while(l1.next != null || l2.next != null){
            l1 = l1.next;
            l2 = l2.next;
            /**l1为空**/
            if(l1 == null){
                l1 = new ListNode(0);
            }
            /**l2为空**/
            if(l2 == null){
                l2 = new ListNode(0);
            }
            ListNode temp = new ListNode((l1.val + l2.val + value) % 10 );
            value = (l1.val + l2.val + value)/10;
            pre.next = temp;
            pre = pre.next;
        }
        if(l1.next != null && l2.next != null && value > 0){
            ListNode temp = new ListNode(value);
            pre.next = temp;
        }
        return re;
    }
    public  static  void main(String[] args){
        ListNode t1 = new ListNode(1);
        ListNode t2 = new ListNode(9);
        t2.next = new ListNode(9);
        new twoNumAdd().addTwoNumbers(t1,t2);
    }
}
