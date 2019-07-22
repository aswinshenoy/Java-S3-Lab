#### 1. Task Scheduler

```java
public int leastInterval(char[] tasks, int n) {
        
        int[] map = new int[26];
        for(char c: tasks)
            map[c-'A']++;
        
        
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: map)
            if(i>0) 
                queue.add(i);
        
        int t = 0;
        while(!queue.isEmpty())
        {
            int i = 0;
            List<Integer> leftOut = new ArrayList();
            
            while(i<=n)
            {
             
                if(!queue.isEmpty())  
                    if(queue.peek() > 1)
                        leftOut.add(queue.poll() - 1);
                    else
                        queue.poll();

                t++;
                i++;
                
                if(queue.isEmpty() && leftOut.size() == 0)
                    break;
               
            }

            for(int task: leftOut)
                queue.add(task);
        }
        
        return t;   
    }
}
```

####  2. Kth Largest Element
```java
 public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> mHeap = new PriorityQueue<>(Collections.reverseOrder()); 
        for(int i: nums)
            mHeap.add(i);
        for(int i=1; i<k; i++)
            mHeap.poll();
        return mHeap.peek();
    }
}
```


####  3. Frequency Sorting

##### Method 1

```java
 public String frequencySort(String s) {
    Map<Character, Integer> map = new HashMap<>();
    // for(char c: s.toCharArray())
    //     if(map.containsKey(c))
    //         map.put(c,map.get(c)+1);
    //     else map.putIfAbsent(c,1);
    for(char c: s.toCharArray())
        map.put(c,map.getOrDefault(c, 0) + 1);
    
    PriorityQueue<Map.Entry<Character, Integer>> mHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
    
    // Set<Map.Entry<Character,Integer>> mapSet = map.entrySet(); 
    // for(Map.Entry<Character, Integer> i: mapSet)
    //     mHeap.add(i);
    
    mHeap.addAll(map.entrySet());
    
    StringBuilder str = new StringBuilder();
    while(!mHeap.isEmpty())
    {
        Map.Entry<Character,Integer> m = mHeap.poll();
        for(int i=0; i<m.getValue(); i++)
            str.append(m.getKey());
    }
    return str.toString();
}
```

##### Method 2 (More Efficient)

```java
public String frequencySort(String s) {
    if(s.length()<2 || s==null) return s;
    
    Map<Character, Integer> map = new HashMap<>();
    for(char c : s.toCharArray()) 
        map.compute(c, (k, v) -> { v = v==null ? 0 : v; return v +1;});

    PriorityQueue<Character> mHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

    mHeap.addAll(map.keySet());
    
    StringBuilder str = new StringBuilder();
    while(!mHeap.isEmpty())
    {
        char c = mHeap.poll();
        for(int i=0; i<map.get(c); i++)
            str.append(c);
    }
    return str.toString();
}
```

