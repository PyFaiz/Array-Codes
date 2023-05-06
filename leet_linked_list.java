//https://leetcode.com/problems/add-two-numbers/description/

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
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 = converter(l1);
        int num2 = converter(l2);
        ListNode start=null,prev=null,fresh;
        
        String s1 = "";
        char r;
        num1 =  num1 + num2;
        s1 = Integer.toString(num1);
        //System.out.println(s1);
        for(int i=s1.length()-1; i>=0; i--){
            r = s1.charAt(i);
            int num3=Character.getNumericValue(r);
            fresh = new ListNode(num3);
            if(start==null)
            start=fresh;
        else
            prev.next=fresh;
            prev=fresh;
        } 
        return start;
    }
    public int converter(ListNode temp){
        String n1="";
        String n2="";
        char r;
        int num;
        while(temp!=null){
            n1 += temp.val;
            temp = temp.next;
        }
        for(int i=0; i<n1.length(); i++){
            r = n1.charAt(i);
            n2 = r+n2;
        }
        num = Integer.parseInt(n2);
        return num;
    }
}
