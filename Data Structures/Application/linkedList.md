
```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
```



### Common Techniques

#### Fast & Slow Pointers
1. Finding Middle Node
2. Has Cycle


### Important Formula

```
    RIGHT ROTATION
    
    len = length of linkedList
    k = Number of Rotations
    
    pos = len - k % len - 1
    
```


### Solutions

#### 1. Find Middle Node in Linked List

```java
public ListNode middleNode(ListNode head) {
    ListNode fast = head, slow = head;
    if(head!=null)
    {
        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    return null;
}
```

#### 2. Merge 2 Sorted Linked List 

##### insertSort Approach
```java
public ListNode insertSort(int d, ListNode head) {
    ListNode n = new ListNode(d);

    ListNode curr = head;

    if (curr == null || curr.val > d) {
        n.next = head;
        head = n;
    }
    else {
        while (curr.next != null && curr.next.val < n.val) {
            curr = curr.next;
        }
        n.next = curr.next;
        curr.next = n;
    }
    return head;
}

public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    
    while (l2 != null) {
        l1 = insertSort(l2.val,l1);
        l2 = l2.next;
    }
    return l1;
}
```

##### Recursive Approach
```java
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if(l1 == null) return l2; 
    if(l2 == null) return l1; 
      
    if(l1.val < l2.val)  
    { 
        l1.next = mergeTwoLists(l1.next, l2); 
        return l1; 
    } 
    else 
    { 
        l2.next = mergeTwoLists(l1, l2.next); 
        return l2; 
    } 
}
```

#### 3. Rotate Right
```java
public ListNode rotateRight(ListNode head, int k) {
    if(head == null || k == 0) return head;
    
    int len = 1;
    ListNode temp = head;
    while(temp.next!=null) {
        len++;
        temp = temp.next;
    }
    if(len == 1 || n % len == 0) return head;
    ListNode last = temp;
    last.next = head;
    
    int pos = len - k % len - 1;
    
    temp = head;
    for(int i=0; i<pos; i++)
        temp = temp.next;
    ListNode newHead = temp.next;
    ListNode newlast = temp;
    newlast.next = null;
    
    return newHead;
}
```

#### 4. Has Cycle
```java
public boolean hasCycle(ListNode head) {
    ListNode slow_p = head, fast_p = head; 
    
    while (slow_p != null && fast_p != null && fast_p.next != null) { 
        slow_p = slow_p.next; 
        fast_p = fast_p.next.next; 
        if (slow_p == fast_p) { 
            return true; 
        } 
    }
    
    return false; 
}
```

#### 5. Intersection of Two LinkedLists

```java
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {    
    ListNode pA = headA, pB = headB;
    
    while(pA!=pB)
    {
        pA = (pA != null) ? pA.next : headB;
        pB = (pB != null) ? pB.next : headA;
    }
    return pA;
}
```

#### 6. Partitioning of LinkedList by Value

```java
public ListNode partition(ListNode head, int x) {
    
    ListNode beforeHead = null, afterHead = null;
    ListNode before = null, after = null;
    
    ListNode temp = head;
    while(temp!=null)
    {
        if(temp.val<x)
            if(beforeHead==null)
            { beforeHead = temp; before = beforeHead; }
            else {
                before.next = temp;
                before = before.next;
            }
        else
            if(afterHead==null) 
            { afterHead = temp; after = afterHead; }
            else
            {
                after.next = temp;
                after = after.next;
            }
        temp = temp.next;
    }
    if(before!=null&&after!=null)
    {
        before.next = afterHead;
        after.next = null;
        return beforeHead;
    }
    return head;
}
```